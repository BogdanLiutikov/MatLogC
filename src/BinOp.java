public class BinOp extends Node{

    public Node left;
    public Node right;
    public String op;

    public BinOp(Node l, Node r, String o) {
        left = l;
        right = r;
        op = o;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + op + right.toString() + ")";
    }
}
