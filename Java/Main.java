class Main {
    public static void main(String[] args) {
        //Declarando el objeto y el constructor (aqui le estamos pasando las variables indispensables para el objeto declarada en el constructor)
        Car UberX = new UberX("ADS123", new Account(12,"Carlos Solis", "CD1112", "solisdonoso@gmail.com", "1234"), "BMW", "X3"); //Objeto ya vivo en memoria
        //utilizando parametros de la clase car dentro del objeto
       UberX.setPassenger(4);
        //imprimiendo llamando al metodo dentro de la clase Car
       UberX.printDataCar();

       Car UberVan = new UberVan("ADS123", new Account(12,"Carlos Solis", "CD1112", "solisdonoso@gmail.com", "1234"), null, null); //Objeto ya vivo en memoria
       UberVan.setPassenger(6); 
       UberVan.printDataCar();
        //Declarando otro objeto con la clase car
       /* Car car2 = new Car("CU1221", new Account("Solis Donoso", "JAS122"));
        car2.passegenger = 2;
        car2.printDataCar();*/
    }
}