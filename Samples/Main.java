class MainClass {
    public static void main(String[] a){
	      System.out.println(new Order().test(8));
    }
}

class Order {
  int a;
    
  public int set(int _a) {
    a = _a;
    return 0;
  }

  public int test(int _a) {
    int tmp;
    tmp = this.set(_a);
    return a;
  }
}
