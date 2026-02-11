package Lambda;

public class LambdaSample {
    static{
        System.out.println("LambdaSample Static()");
    }
    {
        System.out.println("LambdaSample Non Static()");
    }
    public static void main(String[] args) {
        System.out.println("Main");
        LambdaSample sample = new LambdaSample2();
    }

}
class LambdaSample2 extends LambdaSample{
    public LambdaSample2(){
        System.out.println("LambdaSample2 Constructor");
    }
    static{
        System.out.println("LambdaSample child Static()");
    }
    {
        System.out.println("LambdaSample Child Non Static()");
    }

}