<?php
$name = $_POST['name'];
$email = $_POST['email'];
$phone = $_POST['telephone'];
$website = $_POST['website'];
$priority = $_POST['priority'];
$asunto = $_POST['asunto'];
$message = $_POST['message'];
$formcontent=" De: $name \n Telefono: $phone \n Website: $website \n Prioridad: $priority \n Asunto: $asunto \n Mensaje: $message";
$recipient = "info@tudominio.com";
$subject = "Nuevo contacto de Sitio web";
$mailheader = "From: $email \r\n";
mail($recipient, $subject, $formcontent, $mailheader) or die("Error!");
echo "Gracias" . " " . "<meta http-equiv='refresh' content='3;URL=http://www.efren-martinez.me' />
<link rel='stylesheet' type='text/css' href='style.css' />
<!-- incluimos nuestro mensaje de agradecimiento -->
<body>
<h2>Me comunicare con usted lo antes posible. ahora sera redireccionado a la pagina principal. Muchas Gracias.</h2>
</body>";
?>