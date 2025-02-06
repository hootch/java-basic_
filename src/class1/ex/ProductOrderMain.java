package class1.ex;
import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주문의 개수 입력");
        int n = scanner.nextInt();
        scanner.nextLine();



        ProductOrder[] orders = new ProductOrder[n];

        for (int i=0; i < orders.length; i++) {
            System.out.println( i + "번째 주문 정보를 입력");
            System.out.println("상품명");
            String name =  scanner.nextLine();
            System.out.println("가격");
            int price =  scanner.nextInt();
            scanner.nextLine();
            System.out.println("수량");
            int quantity =  scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(name, price, quantity);
        }
//        orders[0] = createOrder("두부", 2000, 2);
//        orders[1] = createOrder("김치", 5000, 1);
//        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);

        System.out.println("totla price : " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order: orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }
}
