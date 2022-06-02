import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
        //super representa a la clase padre
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    //aplicando el concepto de polimorfismo
    @Override
    public void setPassenger(Integer passegenger) {
        if(passegenger == 6){
            this.passegenger = passegenger;
        }else{
            System.out.println("Necesitas mas pasajeros");
        }
    }
}