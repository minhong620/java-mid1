package lang.immutable.change;

public class ImmutableObj {
    public final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    // 불변 객체 값은 변경하지 않으면서 기존 값에 새로운 값을 더하는 함수
    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
