from payment import Payment


class Card(Payment):
    numberCard = str
    dateCard = str
    cvv = str

    def __init__(self, numberCard, dateCard, cvv):
        self.numberCard = numberCard
        self.dateCard = dateCard
        self.cvv = cvv
