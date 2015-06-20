package skyunattendedtest

import groovy.json.JsonSlurper

class BillService {

  /**
   * Calls the given URL and returns Map of the data
   *
   * @param url The url to fetch the bill from
   * @return A Map representing the parsed JSON
   */
  def fetchBill(String url) {
    new JsonSlurper().parseText(callService(url))
  }

  String callService(String url) {
    new URL(url).text
  }


}
