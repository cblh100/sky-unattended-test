package skyunattendedtest

class BillController {

  BillService billService

  def index() {
    [bill: billService.fetchBill('http://safe-plains-5453.herokuapp.com/bill.json')]
  }

}
