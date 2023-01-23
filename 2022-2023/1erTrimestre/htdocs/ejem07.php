<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        if($_POST){
            $BotonValue = $_POST["envío"];
            switch($BotonValue){
                case 1: echo "Me has pulsado el boton".$BotonValue;
                break;
                case 2: echo "Me has pulsado el boton".$BotonValue;
                break;
                case 3: echo "Me has pulsado el boton".$BotonValue;
                break;
                default: echo "Error, boton no disponible";

            }
        }
        else{
            echo "Aun no me has enviado el formulario"; 
        }
    ?>
    <form action="ejem07.php" method="post">
        <input type="submit" name="envío" value="1">
        <input type="submit" name="envío" value="2">
        <input type="submit" name="envío" value="3">
    </form>




</body>
</html>