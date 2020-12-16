import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //if state of humidity or temperature in weather object, display devices must change theri respective properties.

        //create weather property object
        Property property = new Property(12.3, 23.5);

        //set object to weather data object
        WeatherData weatherData = new WeatherData(property);
        List<DisplayDevice> deviceList = new ArrayList<>();
        TemperatureDevice temperatureDevice = new TemperatureDevice();
        HumidityDevice humidityDevice = new HumidityDevice();
        deviceList.add(temperatureDevice);
        deviceList.add(humidityDevice);
        weatherData.setDisplayDeviceList(deviceList);
        //notify to display devices
        weatherData.notifyDevices();
        System.out.println("Output: "+weatherData.getDisplayDeviceList());

        Property property2 = new Property(22.3, 33.5);
        weatherData.setProperty(property2);

        weatherData.notifyDevices();
        System.out.println("Output2: "+weatherData.getDisplayDeviceList());

        weatherData.remove(temperatureDevice);
        System.out.println("Output3: "+weatherData.getDisplayDeviceList());

        weatherData.add(temperatureDevice);
        System.out.println("Output4: "+weatherData.getDisplayDeviceList());

    }
}
