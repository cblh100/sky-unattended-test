package skyunattendedtest

import java.text.DecimalFormat

class SkyTagLib {
  static defaultEncodeAs = [taglib: 'html']
  static namespace = 'sky'
  def formatDate = { attrs, body ->
    out << Date.parse('yyyy-MM-dd', attrs.date).format('d MMM yyyy')
  }

  def formatAmount = { attrs, body ->
    out << DecimalFormat.getCurrencyInstance(Locale.UK).format(attrs.amount)
  }

}
