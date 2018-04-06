public class Human {
    private int weight;
    private int heigh;

    public Human(int weight, int heigh) {
        this.weight = weight;
        this.heigh = heigh;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", heigh=" + heigh +
                '}';
    }
}
