package skyunattendedtest

import grails.test.mixin.TestFor
import groovy.json.JsonSlurper
import spock.lang.Specification

/**
 * Unit tests for the {@link BillController}
 */
@TestFor(BillController)
class BillControllerSpec extends Specification {

  private static final String DUMMY_BILL = '''
{
  "statement": {
    "generated": "2015-01-11",
    "due": "2015-01-25",
    "period": {
      "from": "2015-01-26",
      "to": "2015-02-25"
    }
  },
  "total": 136.03,
  "package": {
    "subscriptions": [
      { "type": "tv", "name": "Variety with Movies HD", "cost": 50.00 },
      { "type": "talk", "name": "Sky Talk Anytime", "cost": 5.00 },
      { "type": "broadband", "name": "Fibre Unlimited", "cost": 16.40 }
    ],
    "total": 71.40
  },
  "callCharges": {
    "calls": [
      { "called": "07716393769", "duration": "00:23:03", "cost": 2.13 },
      { "called": "07716393769", "duration": "00:23:03", "cost": 2.13 }
    ],
    "total": 59.64
  },
  "skyStore": {
    "rentals": [
      { "title": "50 Shades of Grey", "cost": 4.99 }
    ],
    "buyAndKeep": [
      { "title": "That's what she said", "cost": 9.99 },
      { "title": "Broke back mountain", "cost": 9.99 }
    ],
    "total": 24.97
  }
}
            '''

  void 'Test index returns correct model'() {
    given:
    controller.billService = Mock(BillService) {
      fetchBill(_) >> { String url ->
        new JsonSlurper().parseText( DUMMY_BILL )
      }
    }
    when:
    def result = controller.index()

    then:
    result.bill == new JsonSlurper().parseText( DUMMY_BILL )

  }
}
