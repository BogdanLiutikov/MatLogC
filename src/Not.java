import java.util.Objects;

public class Not extends Node{

    public Node negative;

    public Not(Node negative) {
        this.negative = negative;
    }

    @Override
    public String toString() {
        return "(!" + negative.toString() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Not not = (Not) o;
        return Objects.equals(negative.toString(), not.negative.toString());
    }
}
