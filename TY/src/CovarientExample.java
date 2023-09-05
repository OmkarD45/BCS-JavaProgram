class A1  {  
    A1 foo() {  
        return this;  
    }  
    void print()   {  
        System.out.println("Inside the class A1");  
    }  
}  
class A2 extends A1  {  
    @Override  
    A2 foo()  {  
        return this;  
    }  
    void print()  {  
        System.out.println("Inside the class A2");  
    }  
}  
class A3 extends A2  
{  
    @Override  
    A3 foo() {  
        return this;  
    }  
    @Override  
    void print()  {  
        System.out.println("Inside the class A3");  
    }  
}  
public class CovarientExample  {  
    public static void main(String argvs[])  {  
       A1 a1 = new A1();    
       a1.foo().print();           
       A2 a2 = new A2();          
       a2.foo().print();
       A3 a3 = new A3();
       a3.foo().print();  
    }  
}