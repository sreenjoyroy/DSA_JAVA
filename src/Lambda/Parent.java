package Lambda;

abstract class Parent {
    public abstract void function(Number number);
    public abstract void function (Integer number);
}
class Child extends  Parent{
    @Override
    public  void function(Integer number){
        System.out.println("INTEGER");
        System.out.println(number);
    }
    @Override
    public void function(Number number){
        System.out.println("NUMBER");
        System.out.println(number);
    }
}
class Main{
    public static void main(String[] args) {
        Parent a = new Parent(){
            @Override
            public  void function(Integer number){
                System.out.println("INTEGER"+number);
            }
            @Override
            public void function(Number number){
                System.out.println("NUMBER"+number);
            }
        };
        a.function(4.5);
        a.function(9);
    }
}
