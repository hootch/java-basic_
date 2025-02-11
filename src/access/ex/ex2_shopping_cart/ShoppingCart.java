package access.ex.ex2_shopping_cart;

public class ShoppingCart
{
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item)
    {
        if (itemCount >= items.length)
        {
            System.out.println("장바구니 꽉참");
            return;
        }
        items[itemCount++] = item;
    }

    public void displayItems()
    {
        int totalPrice = 0;
        for (Item i :  items)
        {
            if (i == null){break;}
            String name = i.getName();
            int pricePerItem = i.getPrice();
            int quantity = i.getQuantity();
            int price = quantity*pricePerItem;
            totalPrice+=price;
            System.out.println("name : " + name + ", Price : " +  price);
        }
        System.out.println("Total Price : " + totalPrice);
    }
}
