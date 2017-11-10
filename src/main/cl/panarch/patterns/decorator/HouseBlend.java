package cl.panarch.patterns.decorator;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        setDescription("HouseBlend");
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
