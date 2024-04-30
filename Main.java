public class Array {

    public static void main(String[] args){
        text();
    }
    public static void add(int x, int y){
        int sum = x + y;
        System.out.println(sum);
    }
    public static int minimun(int x, int y){
        return Math.min(x, y);
    }
    public static String text(){
        String name = "Daniel";
        String greeting = "Hello";
        String text = name + greeting;
        System.out.println(text);
        return text;
    }
}