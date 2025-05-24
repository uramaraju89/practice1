package org.example;



public class Recursive {


    public static void main(String[] args) {
        Recursive obj = new Recursive();

        obj.validate(10);
        obj.sumOftwovalues(10,20);
    }
    public void validate(int num){
        if(num >0){
            System.out.println("number is "+ num);
            validate(--num);
        }else{
            System.out.println("you have reached to bottom");
        }
    }
    public int sumOftwovalues(int a, int b){
        int c = a+b;
        System.out.println("sum of two numbers is "+c);
        return c;
    }
}

