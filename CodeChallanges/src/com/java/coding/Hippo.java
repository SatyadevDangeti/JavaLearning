package com.java.coding;


public class Hippo extends Animal{

    public static int i;
public Hippo(String name){
    super("hulk");
}
/*public Hippo(int i){
    super("Fred");
}*/
/*public Hippo(String s){
    super(42);
}*/
/*public Hippo(int i, String s){

}*/
/*public Hippo(String a, String b, String c){
    super(a,b);
}*/
/*public Hippo(int i, int j){
    super("man" ,j);
}*/
/*public Hippo(int i, int x, int y){
    super(i, "star");
}*/
    public void behavior(){
        System.out.println("Hippo Behaviour overrides Animal");

    }
    public static void simple(){
        System.out.println("Si");
    }

    public void testing(){
        super.behavior();
        System.out.println("Static testing in subclass");
    }
    public void superUsage(){
        super.superUsage();
        System.out.println("Used parent class");
    }

}
