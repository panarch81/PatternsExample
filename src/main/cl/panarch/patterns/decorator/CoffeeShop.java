package cl.panarch.patterns.decorator;


public class CoffeeShop {

    public static void main(String[] args){

        Beverage cafe1 = new DarkRoast();
        System.out.println(cafe1.getDescription() +" $"+ cafe1.getCost());

        Beverage darkRoastMochaWhip = new DarkRoast();
        darkRoastMochaWhip = new Mocha(darkRoastMochaWhip);
        darkRoastMochaWhip = new Whip(darkRoastMochaWhip);
        System.out.println(darkRoastMochaWhip.getDescription() + " $"+darkRoastMochaWhip.getCost());

        Beverage soyLatteWhip = new HouseBlend();
        soyLatteWhip = new Soy(soyLatteWhip);
        soyLatteWhip = new Whip(soyLatteWhip);
        System.out.println(soyLatteWhip.getDescription()+" $"+soyLatteWhip.getCost());

    }
}
