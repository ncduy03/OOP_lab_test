public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is already full");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
        if (qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i] == disc) {
                qtyOrdered--;
                System.out.println("The disc has been removed");
                for (int j = i + 1; j < qtyOrdered; j++){
                    itemsOrdered[j - 1] = itemsOrdered[j];
                }
                itemsOrdered[qtyOrdered] = null;
                return;
            }
        }
        System.out.println("Cannot find the item.");
    }
    
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}


