<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="esS">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
<link href="css/bootstrapValidator.min.css" rel="stylesheet">

<link href="css/bootstrap-datepicker.css" rel="stylesheet">

<link href="css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrapValidator.min.css" rel="stylesheet">


<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>

<script type="text/javascript" src="js/bootstrap-datepicker.min.js"></script>


<script type="text/javascript" src="sweetalert/sweetalert.min.js"></script>




<div class="container">

	<!-- Consulta Por Precio -->
	<div class="container">

		<label class="label-item">Precio Desde</label>
		 <input type="text"
			class="form-control" placeholder="Ingrese Precio Desde"> 
		<label
			class="label-item">Precio Hasta</label> 
		<input type="text"
			class="form-control" placeholder="Ingrese Precio Hasta">

	</div>



	<h3 align="center">Lista Viajess</h3>
	<button type="button" data-toggle='modal' class='btn btn-primary'
		id="validateBtnw2" onclick="mostrarVentana()">Nuevo Viajes</button>
	<br>&nbsp;<br>
	<div id="divEmpleado">
		<table id="id_table_viaje" class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Id</th>
					<th>Conductor</th>
					<th>Placa</th>
					<th>Cantidad</th>
					<th>Precio</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>

	</div>
</div>


<title>Viajes</title>
<style>
.modal-header, h4, .close {
	background-color: #286090;
	color: white !important;
	text-align: center;
	font-size: 20px;
}

.btn-warning, .btn-info {
	width: 100px;
}

.btn-danger, .btn-primary {
	width: 160px;
}
</style>
</head>
<body>

	<div class="alert alert-success alert-dismissible">
		<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
		<strong>Mensaje : </strong>
	</div>


	<div class="container">
		<form id="idRegistra" accept-charset="UTF-8" action="saveViaje"
			class="form-horizontal" method="post" data-toggle="validator"
			role="form">
			<input type="hidden" id="idViaje" name="codigo">

			<div class="panel-group" id="steps">
				<!-- Step 1 -->
				<div class="panel panel-default">
					<div class="panel-heading"
						style="text-align: center; font-size: 14px"></div>
					<div class="panel-body">
						<div class="form-group">
							<label class="col-lg-3 control-label" for="id_reg_nombre">Conductor</label>
							<div class="col-lg-5">
								<input class="form-control" id="idConductor"
									name="viaje.conductor" placeholder="Ingrese el Conductor" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label" for="id_reg_nombre">Placa</label>
							<div class="col-lg-5">
								<input class="form-control" id="idPlaca" name="viaje.placa"
									placeholder="Ingrese Placa" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label" for="id_reg_nombre">Cantidad</label>
							<div class="col-lg-5">
								<input class="form-control" id="idCantidad"
									name="viaje.cantidad" placeholder="Ingrese Cantidad" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label" for="id_reg_nombre">Precio</label>
							<div class="col-lg-5">
								<input class="form-control" id="idPrecio" name="viaje.precio"
									placeholder="Ingrese Precio" />
							</div>
						</div>
					</div>
					<div class="modal-footer"
						style="padding: 5px 20px; text-align: center">
						<button type="submit" class="btn btn-primary" id="validatetBtn">Registrar
							Viajes</button>
					</div>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript">
	function tablaViajes(){
		$("#id_table_viaje").DataTable().destroy();
		$("#id_table_viaje tbody").empty(); 
		$.getJSON("listAllViajes",{}, function (response){
			$.each(response.listaViajes, function(index, item){
				var editar='<button type="button" class="btn btn-info" onclick="editarViajes('+item.codigo+')">Editar</button>';
			    var eliminar='<button type="button" class="btn btn-warning" onclick="eliminarViajes('+item.codigo+')">Eliminar</button>';
			    
				$("#id_table_viaje").append("<tr><td>"+item.id+"</td>"+
												  "<td>"+item.conductor+"</td>"+
												  "<td>"+item.placa+"</td>"+
												  "<td>"+item.cantidad+"</td>"+
												  "<td>"+item.precio+"</td>")
												  
			});
			$("#id_table_viaje").DataTable().draw();
			$("#id_table_viaje").DataTable();
		});
	};

	
	
	function grabarViajes(){
		
		var validator = $('#idRegistra').data('bootstrapValidator');
        validator.validate();
        if (validator.isValid()) {
			var json,cod,nom,pat,mat,sex,hij,sue,dir,dis;
			cod=$("#idViaje").val();		
			nom=$("#idConductor").val();
			pat=$("#idPlaca").val();
			mat=$("#idCantidad").val();
			sex=$("#idPrecio").val();
			

			json=JSON.stringify({id:cod,conductor:nom,placa:pat,cantidad:mat,precio:sex});
			
			console.log(json);
			swal({
				  title: "Seguro de Guardar datos : ",
				  text: "",
				  icon: "warning",
				  buttons: true,
				  dangerMode: true,
				})
				.then((willSave) => {
				  if (willSave) {
					  $.ajax({
							url:  'saveViaje',
							type: 'POST',
							data: {JSONViajes:json},
							success:function(data){
								console.log(data);
								if(data.dataMensaje==1){
									console.log(data);
									swal("Registro Guardado correctamente...","","success");
									tablaViajes();
									$("#idModalRegistra").modal("hide");
									$('#idRegistra').data('bootstrapValidator').resetForm(true);
				   			    	$('#idRegistra').trigger("reset");
								}
								else
									swal("Error al guardar el registro...","","error");
							},
							error: function (jqXhr) { // error callback 
								swal("Error ...","","error");
					    	}
						})	
				  } 
				})
        }		
	}
	
	
	
	function mostrarVentana(){
		$('#idRegistra').data('bootstrapValidator').resetForm(true);
		$('#idRegistra').trigger("reset");
		$("#idCodigo").val(0);		
		$("#idMensaje").text("Registrar Viajes");
		$("#validatetBtn").text("Registrar Viajes");
		$("#idModalRegistra").modal({show:true,keyboard:false,backdrop:'static'});
	}

</script>


	<script type="text/javascript">
$(document).ready(function() {
	//validar registra nuevo empleado
	$('#idRegistra').bootstrapValidator({
	    message: 'This value is not valid',
	    feedbackIcons: {
	        valid: 'glyphicon glyphicon-ok',
	        invalid: 'glyphicon glyphicon-remove',
	        validating: 'glyphicon glyphicon-refresh'
	    },
	    fields: {
	    	titulo: {
	    		
	    		selector:'#idTitulo',   
	            validators: {
	                notEmpty: {
	                    message: 'El campo Título es requerido. No puede estar vacio'
	                },
	                stringLength: {
	                    min: 3,
	                    max: 30,
	                    message: 'El titulo debe contener minimo 3 y maximo de 30 letras'
	                }
	            }
	        },
	        precio:{
	        	selector:'#idPrecio',   
	        	validators:{
	        		notEmpty: {
	                    message: 'El campo Precio es requerido. No puede estar vacio'
	                }
	        	}
	        }
	        
	        
	
	    }
	});

</script>


</body>
</html>



