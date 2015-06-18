package skyunattendedtest

import groovy.json.JsonSlurper

class BillService {

    def fetchBill(String url) {
        new JsonSlurper().parseText(callService(url))
    }

    String callService(String url) {
        new URL(url).text
    }


}
