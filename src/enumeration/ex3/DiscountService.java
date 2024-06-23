package enumeration.ex3;

public class DiscountService {
    public int discount(Grade Grade, int price) {
        int discountPercent = 0;

        // 참조값 비교
        if (Grade == Grade.BASIC) {
            discountPercent = 10;
        } else if (Grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (Grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
