package Java;

class Card extends Payment {
    String numberCard;
    String dateCard;
    String cvv;

    public Card(String numberCard, String dateCard, String cvv) {
        this.numberCard = numberCard;
        this.dateCard = dateCard;
        this.cvv = cvv;
    }
}