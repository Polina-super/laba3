package laba3;

public class toy extends Decorator{
    confectionery confectionery;
    public toy (confectionery dishes) {
        this.confectionery = dishes;
    }

    public String getDescription(){
        return confectionery.description + " toy included ";
    }


    public double cost() {
        return 14 + confectionery.cost();
    }
}
