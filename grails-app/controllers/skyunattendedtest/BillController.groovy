package skyunattendedtest

class BillController {

  BillService billService

  /**
   * Fetches the customer bill via the bill service and returns it to
   * the index view to be rendered
   */
  def index() {
    [bill: billService.fetchBill('http://safe-plains-5453.herokuapp.com/bill.json')]
  }

}
