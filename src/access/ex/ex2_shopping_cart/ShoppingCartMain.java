package access.ex.ex2_shopping_cart;

public class ShoppingCartMain
{
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();

        Item i1 = new Item("마늘", 2000, 2);
        Item i2 = new Item("상추", 3000, 4);

        cart.addItem(i1);
        cart.addItem(i2);

        cart.displayItems();
    }
}
