public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay (int maxLimit) {
        this.limit = maxLimit;
        this.value = 0;
    }

    public int getValue() { return value; }

    public void setValue(int newValue) {
        if (newValue > 0 && newValue < limit) {
            this.value = newValue;
        }
    }

    public String getDisplayValue() {
        String display = null;
        if (value > 9) {
            display = String.valueOf(value);
        } else if (value < 10) {
            display = "0" + value;
        }
        return display;
    }

    public void increment() {
        value++;
        if (value >= limit) {
            value = 0;
        }
    }
}
