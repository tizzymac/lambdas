import java.util.Arrays;

public class MaryHadALittleLambda {

    public static void main(String[] args) {
        // A lambda expression is an anonymous function given as a constant value

        Lamb[] marysLambs = {
                new Lamb("Lambert"),
                new Lamb("Wooly"),
                new Lamb("Bo Peep"),
                new Lamb("Baaartholemew")
        };

        System.out.println("Before Sorting Names:");
        Arrays.asList(marysLambs).forEach(lamb -> System.out.println("  " + lamb.toString()));

        // Sort lambs by name
        Arrays.sort(marysLambs, Lamb::nameCompare); // The name compare function is a lambda

        System.out.println("After Sorting Names:");
        Arrays.asList(marysLambs).forEach(lamb -> System.out.println("  " + lamb.toString()));
    }
}

class Lamb {
    private String name;

    public Lamb(String name) {
        this.name = name;
    }

    public static int nameCompare(Lamb l1, Lamb l2){
        return l1.name.compareTo(l2.name);
    }

    public String toString() {
        return name;
    }
}


