package skyunattendedtest

import grails.test.mixin.integration.Integration
import grails.transaction.*

import spock.lang.*
import geb.spock.*

/**
 * Tests for the Sky bill page
 */
@Integration
class BillSpec extends GebSpec {

  void 'Test that the page title is correct'() {
    when: 'The bill page is visited'
    go '/'

    then: 'The title is correct'
    $('title').text() == 'Sky Bill'
  }

  @Unroll('Test that the #collapsedPanelId panel starts collapsed')
  void 'Test that the panels start collapsed'() {
    when: 'The bill page is visited'
    go '/'

    then: 'The panel exists'
    $("#$collapsedPanelId")

    and: 'The panel is collapsed'
    $("#$collapsedPanelId").hasClass('collapse')
    !$("#$collapsedPanelId").hasClass('in')

    where:
    collapsedPanelId << ['packages', 'calls', 'store']
  }

  @Unroll('Test that the #panelToExpandId panel expands')
  void 'Test that the panels expand'() {
    given: 'We are on the bill page'
    go '/'

    when: 'The panel title is clicked'
    $("#$panelId h3.panel-title a").click()

    then: 'The panel expands'
    waitFor { $("#$panelToExpandId").hasClass('in') }

    where:
    panelId         | panelToExpandId
    'packagesPanel' | 'packages'
    'callsPanel'    | 'calls'
    'storePanel'    | 'store'
  }

}
