public class Car {

    String modelName;
    double mileage;

    public Car (String modelName, double mileage){
        this.modelName = modelName;
        this.mileage = mileage;

    }

    @Deprecated
    public void printDetails(){
        System.out.println("Nome auto: "+ modelName + " Chilometri: "+ mileage);
    }

    public void getCarDetails(){
        System.out.println("Dettagli auto: ");
        System.out.println("Nome auto: "+ modelName);
        System.out.println("Chilometri auto: "+ mileage);

    }

}