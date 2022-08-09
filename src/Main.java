import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Klass klass = new Klass(5, "IT technologie",new int[] {2,4,6,7,4});
        System.out.println(klass.getNumber() + " "+klass.getWord()+" "+Arrays.toString(klass.getArray()));

    }
}