<%@ include file="/WEB-INF/views/header.jsp" %>

<section ng-controller="PrincipalController as ctrl">
	<h3>Bares</h3>
	<div class="row">
	   <div class="col-lg-4 col-md-6" ng-repeat="local in locales">
		  <div class="panel b">
			 <div class="panel-heading">
				<div class="pull-right">
				   <div class="label bg-info estado" ng-show="{{local.estado}}">abierto</div>
				   <div class="label bg-gray-dark estado" ng-show="{{!local.estado}}">cerrado</div>
				</div>
				<h4 class="m0">{{local.nombre}}</h4>
			 </div>
			 <h5 class="m0">Telefono : {{local.telefono}}</h5>
			 <h5 class="m0">Direccion : {{local.direccion}}</h5>
			 <img src="img/{{local.direccionImg}}" class="img-responsive" style="width: 100%">
			 <br><br>
			 <div class="panel-footer text-center" ng-show="{{user.tipo == 'Dueno'}}">
				<button type="button" class="btn btn-default">Entrar</button>
			 	<br><br>
			 </div>
		  </div>
	   </div>
	</div>
</section>
<%@ include file="/WEB-INF/views/footer.jsp" %>