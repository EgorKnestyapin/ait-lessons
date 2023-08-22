package ait.string;

public class StringBuilderAppl {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        String j = builder.toString();
        System.out.println(j);
        builder.append("_").append(11);
        System.out.println(builder);
        System.out.println(stringManipulation("Javadoc"));
    }

    private static String stringManipulation(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.insert(0, "{ ").append(" }");
        return stringBuilder.toString();
    }
}
