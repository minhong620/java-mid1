package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottonumbers = generator.generate();

        System.out.print("로또 번호: ");
        for (int lottonumber : lottonumbers) {
            System.out.print(lottonumber + " ");
        }
    }
}
