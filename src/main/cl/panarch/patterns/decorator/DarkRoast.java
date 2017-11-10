package cl.panarch.patterns.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        setDescription("DarkRoast");
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}
