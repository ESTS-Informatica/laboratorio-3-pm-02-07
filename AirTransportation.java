public class AirTransportation extends Transport {

    private String name;
    private int numberOfContainers;

    public AirTransportation(String name, int numberOfContainers) {
     
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
public double getPriceWithFees() {
    return 0.2 * getPrice() * getNumberOfContainers() + 50;
}

public String getTransportType() {
    return "Aéreo";
}
@Override
public String toString() {
    return super.toString() + "\n" +
            "Tipo de Transporte: " + getTransportType() + "\n" +
            "Preço com Taxas: " + getPriceWithFees();
}


   
}
