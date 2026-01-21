package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueProject(){
        return price * quantity;
    }

    public void addProducts(int addQuantity){
        quantity += addQuantity;
    }

    public void removeProducts(int removeQuantity){
        quantity -= removeQuantity;
    }

    @Override
    public String toString(){
        return "Product data. " + name + ", $" + price + ", " + quantity + " units. Total: $" + totalValueProject();
    }
}
