class hello{
    public hello(){
        this(5);
        System.out.println("hii");
    }
    public hello(int a){
        this(5,6);
        System.out.println(a);
    }
    public hello(int a,int b){
        System.out.println(a);
    }
}
class ConstructorChaining{
    public static void main(String[]args){
        hello obj=new hello();
    }
}