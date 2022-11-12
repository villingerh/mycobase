package functional.mandatory

import spock.lang.*

// test environment
import functional.CommonFunctions.EnvironmentSetup

@Narrative('''Contributors need access to their entries and therefore they have a role and profile assigned.
''')
@Title('Role Contributor  ')
class RoleContributorSpec extends Specification {

  @PendingFeature
  def "Contributor has a profile"() {
    given: 'The Mycobase is configured with a contributor'
    when: 'The contributor logs in'
    then: 'Contributor profile is visible'
    assert false
  }
  @PendingFeature
  def "Contributor can access own entries"() {
    given: 'The Mycobase is configured with a contributor'
    and: 'The contributor has already created entries'
    when: 'The contributor logs in'
    then: 'The contributor can access his entries'
    assert false
  }
  @PendingFeature
  def "Contributor can create entries"() {
    given: 'The Mycobase is configured with a contributor'
    when: 'The contributor logs in'
    then: 'The contributor can create entries'
    assert false
  }
    
}
