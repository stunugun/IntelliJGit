public class carClass {

    String carModel;
    String carColor;
    String carCapacity;

    @Override
    public String toString() {
        return "carClass{" +
                "carModel='" + carModel + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carCapacity='" + carCapacity + '\'' +
                '}';
    }

    public carClass(String carModel, String carColor, String carCapacity) {
        this.carModel = carModel;
        this.carColor = carColor;
        this.carCapacity = carCapacity;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(String carCapacity) {
        this.carCapacity = carCapacity;
    }
}
