import functional.CommonFunctions.MyBaseSpec

runner {
    exclude MyBaseSpec
}

spockReports {
// Name of the implementation class(es) of report creator(s) to enable (separate multiple entries with commas)
// Currently supported classes are:
//   1. com.athaydes.spockframework.report.internal.HtmlReportCreator
//   2. com.athaydes.spockframework.report.template.TemplateReportCreator
set 'com.athaydes.spockframework.report.IReportCreator' : 'com.athaydes.spockframework.report.template.TemplateReportCreator'

// Set properties of the report creator
// For the HtmlReportCreator, the only properties available are
// (the location of the css files is relative to the classpath):
set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.featureReportCss' : 'spock-feature-report.css'
set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.summaryReportCss' : 'spock-summary-report.css'
set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.printThrowableStackTrace' : 'false'
set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.inlineCss' : true
set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.enabled' : true
// options are: "class_name_and_title", "class_name", "title"
set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.specSummaryNameOption' : 'class_name_and_title'

// exclude Specs Table of Contents
set 'com.athaydes.spockframework.report.internal.HtmlReportCreator.excludeToc' : false

// Output directory (where the spock reports will be created) - relative to working directory
set 'com.athaydes.spockframework.report.outputDir' : 'build/spock-reports'

// Output directory where to store the aggregated JSON report (used to support parallel builds)
// set 'com.athaydes.spockframework.report.aggregatedJsonReportDir' : ''

// If set to true, hides blocks which do not have any description
set 'com.athaydes.spockframework.report.hideEmptyBlocks' : false

// Set the name of the project under test so it can be displayed in the report
set 'com.athaydes.spockframework.report.projectName' : 'Subversion'

// Set the version of the project under test so it can be displayed in the report
set 'com.athaydes.spockframework.report.projectVersion' : '1.0'

// Show the source code for each block
set 'com.athaydes.spockframework.report.showCodeBlocks' : true

// Set the root location of the Spock test source code (only used if showCodeBlocks is 'true')
set 'com.athaydes.spockframework.report.testSourceRoots' : 'src/test/groovy'

// Set properties specific to the TemplateReportCreator
set 'com.athaydes.spockframework.report.template.TemplateReportCreator.specTemplateFile' : '/template/spec-template.md'
set 'com.athaydes.spockframework.report.template.TemplateReportCreator.reportFileExtension' : 'md'
set 'com.athaydes.spockframework.report.template.TemplateReportCreator.summaryTemplateFile' : '/template/summary-template.md'
set 'com.athaydes.spockframework.report.template.TemplateReportCreator.summaryFileName' : 'summary.md'
set 'com.athaydes.spockframework.report.template.TemplateReportCreator.enabled' : true

// # Set properties of the report creator
// set 'com.athaydes.spockframework.report.template.TemplateReportCreator.specTemplateFile' : '/mytemplate/xmlSpecTemplate.md'
// set 'com.athaydes.spockframework.report.template.TemplateReportCreator.reportFileExtension' : 'xml'
// set 'com.athaydes.spockframework.report.template.TemplateReportCreator.summaryTemplateFile' : '/mytemplate/summary-template.md'
// set 'com.athaydes.spockframework.report.template.TemplateReportCreator.summaryFileName' : 'summary.md'

// # Set properties of the report creator
// set 'com.athaydes.spockframework.report.template.TemplateReportCreator.showCodeBlocks' : true
}
