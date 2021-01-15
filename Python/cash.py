from payment import Payment


class Cash(Payment):
    ammount = str

    def __init__(self, ammount):
        self.ammount = ammount
