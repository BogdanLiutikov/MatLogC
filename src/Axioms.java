public class Axioms {

    static boolean isAxiom10(Node t) {
//        System.out.println("Дерево проходящее проверку на 10 аксиому - " + t.toString());
        if (!(t instanceof BinOp)) return false;
        BinOp binOp = (BinOp) t;
 //       System.out.println(binOp.left.toString().replaceFirst("\\(!\\(!", ""));
 //       System.out.println(binOp.right.toString()+"))");
        if(binOp.op.equals("->")
                && binOp.left.toString().replaceFirst("\\(!\\(!", "").equals(binOp.right.toString()+"))")) {
            axiom10(binOp.right);
            return true;
        }
        else
            return false;
    }


    static void axiom10(Node t)
    {
//       System.out.println("10Axiom отдал " + t.toString());
        String s = ("(a->(!!a->a)) \n" +
                "((a->(!!a->a))->(!(!!a->a)->(a->(!!a->a)))) \n" +
                "(!(!!a->a)->(a->(!!a->a))) \n" +
                "(!(!!a->a)->(a->!(!!a->a))) \n" +
                "(!(!!a->a)->(!(!!a->a)->!(!!a->a))) \n" +
                "(!(!!a->a)->((!(!!a->a)->!(!!a->a))->!(!!a->a))) \n" +
                "((!(!!a->a)->(!(!!a->a)->!(!!a->a)))->((!(!!a->a)->((!(!!a->a)->!(!!a->a))->!(!!a->a)))->(!(!!a->a)->!(!!a->a)))) \n" +
                "((!(!!a->a)->((!(!!a->a)->!(!!a->a))->!(!!a->a)))->(!(!!a->a)->!(!!a->a))) \n" +
                "(!(!!a->a)->!(!!a->a)) \n" +
                "((a->(!!a->a))->((a->!(!!a->a))->!a)) \n" +
                "(((a->(!!a->a))->((a->!(!!a->a))->!a))->(!(!!a->a)->((a->(!!a->a))->((a->!(!!a->a))->!a)))) \n" +
                "(!(!!a->a)->((a->(!!a->a))->((a->!(!!a->a))->!a))) \n" +
                "((!(!!a->a)->(a->(!!a->a)))->((!(!!a->a)->((a->(!!a->a))->((a->!(!!a->a))->!a)))->(!(!!a->a)->((a->!(!!a->a))->!a)))) \n" +
                "((!(!!a->a)->((a->(!!a->a))->((a->!(!!a->a))->!a)))->(!(!!a->a)->((a->!(!!a->a))->!a))) \n" +
                "(!(!!a->a)->((a->!(!!a->a))->!a)) \n" +
                "((!(!!a->a)->(a->!(!!a->a)))->((!(!!a->a)->((a->!(!!a->a))->!a))->(!(!!a->a)->!a))) \n" +
                "((!(!!a->a)->((a->!(!!a->a))->!a))->(!(!!a->a)->!a)) \n" +
                "(!(!!a->a)->!a) \n" +
                "(!a->(!!a->a)) \n" +
                "((!a->(!!a->a))->(!(!!a->a)->(!a->(!!a->a)))) \n" +
                "(!(!!a->a)->(!a->(!!a->a))) \n" +
                "((!(!!a->a)->!a)->((!(!!a->a)->(!a->(!!a->a)))->(!(!!a->a)->(!!a->a)))) \n" +
                "((!(!!a->a)->(!a->(!!a->a)))->(!(!!a->a)->(!!a->a))) \n" +
                "(!(!!a->a)->(!!a->a)) \n" +
                "((!(!!a->a)->(!!a->a))->((!(!!a->a)->!(!!a->a))->!!(!!a->a))) \n" +
                "((!(!!a->a)->!(!!a->a))->!!(!!a->a)) \n" +
                "!!(!!a->a)").replaceAll("a", t.toString());
        System.out.println(s);
    }

    static void axiom(Node t) {

        String s =("a \n" +
                "(a->(!a->a)) \n" +
                "(!a->a) \n" +
                "(!a->(!a->!a)) \n" +
                "((!a->(!a->!a))->((!a->((!a->!a)->!a))->(!a->!a))) \n" +
                "((!a->((!a->!a)->!a))->(!a->!a)) \n" +
                "(!a->((!a->!a)->!a)) \n" +
                "(!a->!a) \n" +
                "((!a->a)->((!a->!a)->!!a)) \n" +
                "((!a->!a)->!!a) \n" +
                "!!a").replaceAll("a", t.toString());

        System.out.println(s);
    }
}
