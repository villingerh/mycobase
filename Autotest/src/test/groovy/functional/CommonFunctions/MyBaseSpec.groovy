package functional.CommonFunctions

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Base Class for Tests
 * This is BaseSpec annotation, which is used to identify base classes
 * applying to exlude them from test excution
 * by defining it in test/resource/SpockConfig.groovy
 */
@Target([ElementType.TYPE, ElementType.METHOD])
@Retention(RetentionPolicy.RUNTIME)
@interface MyBaseSpec {

}
