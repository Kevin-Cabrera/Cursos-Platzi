<?php
require_once('Payment.php');
class PayPal extends Payment{
    public $email;
    public $password;

    public function __construct($email, $password){
        $this->$email = $email;
        $this->$password = $password;
    }
}

?>