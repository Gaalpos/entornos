<?php
$num1=5;
$num2=6;

$sumar=$num1+ $num2;
echo "la suma es ".$sumar;
echo"</br>";
$restar=$num1- $num2;
echo "la resta es ".$restar;
echo"</br>";
$multiplicar=$num1*$num2;
echo "la multiplicacion es es ".$multiplicar;
echo"</br>";
$dividir=$num1/$num2;
echo "la multiplicacion es es ".$dividir;
echo"</br>";

 if($num1>$num2){
    echo "El Numero1 es mayor que el Numero2";
 }
 else{
    echo "El Numero1 es menor que el Numero2";
 }

 echo"</br>";

 if($num1>$num2 || $num1!=13){
    echo "El Numero1 es mayor que el Numero2";
 }
 else{
    echo "El Numero1 es menor que el Numero2";
 }

?>