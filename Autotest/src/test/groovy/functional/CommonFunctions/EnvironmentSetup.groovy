package functional.CommonFunctions

class EnvironmentSetup {

    static boolean testDebug = setTestDebug()
    static boolean getTestDebug() {
        return testDebug
    }
    static boolean setTestDebug() {
        String environmentVar = 'TEST_DEBUG'
        if (null == System.getenv(environmentVar)) {
            testDebug = System.getProperty('testDebug')
        } else {
            testDebug = System.getenv(environmentVar)
        }
        return testDebug
    }

}
