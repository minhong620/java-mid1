package lang.string.chaining;

public class ValueAdder {
    public int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this; // 자신의 참조값을 반환
    }

    public int getValue() {
        return value;
    }
}
