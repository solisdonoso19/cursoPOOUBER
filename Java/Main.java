class Main {
    public static void main(String[] args) {
        //Declarando el objeto y el constructor (aqui le estamos pasando las variables indispensables para el objeto declarada en el constructor)
        Car car = new Car("ADS123", new Account("Carlos Solis", "CD1112")); //Objeto ya vivo en memoria
        //utilizando parametros de la clase car dentro del objeto
        car.passegenger = 4;
        //imprimiendo llamando al metodo dentro de la clase Car
        car.printDataCar();

        //Declarando otro objeto con la clase car
        Car car2 = new Car("CU1221", new Account("Solis Donoso", "JAS122"));
        car2.passegenger = 2;
        car2.printDataCar();
    }
}