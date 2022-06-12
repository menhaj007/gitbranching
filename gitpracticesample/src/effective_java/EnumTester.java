package effective_java;

public class EnumTester {
    public static void main(String[] args) {
//        System.out.println(Color.valueOf("RED"));
//        System.out.println(Color.BLUE);
        Color color = Color.RED;
        System.out.println(color.getValue());
    }

}
