package skyunattendedtest

class FormatBillDateTagLib {
  static defaultEncodeAs = [taglib: 'html']
  static namespace = 'sky'
  def formatBillDate = { attrs, body ->
    out << Date.parse('yyyy-MM-dd', attrs.date).format('d MMM yyyy')
  }

}
