import p1.classA;
import p1.classB;
//import p1.private_specifier;
//import p1.protected_specifier;
//import p1.default_specifier;
    public static void main(String[] args)
    {
       // import p1.classA;
        classA s1=new classA();
        System.out.println("--class A--");
        s1.show();
        System.out.println("--class b--");
        classB s2=new classB();
        s2.display();
       // private_specifire s3=new classB();
    }

