package skyunattendedtest

import grails.test.mixin.TestFor
import org.grails.taglib.GrailsTagException
import spock.lang.Specification

/**
 * Tests the formatting of the {@link FormatBillDateTagLib}
 */
@TestFor(FormatBillDateTagLib)
class FormatBillDateTagLibSpec extends Specification {

  void 'Test the date is formatted correctly'() {
    expect:
    applyTemplate('<sky:formatBillDate date="2015-01-20" />') == '20 Jan 2015'
  }

  void 'Test the date format throws exception when no date supplied'() {
    when: 'No date is supplied'
    applyTemplate('<sky:formatBillDate />')

    then: 'A null pointer is thrown'
    def e = thrown(GrailsTagException)
    e.cause.class == NullPointerException
  }

}
