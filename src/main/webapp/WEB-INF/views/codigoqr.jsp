<%@ include file="/WEB-INF/views/header.jsp" %>
<section ng-controller="PrincipalController as ctrl">
	<h3>Hola {{user.nombre}}! Presenta este codigo en la caja para sumar puntos!</h3>
	<div>
		<qrcode data="{{user.id}}" size="250"></qrcode>
	</div>
</section>
<%@ include file="/WEB-INF/views/footer.jsp" %>