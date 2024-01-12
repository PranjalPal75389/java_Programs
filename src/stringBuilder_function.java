public class stringBuilder_function {
    public static void main(String[]args)
    {
        String name ="Zoro to";
        System.out.println(name.equals("zoro to"));
        System.out.println(name.equalsIgnoreCase("zoro to"));
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("o"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("Z","M"));

        String NAME ="  Zoro to  ";
        System.out.println(NAME);
        System.out.println(NAME.trim());
    }
}
