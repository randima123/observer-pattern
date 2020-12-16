import java.util.List;

public class WeatherData {

    private List<DisplayDevice> displayDeviceList;
    private Property property;

    public WeatherData() {
    }

    public WeatherData(Property property) {
        this.property = property;
    }



    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public List<DisplayDevice> getDisplayDeviceList() {
        return displayDeviceList;
    }

    public void setDisplayDeviceList(List<DisplayDevice> displayDeviceList) {
        this.displayDeviceList = displayDeviceList;
    }

    public void remove(DisplayDevice displayDevice){
        this.displayDeviceList.remove(displayDevice);
    }

    public void add(DisplayDevice displayDevice){
        this.displayDeviceList.add(displayDevice);
    }

    public void notifyDevices(){
        try{
            List<DisplayDevice> list = this.getDisplayDeviceList();
            for (DisplayDevice device:list) {
                device.update(this.getProperty());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
