public class Property {

    public Property() {
    }

    public Property(double humidity, double temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
    }

    private double humidity;
    private double temperature;


    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Property{" +
                "humidity=" + humidity +
                ", temperature=" + temperature +
                '}';
    }
}
