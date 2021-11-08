package Day12_exercise;

import java.util.ArrayList;
import java.util.List;

public class HyndaicustomerInfo {
    //we need to store the customer details of the hyundai showroom. use encapsulation to get and set the customer details
    //To use encapsulation.declare all variables private and use getter nad setter.
    //we are using getter and setter to make the private variables accessible by outside world

    private String name;
    private String State;
    private String City;
    private String CarModel;

    //we want to add two phonenubers of a single customer
    private List<String> phoneNumbers = new ArrayList<String>();

    //parameterized Constructor

    public HyndaicustomerInfo(String name, String State, String City, String CarModel, List<String> phoneNumbers)
    {
        this.name=name;
        this.State=State;
        this.City=City;
        this.CarModel=CarModel;
        this.phoneNumbers=phoneNumbers;
    }

    //getter, setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter, setter for state
    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    //getter, setter for city
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    //getter, setter for carmodel
    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    //getter setter for phonenumbers
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

}
