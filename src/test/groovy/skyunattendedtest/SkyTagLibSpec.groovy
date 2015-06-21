package skyunattendedtest

import grails.test.mixin.TestFor
import org.grails.taglib.GrailsTagException
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Tests the formatting of the {@link SkyTagLib}
 */
@TestFor(SkyTagLib)
class SkyTagLibSpec extends Specification {

  void 'Test the date is formatted correctly'() {
    expect:
    applyTemplate('<sky:formatDate date="2015-01-20" />') == '20 Jan 2015'
  }

  void 'Test the date format throws exception when no date supplied'() {
    when: 'No date is supplied'
    applyTemplate('<sky:formatDate />')

    then: 'A null pointer is thrown'
    def e = thrown(GrailsTagException)
    e.cause.class == NullPointerException
  }

  @Unroll( 'Test the amount of #inputAmount is formatted correctly' )
  void 'Test the amount is formatted correctly'() {
    when:
    String result = applyTemplate('<sky:formatAmount amount="${amount}" />', [amount:inputAmount])

    then:
    formatedAmount == result

    where:
    inputAmount | formatedAmount
    0           | '&pound;0.00'
    1           | '&pound;1.00'
    1.2         | '&pound;1.20'
    1.23        | '&pound;1.23'
  }

}
