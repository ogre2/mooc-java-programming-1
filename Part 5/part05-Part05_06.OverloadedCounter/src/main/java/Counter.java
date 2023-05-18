public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void increase(int amount) {
        if(amount > 1) {
            this.value = this.value + amount;
        } else {
            this.value = this.value + 0;
        }
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void decrease(int amount) {
        if(amount > 1) {
            this.value = this.value - amount;
        } else {
            this.value = this.value + 0;
        }
    }
}
