<?php
require_once('Car.php');
require_once('uberX.php');
require_once('uberPool');
require_once('Account.php');

$uberX = new UberX("CU1123", new Account("Carlos Solis", "670403"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberX("CU1123", new Account("Ivan Donoso", "32423"), "Mazda", "CX-7");
$uberPool->printDataCar();