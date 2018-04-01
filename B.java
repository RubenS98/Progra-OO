public class B extends C{
  private int equis;

  public B(int equis){
    this.equis=equis;
  }
  public B(){
  }



  public String toString(){
    return "b";
  }
  public void method2(){
    System.out.print("b 2 ");
    super.method2();
  }
  public int printB(){
    return equis;
  }
}
