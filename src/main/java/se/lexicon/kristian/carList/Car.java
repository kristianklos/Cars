package se.lexicon.kristian.carList;

public class Car {
    private static int carCount = 0;
    //fields
    private int carID;
    private String carModel;
    private String carYear;
    private String carColor;
    private int carEngine;
    private boolean ready;
    private boolean canDrive;


    public Car(String carModel, String carYear, String carColor, int carEngine) {
        this();

        this.setCarModel(carModel);
        this.setCarYear(carYear);
        this.setCarColor(carColor);

        this.setCarEngine(carEngine);
    }


    private Car() {
        canDrive = false;
        ready = false;
        carID = carCount++;
    }

    //printing out the carlist
    public void checking() {
        System.out.println(carID + ".Model:\t" + carModel + "\tColor:\t" + carColor + " \tYear:\t" + carYear);
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

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    private boolean checkCarModel() {
        return true;
    }

    //Color
    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void carColor(String carColor) {

    }


    //Year
    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    private boolean checking(String carYear) {
        return checkCarModel();
    }


    //Engine
    public int getCarEngine() {

        return carEngine;
    }

    public int setCarEngine(int carEngine) {
        return carEngine;
    }


    public void checkEngine() {
        if (carEngine >= 0) {
            this.canDrive = false;
            if (carEngine == 1) {
                this.canDrive = true;
            }


        }

    }

    //isReady
    public boolean isReady() {
        return true;
    }
}






