from payment import Payment

class Paypal(Payment):
    email = str
    
    def __init__(self, id):
        super().__init__(id)
        self.email = email