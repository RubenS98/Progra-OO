public class A extends B{
  public A(int equis){
    super(equis);
  }
  public A(){
    
  }
  public void method2(){
    System.out.print("a 2 ");
    method1();
    super.method2();
  }
}
