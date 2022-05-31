<?php
require_once('Car.php');
class UberPool extends Car{
    public $brand;
    public $model;

    public function __construct($license, $driver){
        //Esto es el super de php la herencia de la clase padre
        parent::__construct($license, $driver, $brand, $model);
        $this -> brand = $brand;
        $this -> model = $model;
    }
}