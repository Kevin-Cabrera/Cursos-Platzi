package Java;

public class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("ABC123", new Account("Pepe", "123456"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("EFG789", new Account("Alex", "1357911"));
        uberVan.setPassenger(6);

    }
}
