<%@ include file="/WEB-INF/views/header.jsp" %>

<section ng-controller="PrincipalController as ctrl">
	<h3><strong>Promociones</strong></h3>
	<div class="row">
	   <div class="col-lg-4 col-md-6" ng-repeat="p in promociones">
		  <div class="panel b">
			 <div class="panel-heading">
				<h4 class="m0">{{p.nombre}}</h4>
			 </div>
			 <h5 class="m0">Puntos necesarios : {{p.puntos}}</h5>
			 <img src="{{p.urlImagen}}" class="img-responsive" style="width: 50%">
			 <br><br>
		  </div>
	   </div>
	</div>
</section>
<%@ include file="/WEB-INF/views/footer.jsp" %>