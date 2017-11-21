<%@ include file="/WEB-INF/views/header.jsp" %>

<section ng-controller="PrincipalController as ctrl">
	<h3><strong>Bares</strong></h3>
	<div class="row" ng-show="!localSelected">
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
				<button type="button" class="btn btn-default" ng-click="ctrl.setSelected(local)">Entrar</button>
			 	<br><br>
			 </div>
		  </div>
	   </div>
	</div>
	<div class="card mb-3" ng-show="localSelected">
		<div class="card-header">
			<h4>{{localSelect.nombre}}</h4>
		</div>
        <div class="list-group list-group-flush small">
			<a class="list-group-item list-group-item-action" ng-repeat="stock in localSelect.productos">
	        	<div class="media">
	            	<img class="d-flex mr-3 rounded-circle img-responsive" src="img/{{stock.producto.imagen}}" style="width: 20%">
	                <div class="media-body">
	                	<h3>{{stock.producto.descripcion}}</h3>
	                	<strong>Stock Total: </strong>
	                	<div class="progress">
						  <div class="progress-bar progress-bar-{{stock.criticidadStockTotal}}" role="progressbar" aria-valuenow="{{stock.porcentajeTotal}}"
						  		aria-valuemin="0" aria-valuemax="100" style="width:{{stock.porcentajeTotal}}%">
						    {{stock.porcentajeTotal}}%
						  </div>
						</div>
	                	<strong>Stock en Heladeras: </strong>
	                	<div class="progress">
						  <div class="progress-bar progress-bar-{{stock.criticidadStockHeladera}}" role="progressbar" aria-valuenow="{{stock.porcentajeHeladeras}}"
						  		aria-valuemin="0" aria-valuemax="100" style="width:{{stock.porcentajeHeladeras}}%">
						    {{stock.porcentajeHeladeras}}%
						  </div>
						</div>
						<strong>Stock en Deposito: </strong>
						<div class="progress">
						  <div class="progress-bar progress-bar-{{stock.criticidadStockDeposito}}" role="progressbar" aria-valuenow="{{stock.porcentajeDepositos}}"
						  		aria-valuemin="0" aria-valuemax="100" style="width:{{stock.porcentajeDepositos}}%">
						    {{stock.porcentajeDepositos}}%
						  </div>
						</div>
						<div>
							<strong>Peso: {{stock.producto.peso}} kg</strong>
							<strong>Precio: $ {{stock.producto.precio}} .-</strong>
						</div>
	              	</div>
	            </div>
            </a>
	   </div>
   	   <button type="button" class="btn btn-primary text-center" ng-click="ctrl.generarOC()">Generar Orden de Compra</button>
	</div>
	<div class="modal fade" id="ordenDeCompra" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Orden de Compra</h5>
	        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">×</span>
	        </button>
	      </div>
	      <div class="modal-body">
	      	<p><strong>Fecha de envio:</strong> {{ordenCompra.fecha | date : 'dd/MM/yyyy'}}</p>
	        <h4><strong>Lista de pedidos</strong></h4>
            <table id="items" width="100%" cellspacing="0">
              <thead>
                <tr>
                  <th>Producto</th>
                  <th>Cantidad</th>
                  <th>Proveedor</th>
                  <th>E-mail</th>
                </tr>
              </thead>
              <tbody>
                <tr ng-repeat="i in ordenCompra.item">
                  <td>{{i.producto.descripcion}}</td>
                  <td>{{i.cantidadAPedir}}</td>
                  <td>{{i.producto.proveedor}}</td>
                  <td>{{i.producto.emailProveedor}}</td>
                </tr>
              </tbody>
            </table>
           </div>
    	</div>
	    <div class="modal-footer">
	      <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancelar</button>
	      <button class="btn btn-primary" type="button" data-dismiss="modal">Confirmar</button>
	    </div>
    	</div>
  	</div>
</section>
<%@ include file="/WEB-INF/views/footer.jsp" %>