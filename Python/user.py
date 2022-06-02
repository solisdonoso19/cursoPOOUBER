from account import Account

class driver(Account):
    id = int
    name = str
    document = str
    email = str
    password = str

    def __init__(id, name, document, email, password):
        super().__init__(id, name, document, email, password)