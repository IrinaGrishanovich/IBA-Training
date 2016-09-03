package shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static final double TAX = 0.2; //Переменная final может быть установлена только однажды
    private final String CART_NAME;
    private List<RealItem> realItems;
    private List<VirtualItem> virtualItems;
    private double total;
    private double weight;
    private double sizeOnDisk;
    private double price;

    public Cart(String cartName) {
        CART_NAME = cartName;
        realItems = new ArrayList<>();
        virtualItems = new ArrayList<>();
    }

    public String getCartName() {
        return CART_NAME;
    }

    public void addRealItem(RealItem item) {
        realItems.add(item);
        total += item.getPrice() + item.getPrice()*TAX;
    }

    public void deleteRealItem(RealItem item) {
        realItems.remove(item);
    }

    public void addVirtualItem(VirtualItem item) {
        virtualItems.add(item);
        total += item.getPrice() + item.getPrice()*TAX;
    }

    public void deleteVirtualItem(VirtualItem item) {
        virtualItems.remove(item);
    }

    public void showItems() {
        for (RealItem item : realItems) {
            System.out.println(item);
        }
        for (VirtualItem item : virtualItems) {
            System.out.println(item);
        }
    }

    public double getTotalPrice() {
        return total;
    }

    public double getWeight() {
        for (RealItem item : realItems) {
            weight = item.getWeight(weight);
        }
        return weight;
    }

    public double getSizeOnDisk() {
        for (VirtualItem item : virtualItems) {
            sizeOnDisk = item.getSizeOnDisk();
        }
        return sizeOnDisk;
    }

    public double getRealItemPrice() {
        for (RealItem item : realItems) {
            price = item.getPrice();
        }
        return price;
    }

    public double getVirtualItemPrice() {
        for (VirtualItem item : virtualItems) {
            price = item.getPrice();
        }
        return price;
    }
}
