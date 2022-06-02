class Car{
    private Integer id;
    private String license;
    private Account driver;
    //concepto de encapsulamiento, estamos privando la variable de las demas clases
    protected Integer passegenger;

    //constructor de car
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    //metodo utilizado para imprimir las variables mediante el objeto
    void printDataCar(){
        if (passegenger != null) {
            System.out.println("License: " + "Name Driver: " + driver.name);
            System.out.println(passegenger);
        }
    }
    // concepto de getter y setters
    public Integer getPassengenger(){
        return passegenger;
    }

    public void setPassenger(Integer passegenger){
        if(passegenger == 4){
            this.passegenger = passegenger;
        }else{
            System.out.println("Necesitas mas pasajeros");
        }

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
    
}   