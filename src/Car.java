
public class Car {

    String modelName;
    int mileage;

    public Car(String modelName, int mileage) {
        this.modelName = modelName;
        this.mileage = mileage;
    }
@SuppressWarnings("DeprecatedIsStillUsed")
@Deprecated
    public void printCarDetails() {
    System.out.println( this.modelName + " " + this.mileage);
    }

    public void getCarDetails(){
        System.out.println("Model name: " + this.modelName + "\nMile age: " + this.mileage);
    }


}
