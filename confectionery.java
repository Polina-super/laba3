package laba3;

public abstract  class confectionery {
    private String type;
    private String color;
    private double weight;
    String description = "confectionery";

    public String getDescription() {
        return description;
    }



    public void confectionery(String type,  String color, double weight) {
        this.type = type;
        this.color = color;
        this.setWeight(weight);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract double cost();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

            this.weight = weight;


    }

    public String toString() {
        return "Тип изделия - " + type + ". Цвет - " + color + ". Размер - " + getWeight();
    }

    public Object Description() {
        System.out.println(toString() + "");
        return null;
    }


}
