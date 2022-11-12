package functional.mandatory

import spock.lang.*

// test environment
import functional.CommonFunctions.EnvironmentSetup

@Narrative('''For Administrative tasks there needs to be an Admin Role.
''')
@Title('Role Admin')
class RoleAdminSpec extends Specification {

  @PendingFeature
  def "Admin has a Admin profile"() {
    given: 'The Mycobase is configured with'
    when: 'The admin logs in'
    then: 'Admin profile is accessible'
    assert false
  }
  @PendingFeature
  def "Admin can access all entries"() {
    given: 'The Mycobase is configured with a Admin'
    and: 'The Admin has already created entries'
    when: 'The Admin logs in'
    then: 'The Admin can access entries'
    assert false
  }
  @PendingFeature
  def "Admin can create entries"() {
    given: 'The Mycobase is configured with a Admin'
    when: 'The Admin logs in'
    then: 'The Admin can create entries'
    assert false
  }
    
}
