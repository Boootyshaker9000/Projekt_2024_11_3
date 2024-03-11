public abstract class Plant {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
