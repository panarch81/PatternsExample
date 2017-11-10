package cl.panarch.patterns.decorator;

public abstract class Beverage {

    private String description = "Unkown Beverage";

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double getCost();
}

