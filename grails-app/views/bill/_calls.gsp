<div id="callsPanel" class="panel panel-primary">
  <div class="panel-heading">
    <div class="row">
      <div class="col-xs-9">
        <h3 class="panel-title">
          <a class="nounderline" data-toggle="collapse" href="#calls"><span
                  class="glyphicon glyphicon-menu-hamburger"></span> Calls</a>
        </h3>
      </div>
      <div class="col-xs-3"><h3 class="panel-title"><g:formatNumber number="${bill.callCharges.total}" type="currency"
                                                                    currencyCode="GBP"/></h3></div>
    </div>
  </div>

  <div id="calls" class="panel-collapse collapse">
    <div class="panel-body">
      <div class="row">
        <div class="col-xs-4"><h5>Number</h5></div>
        <div class="col-xs-5"><h5>Duration</h5></div>
        <div class="col-xs-3"><h5>Cost</h5></div>
      </div>
      <g:each in="${bill.callCharges.calls}" var="callCharge">
        <div class="row">
          <div class="col-xs-4">${callCharge.called}</div>
          <div class="col-xs-5">${callCharge.duration}</div>
          <div class="col-xs-3"><g:formatNumber number="${callCharge.cost}" type="currency"
                                                currencyCode="GBP"/></div>
        </div>
      </g:each>
    </div>
  </div>
</div>