public class Van extends GroundTransportation {

    private int packages;

    public Van(String licensePlate, int packages) {
        super(licensePlate);
        this.packages = packages;
    }

    public int getPackages() {
        return packages;
    }

    public void setPackages(int packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Número de Pacotes: " + packages;
    }
}
