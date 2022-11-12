package functional.CommonFunctions

import functional.CommonFunctions.EnvironmentSetup

/**
 * Execute shell commands from strings
 *
 * This class can be used to execute shell commands from strings.
 * It is possible to have stdout and stderr joined in the output or have only the stdout.
 */
class RunShell {

  static boolean displayOutput = false
  static boolean stdErrJoined = true

  // Add a bash() method to GString and String
  static void enable() {
    GString.metaClass.bash = { ->
      RunShell.bash(delegate)
    }
    String.metaClass.bash = { ->
      RunShell.bash(delegate)
    }
  }

  static Map bash(cmd) {
    def String command = cmd as String
    def output = ''
    println(EnvironmentSetup.testDebug())
    if (EnvironmentSetup.testDebug()) {
      println("""
      execute shell : $cmd
      """)
    }
    // create a process for the shell
    ProcessBuilder pb = new ProcessBuilder('sh', '-c', command)
    pb.redirectErrorStream(stdErrJoined) // use this to capture messages sent to stderr
    Process shell = pb.start()
    shell.getOutputStream().close()
    InputStream shellIn = shell.getInputStream() // this captures the output from the command

    // at this point you can process the output issued by the command
    // for instance, this reads the output and writes it to System.out:
    output = shellIn.text
    if (displayOutput || EnvironmentSetup.testDebug()) {
      println(output)
    }

    // wait for the shell to finish and get the return code
    int shellExitStatus = shell.waitFor()

    // close the stream
    try {
      shellIn.close()
      pb = null
      shell = null
    } catch (IOException ignoreMe) {
      if (EnvironmentSetup.testDebug()) {
        println('caught exception')
      }
    }
    return [exitCode: shellExitStatus, output: output]
  }
}
