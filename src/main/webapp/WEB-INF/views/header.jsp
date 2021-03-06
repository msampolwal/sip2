<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>The Bar</title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin CSS-->
  <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
  <!-- Otros de Boostrap -->
  <link href="thebar/css/bt.css" rel="stylesheet">
  
  <style>
 	.estado {
   		padding: .2em .6em .3em;
  		border-radius: .25em;
  		font-weight: bold;
	} 
	.bg-gray-dark {
	    background-color: #3a3f51;
	    color: #fff !important;
	}
  </style>
</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top" ng-app="myApp">
  <!-- Navigation-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav" ng-controller="PrincipalController as ctrl">
    <a class="navbar-brand" href="index.html">SONOS</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
          <a class="nav-link" href="principal.htm">
          	<i class="fa fa-map-marker" aria-hidden="true"></i>
            <span class="nav-link-text">Bares</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Charts">
          <a class="nav-link" href="promociones.htm">
          	<i class="fa fa-beer" aria-hidden="true"></i>
            <span class="nav-link-text">Promociones</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="QR" ng-show="{{isLogged}}">
          <a class="nav-link" href="codigoqr.htm">
          	<i class="fa fa-qrcode" aria-hidden="true"></i>
            <span class="nav-link-text">Generar QR!</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="LogginInfo" ng-show="{{isLogged}}">
          <a class="nav-link" href="misdatos.htm">
            <i class="fa fa-user" aria-hidden="true"></i>
            <span class="nav-link-text">Informacion Personal</span>
          </a>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Tables" ng-show="{{user.tipo == 'Dueno'}}">
          <a class="nav-link" href="administrador.htm">
            <i class="fa fa-area-chart" aria-hidden="true"></i>
            <span class="nav-link-text">Estadisticas de Consumo</span>
          </a>
        </li>
      </ul>
      <ul class="navbar-nav sidenav-toggler">
        <li class="nav-item">
          <a class="nav-link text-center" id="sidenavToggler">
            <i class="fa fa-fw fa-angle-left"></i>
          </a>
        </li>
      </ul>
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link" href="login.htm" ng-show="{{!isLogged}}">
            <i class="fa fa-fw fa-sign-out"></i>Login</a>
          <a class="nav-link" ng-click="ctrl.logout()" ng-show="{{isLogged}}">
            <i class="fa fa-fw fa-sign-out"></i>Logout</a>
        </li>
      </ul>
    </div>
  </nav>
  <div class="content-wrapper" id="principal" style="display: none;">
    <div class="container-fluid">