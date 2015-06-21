
<div id="packagesPanel" class="panel panel-primary">
  <div class="panel-heading">
    <div class="row">
      <div class="col-xs-9">
        <h3 class="panel-title">
          <a  class="nounderline" data-toggle="collapse" href="#packages"><span
                  class="glyphicon glyphicon-menu-hamburger"></span> Packages</a>
        </h3>
      </div>
      <div class="col-xs-3"><h3 class="panel-title"><g:formatNumber number="${bill.package.total}" type="currency"
                                                                    currencySymbol="£"/></h3></div>
    </div>
  </div>

  <div id="packages" class="panel-collapse collapse">
    <div class="panel-body">
      <g:each in="${bill.package.subscriptions.sort{ a,b -> a.type <=> b.type }}" var="subscription">
        <div class="row">
          <div class="col-xs-9">${subscription.name}</div>
          <div class="col-xs-3"><g:formatNumber number="${subscription.cost}" type="currency"
                                                currencyCode="GBP"/></div>
        </div>
      </g:each>
    </div>
  </div>
</div>