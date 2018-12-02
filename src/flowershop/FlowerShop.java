package flowershop;

import java.util.ArrayList;

public class FlowerShop {
    private Flower[] flowers;

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    FlowerShop(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Flower[] searchByFloral() {
        ArrayList<Flower> res = new ArrayList<Flower>();
        for(Flower flower : flowers) {
            if(flower.getType().equals("floral")) {
                res.add(flower);
            }
        }
        return res.toArray(new Flower[res.size()]);
    }

    public Flower[] searchByName(String flowerName) {
        ArrayList<Flower> res = new ArrayList<Flower>();
        for(Flower flower : flowers) {
            if(flower.getName().equals(flowerName)) {
                res.add(flower);
            }
        }
        return res.toArray(new Flower[res.size()]);
    }
}
