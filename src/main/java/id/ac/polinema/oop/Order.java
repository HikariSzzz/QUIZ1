package id.ac.polinema.oop;

public class Order {
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

    public Order (Customer customer){
        this.customer = customer;
        this.items = new OrderItem[20];
        this.itemCount = 0;
    }

    public Customer getcustomer(){
        return customer;
    }

    public void addOrderItem(OrderItem item) {
        if (itemCount >= items.length) {
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getSubtotal();
        }
        return total;
    }
}

