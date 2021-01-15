<?php

    require_once("car.php");
    require_once("account.php");
    require_once("uberX.php");
    require_once("uberPool.php");

   $uberX = new UberX("ABC123", new Account("Pepe","123456"),"Chevrolet","Spark");
   $uberX->printDataCar();

   $uberPool = new UberPool("DEF456", new Account("RED","098765"),"Dodge","Attitude");
   $uberPool->printDataCar();
?>