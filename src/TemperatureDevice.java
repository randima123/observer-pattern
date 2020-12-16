public class TemperatureDevice implements DisplayDevice {

    private double temperature;

    @Override
    public void update(Property property) {
        this.temperature=property.getTemperature();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "TemperatureDevice{" +
                "temperature=" + temperature +
                '}';
    }
}
