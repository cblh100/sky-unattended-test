<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main"/>
  <title>Sky Bill</title>
</head>

<body>
<div class="container">

  <div class="page-header">
    <h1>Your Sky Bill</h1>
  </div>

  <div class="well">
    <div class="row">
      <div class="col-xs-4">
        <strong>Period:</strong>
      </div>
      <div class="col-xs-4">
        <strong>Due By:</strong>
      </div>
      <div class="col-xs-4">
        <strong>Created:</strong>
      </div>
    </div>
    <div class="row">
      <div class="col-xs-4">
        ${bill.statement.period.from} - ${bill.statement.period.to}
      </div>
      <div class="col-xs-4">
        ${bill.statement.due}
      </div>
      <div class="col-xs-4">
        ${bill.statement.generated}
      </div>
    </div>
  </div>

  <g:render template="packages"/>

  <g:render template="calls"/>

  <g:render template="store"/>

  <div class="well">
    <div class="row">
      <div class="col-xs-9">
        <h4>Total</h4>
      </div>
      <div class="col-xs-3">
        <h4>£${bill.total}</h4>
      </div>
    </div>
  </div>

</div>

</body>
</html>