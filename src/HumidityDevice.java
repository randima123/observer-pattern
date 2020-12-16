public class HumidityDevice implements DisplayDevice {

    private double humiduty;

    public double getHumiduty() {
        return humiduty;
    }

    public void setHumiduty(double humiduty) {
        this.humiduty = humiduty;
    }

    @Override
    public void update(Property property) {
        this.humiduty=property.getHumidity();
    }

    @Override
    public String toString() {
        return "HumidityDevice{" +
                "humiduty=" + humiduty +
                '}';
    }
}
