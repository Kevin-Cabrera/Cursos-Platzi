package Java;

class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if (license != null && passengers != null && driver.name != null) {
            System.out.println("License: " + license + " Driver Name: " + driver.name + " Passengers: " + passengers);
        } else {
            System.out.println("Error en los Datos");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPassenger() {
        return passengers;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passengers = passenger;
        } else {
            System.out.println("Necesitas al menos 4 pasajeros");
        }

    }
}
