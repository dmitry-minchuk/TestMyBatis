package Model;

import java.util.List;

public class User {
    private int id;
    private String name;
    private Tariff tariff;
    private List<Car> car;
    //private int tariff_id;              //this should not be here!!!

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public int getTariff_id() {
        return tariff_id;
    }

    public void setTariff_id(int tariff_id) {
        this.tariff_id = tariff_id;
    }
*/
}
