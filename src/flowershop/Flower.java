package flowershop;

public class Flower {
    private int id;
    private String name;
    private String type;
    private String species;
    private String subspecies;
    private double price;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString() {
        String res = String.format("%-3s", this.id) +
                String.format("%-10s", this.name) +
                String.format("%-15s", this.type) +
                String.format("%-20s", this.species) +
                String.format("%-30s", this.subspecies) +
                String.format("%-15s", this.price) +
                String.format("%-5s", this.amount);
        return res;
    }
}
