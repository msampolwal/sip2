<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="card mb-3">
  <div class="card-header">
    <i class="fa fa-area-chart"></i> Variacion consumo total por mes</div>
  <div class="card-body">
    <canvas id="myAreaChart" width="100%" height="30"></canvas>
  </div>
</div>
<div class="row">
  <div class="col-lg-8">
    <!-- Example Bar Chart Card-->
    <div class="card mb-3">
      <div class="card-header">
        <i class="fa fa-bar-chart"></i> Consumo ultima semana</div>
      <div class="card-body">
        <canvas id="myBarChart" width="100" height="50"></canvas>
      </div>
    </div>
  </div>
  <div class="col-lg-4">
    <!-- Example Pie Chart Card-->
    <div class="card mb-3">
      <div class="card-header">
        <i class="fa fa-pie-chart"></i> Consumo en Litros por hora por Local</div>
      <div class="card-body">
        <canvas id="myPieChart" width="100%" height="100"></canvas>
      </div>
    </div>
  </div>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
