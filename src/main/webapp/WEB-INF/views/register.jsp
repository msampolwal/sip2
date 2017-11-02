<%@ include file="/WEB-INF/views/loginHeader.jsp" %>
<div class="card-header">Register an Account</div>
<div class="card-body">
  <form ng-submit="ctrl.register()" name="myForm">
    <div class="form-group">
      <div class="form-row">
        <div class="col-md-6">
          <label for="exampleInputName">First name</label>
          <input ng-model="ctrl.user.nombre" name="nombre" class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" placeholder="Enter first name" required>
          <div class="has-error" ng-show="myForm.nombre.$dirty">
	           <span ng-show="myForm.nombre.$error.required">Campo requerido</span>
	       </div>
        </div>
        <div class="col-md-6">
          <label for="exampleInputLastName">Last name</label>
          <input ng-model="ctrl.user.apellido" name="nombre" class="form-control" id="exampleInputLastName" type="text" aria-describedby="nameHelp" placeholder="Enter last name" required>
          <div class="has-error" ng-show="myForm.apellido.$dirty">
	           <span ng-show="myForm.apellido.$error.required">Campo requerido</span>
	       </div>
        </div>
      </div>
    </div>
    <div class="form-group">
      <label for="exampleInputEmail1">Email address</label>
      <input ng-model="ctrl.user.email" name="email" class="form-control" id="exampleInputEmail1" type="email" aria-describedby="emailHelp" placeholder="Enter email" required>
      <div class="has-error" ng-show="myForm.email.$dirty">
           <span ng-show="myForm.email.$error.required">Campo requerido</span>
       </div>
    </div>
    <div class="form-group">
      <div class="form-row">
        <div class="col-md-6">
          <label for="exampleInputPassword1">Password</label>
          <input ng-model="ctrl.user.password" name="password" class="form-control" id="exampleInputPassword1" type="password" placeholder="Password" required>
          <div class="has-error" ng-show="myForm.password.$dirty">
	           <span ng-show="myForm.password.$error.required">Campo requerido</span>
	       </div>
        </div>
        <div class="col-md-6">
          <label for="exampleConfirmPassword">Confirm password</label>
          <input ng-model="ctrl.repass" name="repass" class="form-control" id="exampleConfirmPassword" type="password" placeholder="Confirm password" req>
       	  <div class="has-error" ng-show="myForm.repass.$dirty">
	      	<span ng-show="myForm.repass.$error.required">Campo requerido</span>
	      </div>
        </div>
      </div>
    </div>
    <input class="btn btn-primary btn-block" type="submit" ng-disabled="myForm.$invalid" value="Register"/>
  </form>
  <div class="text-center">
    <a class="d-block small mt-3" href="/theBar/">Login Page</a>
  </div>
</div>
<%@ include file="/WEB-INF/views/loginFooter.jsp" %>