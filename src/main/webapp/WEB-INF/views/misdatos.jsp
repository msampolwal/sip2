<%@ include file="/WEB-INF/views/header.jsp" %>
<section ng-controller="PrincipalController as ctrl">
	<div class="panel panel-default">
	  <div class="panel-heading"><h3>Mis Datos</h3></div>
	  <div class="panel-body">
	    <h4><strong>Nombre: </strong> {{user.nombre}}</h4>
	    <h4><strong>Apellido: </strong> {{user.apellido}}</h4>
	    <h4><strong>Email: </strong> {{user.email}}</h4>
	    <h4><strong>Puntos Acumulados: </strong> {{user.puntosAcumulados}}</h4>
	  </div>
	</div>
</section>
<%@ include file="/WEB-INF/views/footer.jsp" %>