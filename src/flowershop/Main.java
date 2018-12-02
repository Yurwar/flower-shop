package flowershop;

public class Main {

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop(FlowerBase.getFlowersBase());
        FlowerShow.showFlowers(flowerShop.getFlowers());

        System.out.println("Floral flowers:");
        FlowerShow.showFloralPrice(flowerShop.searchByFloral());

        System.out.println("Hibiscus subspecies amount");
        FlowerShow.showSubspeciesAmount(flowerShop.searchByName("hibiscus"));

        System.out.println("Chamomile subspecies amount");
        FlowerShow.showSubspeciesAmount(flowerShop.searchByName("chamomile"));

        System.out.println("Chrysanthemum subspecies amount");
        FlowerShow.showSubspeciesAmount(flowerShop.searchByName("chrysanthemum"));

        System.out.println("toString() method:");
        System.out.println(flowerShop.getFlowers()[0].toString());


    }
}
