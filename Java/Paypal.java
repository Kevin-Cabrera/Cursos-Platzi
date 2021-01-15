package Java;

class PayPal extends Payment {
    String email;
    String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }
}