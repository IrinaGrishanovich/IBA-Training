package shop;

public class RealItem extends Item {

    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight(double weight) {
        return this.weight;
    }

    public double doudleWeight(double weight) {
        this.weight = weight * 2;
        return this.weight;
    }

    @Override
    public String toString() {
        return super.toString() + "Weight: " + weight;
    }
}
