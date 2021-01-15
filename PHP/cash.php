<?php
require_once('Payment.php');

class Cash extends Payment{
    public $ammount;

    public function __construct($ammount){
        $this->$ammount = $ammount;
    }
}

?>