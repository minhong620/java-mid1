package enumeration.ref1;

public class DiscountService {
    
    public int discount(ClassGrade classGrade, int price) {
        // inline variable 단축키(ctrl + alt +n)으로 합치기
        int discountPercent = classGrade.getDiscountPercent();
        return price * discountPercent / 100;
    }
}
