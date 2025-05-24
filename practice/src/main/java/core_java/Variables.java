package core_java;

public class Variables {
    public static void main(String[] args) {
        int a = 20;
        long v = 30l;
        sumOfTwo(10,919);
        Variables obj = new Variables();
        obj.valueOfTwo("this needs to be typed in caps");


    }
    public static void sumOfTwo(int a, int b){
        System.out.println(a+b  +"you sum of two values");
    }

    public void valueOfTwo(String s ){
        System.out.println(s.toUpperCase());

    }
}
