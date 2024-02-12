package com.driver;

public class Main {

    public static void main(String[] args) {

        // 3rd statement
        B b=new B();
        System.out.println(b.call());
        System.out.println(b.meth());
    }
  
}

 class A {
    public String meth(){
        return "Invoking method from class A";
    }
}

 class B extends A {

    public String meth(){
        return "Method is overridden in Extendend class B";
    }
    public String call(){
        return super.meth();
    }
}