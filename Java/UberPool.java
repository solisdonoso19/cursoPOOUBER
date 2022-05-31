//para heredar se debe extender la clase hija con la padre
class UberPool extends Car{
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){
        //super representa a la clase padre
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}