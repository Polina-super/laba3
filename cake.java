package laba3;

public class cake extends confectionery {
    private String filling;
    cake (String type,  String color, double weight, String filling) {
        super.confectionery(type, color, weight);
        this.setFilling(filling);
        description = "Cake";
    }

    public String getFilling() {
        return filling;
    }
    public void setFilling(String filling) {

            this.filling = filling;

    }
    public double cost() {
        return 33;
    }


    public Object Description() {
        System.out.println(toString() + ". начинка - " + filling);
        return null;
    }
}
