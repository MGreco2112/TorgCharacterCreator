package Classes;

public class Equipment {
    private String name;
    private Integer axiom;

    public Equipment(String name, Integer axiom) {
        this.name = name;
        this.axiom = axiom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAxiom() {
        return axiom;
    }

    public void setAxiom(Integer axiom) {
        this.axiom = axiom;
    }
}
