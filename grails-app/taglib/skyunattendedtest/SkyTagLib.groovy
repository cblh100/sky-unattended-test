package skyunattendedtest

import java.text.DecimalFormat

class SkyTagLib {
  static defaultEncodeAs = [taglib: 'html']
  static namespace = 'sky'

  /**
   * Formats a date string from yyyy-MM-dd to d MMM yyyy
   */
  def formatDate = { attrs, body ->
    out << Date.parse('yyyy-MM-dd', attrs.date).format('d MMM yyyy')
  }

  /**
   * Formats a number to a currency representation. i.e '1.2' -> '£1.20'
   */
  def formatAmount = { attrs, body ->
    out << DecimalFormat.getCurrencyInstance(Locale.UK).format(attrs.amount)
  }

}
