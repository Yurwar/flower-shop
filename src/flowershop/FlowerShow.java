package flowershop;

public class FlowerShow {
    public static void showFlowers(Flower[] flowers) {
        System.out.printf("%-3s%-10s%-15s%-20s%-30s%-15s%-5s\n", "id", "name", "type", "species", "subspecies", "price", "amount");
        for (Flower flower : flowers) {
            System.out.printf("%-3d", flower.getId());
            System.out.printf("%-10s", flower.getName());
            System.out.printf("%-15s", flower.getType());
            System.out.printf("%-20s", flower.getSpecies());
            System.out.printf("%-30s", flower.getSubspecies());
            System.out.printf("%-15f", flower.getPrice());
            System.out.printf("%-5d\n", flower.getAmount());
        }
    }
    public static void showFloralPrice(Flower[] flowers) {
        System.out.printf("%-10s%-15s%-30s%-15s\n", "name", "type", "subspecies", "price");
        for (Flower flower : flowers) {
            System.out.printf("%-10s", flower.getName());
            System.out.printf("%-15s", flower.getType());
            System.out.printf("%-30s", flower.getSubspecies());
            System.out.printf("%-15f\n", flower.getPrice());
        }
    }
    public static void showSubspeciesAmount(Flower[] flowers) {
        System.out.printf("%-10s%-30s%-5s\n", "name", "subspecies", "amount");
        for (Flower flower : flowers) {
            System.out.printf("%-10s", flower.getName());
            System.out.printf("%-30s", flower.getSubspecies());
            System.out.printf("%-5d\n", flower.getAmount());
        }
    }


}
