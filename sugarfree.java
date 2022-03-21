package laba3;

public class sugarfree extends Decorator{
    confectionery confectionery;
    public sugarfree(confectionery confectionery) {
        this.confectionery = confectionery;
    }


    public double cost() {
        return 74 + confectionery.cost();
    }

    public String getDescription() {
        return confectionery.description + " без сахара ";
    }
}
