//para heredar se debe extender la clase hija con la padre
class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        //super representa a la clase padre
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}