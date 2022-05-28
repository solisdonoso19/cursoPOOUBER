class Car{
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    //constructor de car
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    //metodo utilizado para imprimir las variables mediante el objeto
    void printDataCar(){
        System.out.println("License: " + "Name Driver: " + driver.name);
    }
}