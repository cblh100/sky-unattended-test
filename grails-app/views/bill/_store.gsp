<div id="storePanel" class="panel panel-primary">
  <div class="panel-heading">
    <div class="row">
      <div class="col-xs-9">
        <h3 class="panel-title">
          <a class="nounderline" data-toggle="collapse" href="#store"><span
                  class="glyphicon glyphicon-menu-hamburger"></span> Sky Store</a>
        </h3>
      </div>

      <div class="col-xs-3"><h3 class="panel-title"><sky:formatAmount amount="${bill.skyStore.total}"/></h3></div>
    </div>
  </div>

  <div id="store" class="panel-collapse collapse">
    <div class="panel-body">
      <h4>Rentals</h4>

      <g:each in="${bill.skyStore.rentals}" var="item">
        <div class="row">
          <div class="col-xs-9">${item.title}</div>

          <div class="col-xs-3"><sky:formatAmount amount="${item.cost}"/></div>
        </div>
      </g:each>

      <h4>Buy and Keep</h4>

      <g:each in="${bill.skyStore.buyAndKeep}" var="item">
        <div class="row">
          <div class="col-xs-9">${item.title}</div>

          <div class="col-xs-3"><sky:formatAmount amount="${item.cost}"/></div>
        </div>
      </g:each>
    </div>
  </div>
</div>