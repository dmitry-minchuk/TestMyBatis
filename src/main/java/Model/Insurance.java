package Model;

public class Insurance {
    private int id;
    private String cost;
    private String exp_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    @Override
    public String toString(){
        return " Insurance cost: " + cost + ", expiration date: " + exp_date;
    }
}
