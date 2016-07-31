package Model;

public class Car {
    private int id;
    private String model;
    private Insurance insurance;
    //private int insurance_id;       //this should not be here!!!
    //private int user_id;            //this should not be here!!!

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
/*
    public int getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(int insurance_id) {
        this.insurance_id = insurance_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
*/
    @Override
    public String toString(){
        return "Car Model is " + model + "," + insurance + "\n";
    }
}
