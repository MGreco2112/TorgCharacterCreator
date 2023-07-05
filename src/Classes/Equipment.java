package Classes;

public class Equipment {
    private String name;
    private Integer value;
    private Integer axiom;
    private int[] range;

    public Equipment(String name, Integer value, Integer axiom, int[] range) {
        this.name = name;
        this.value = value;
        this.axiom = axiom;
        this.range = range;
    }

    public Equipment(String name, Integer axiom) {
        this.name = name;
        this.axiom = axiom;
    }

}
