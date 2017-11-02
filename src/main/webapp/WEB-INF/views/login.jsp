<%@ include file="/WEB-INF/views/loginHeader.jsp" %>
<div class="card-header">Login</div>
<div class="card-body">
  <form ng-submit="ctrl.login()" name="myForm">
    <div class="form-group">
      <label for="exampleInputEmail1">Email address</label>
      <input ng-model="ctrl.user.email" name="email" class="email form-control" id="exampleInputEmail1" type="email" aria-describedby="emailHelp" placeholder="Enter email" required>
      <div class="has-error" ng-show="myForm.$dirty">
           <span ng-show="myForm.email.$error.required">Email requerido</span>
           <span ng-show="myForm.email.$invalid">Email invalido</span>
       </div>
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Password</label>
      <input ng-model="ctrl.user.password" name="password" class="password form-control" id="exampleInputPassword1" type="password" placeholder="Password" required>
      <div class="has-error" ng-show="myForm.password.$dirty">
          <span ng-show="myForm.password.$error.required">Password requerido</span>
      </div>
    </div>
    <input type="submit" class="btn btn-primary btn-block" ng-disabled="myForm.$invalid" value="Login">
  </form>
  <div class="text-center">
    <a class="d-block small mt-3" href="register.htm">Register an Account</a>
  </div>
</div>
<%@ include file="/WEB-INF/views/loginFooter.jsp" %>