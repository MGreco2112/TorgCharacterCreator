package Classes;

public class Weapon extends Equipment {
    private Integer value;
    private int[] range;

    public Weapon(String name, Integer axiom, Integer value, int[] range) {
        super(name, axiom);
        this.value = value;
        this.range = range;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public int[] getRange() {
        return range;
    }

    public void setRange(int[] range) {
        this.range = range;
    }
}
