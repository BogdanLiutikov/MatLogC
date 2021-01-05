import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.replaceAll("\\s+","").trim();
//        System.out.println(s);
        String[] in = s.split("\\|-");
        if (in[1].length() > 2)
            System.out.println(in[0]+"|-!!("+in[1]+")");
        else
            System.out.println(in[0]+"|-!!"+in[1]);

        ANTLRInputStream ais = new ANTLRInputStream(in[1]);
        GramLexer l = new GramLexer(ais);
        TokenStream ts = new CommonTokenStream(l);
        GramParser parser = new GramParser(ts);
        Node n = parser.expression().expr;;
//        System.out.println(n.toString());
        String lastin = n.toString();

        while (true){

            try {
                s = scanner.nextLine();
            }
            catch (Exception e) {
                break;
            }

            ais = new ANTLRInputStream(s);
            l = new GramLexer(ais);
            ts = new CommonTokenStream(l);
            parser = new GramParser(ts);
            n = parser.expression().expr;;

//            System.out.println(n.toString());

            if (MP.isMp(n)) {}
            else if (Axioms.isAxiom10(n)){}
            else
                Axioms.axiom(n);
            if (n.toString().equals(lastin))
                break;
        }
    }
}
