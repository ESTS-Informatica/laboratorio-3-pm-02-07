import java.util.HashSet;
import java.util.ArrayList;

public class ShippingCompany extends HashSet<Transport> {

    private String name;
    private ArrayList<Transport> inService = new ArrayList<>();

    public ShippingCompany(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transport> getInService() {
        return inService;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da Empresa: ").append(name).append("\n");
        sb.append("Transportes em Serviço:").append("\n");
        for (Transport transport : inService) {
            sb.append(transport).append("\n");
        }
        return sb.toString();
    }

    public void addTransport(Transport transport) {
        super.add(transport);
    }

    public Transport getTransport(String id) {
        for (Transport transport : this) {
            if (transport.getId().equals(id)) {
                return transport;
            }
        }
        return null;
    }

    public boolean makeTransportation(String id, String origin, String destination, double price) {
        Transport transport = getTransport(id);
        if (transport != null && transport.isAvailable()) {
            transport.setOrigin(origin);
            transport.setDestination(destination);
            transport.setPrice(price);
            transport.setAvailable(false);
            inService.add(transport);
            remove(transport);
            return true;
        }
        return false;
    }

    public void finalizeTransportation(String id) {
        Transport transport = findTransportInService(id);
        if (transport != null) {
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            inService.remove(transport);
            add(transport);
        }
    }

    private Transport findTransportInService(String id) {
        for (Transport transport : inService) {
            if (transport.getId().equals(id)) {
                return transport;
            }
        }
        return null;
    }
}
