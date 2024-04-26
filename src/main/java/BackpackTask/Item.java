package BackpackTask;
//задача с рюкзаком
public class Item {
    private int weight;
    private int price;

    private int cost;

    public Item(int weight, int price, int cost) {
        this.weight = weight;
        this.price = price;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", price=" + price +
                ", cost=" + cost +
                '}';
    }
}