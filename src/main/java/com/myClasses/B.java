package com.myClasses;

public class B extends A{

    public String meth(){
        return "Method is overridden in Extendend class B";
    }
    public String call(){
        return super.meth();
    }
}
