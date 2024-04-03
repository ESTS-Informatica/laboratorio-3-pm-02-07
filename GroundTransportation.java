public class GroundTransportation extends Transport {

    private String licensePlate;

     GroundTransportation(String licensePlate){
 
            this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getPriceWithFees() {
    return 0.5 * getPrice()  + 10;
}
public String getTransportType() {
    return "Terrestre";
}

    @Override

public String toString() {
    return super.toString() + "\n" +
            "Tipo de Transporte: " + getTransportType() + "\n" +
            "Preço com Taxas: " + getPriceWithFees();
}

}
