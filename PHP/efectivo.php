<?php
require_once('Payment.php');

class Efectivo extends Payment{

    public function __construct($id){
        parent::__construct($id);

    }
}