package Builder;

public class Program {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("AAA");
        String str = stringBuilder
                .append("BBB")
                .append("CCC")
                .replace(1, 3, "DDD")
                .delete(1, 5)
                .toString();
        System.out.println(str);
    }
}
