package Lambda;

public interface ParentInterface {
    void function(Integer number);
    void function(Number number);

}
class ChildInterface implements ParentInterface{
    @Override
    public void function(Integer number){
        System.out.println("Integer"+number);
    }
    @Override
    public void function(Number number){
        System.out.println("Number"+number);
    }
}
class Main_class{
    public static void main(String[] args) {
        ParentInterface parentInterface = new ParentInterface() {
            @Override
            public void function(Integer number) {
                System.out.println("Integer"+number);
            }

            @Override
            public void function(Number number) {
                System.out.println("Number"+number);
            }
        };


    }
}

