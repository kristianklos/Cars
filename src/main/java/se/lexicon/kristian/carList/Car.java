package se.lexicon.kristian.carList;

public class Car {
    private static int carCount = 0;
    //fields
    private int carID;
    private String carModel;
    private String carYear;
    private String carColor;
    private int carEngine;
    private boolean canDrive;


    public Car(String carModel, String carYear, String carColor, int carEngine) {
        this();

        this.setCarModel(carModel);
        this.setCarColor(carColor);
        this.setCarYear(carYear);
        this.setCarEngine(carEngine);
    }


    private Car() {
        canDrive = false;
        boolean ready = false;
        carID = carCount++;
    }

    //printing out the carlist
    public void checking() {
        System.out.println(carID + ". Model:\t" + carModel + "\tColor:\t " + carColor + " \tYear:\t" + carYear + "\tEngine installed:\t" + (canDrive ? "Yes" : "No") );
    }


    //Getters & setters

    //ID
    public int getCarID(){
        return carID;
    }


    //Model
    public String getCarModel() {
        return carModel;
    }

    private void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    private boolean checkCarModel() {
        return true;
    }


    //Color
    public String getCarColor() {
        return carColor;
    }

    private void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void carColor(String carColor) {

    }


    //Year
    public String getCarYear() {
        return carYear;
    }

    private void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    private boolean checking(String carYear) {
        return checkCarModel();
    }


    //Engine
    public int getCarEngine() {
        return carEngine;
    }

    private void setCarEngine(int carEngine) {
        if (carEngine == 1){
            this.canDrive = true;
        }
    }

    public void checkEngine() {

    }



    //isReady
    public boolean isReady() {
        return true;
    }
}






