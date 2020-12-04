package exam;

public class FunWithArgs {

    public static void main(String[][] args) {
 //       System.out.println(args[0][1]);
    }
    public static void main(String[] args) {
        var fwa = new FunWithArgs();
        String[][] newargs = {args};
        fwa.main(newargs);
        int[] defaults = new int[5];
        for (int i: defaults) {
        	System.out.println(i);
        }
    }
}
