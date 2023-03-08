package interfaceProg;

public class Child implements Parent1, Parent2 {
	@Override
	public void business() {
		System.out.println("Parent1 have there own business.");
	}
  @Override
   public void m1() {
	  System.out.println(" master in handling all situation");
  }
  @Override
  public void s1() {
	  System.out.println("parent1 is brilliant ");
  }
  @Override
  public  void experience() {
	  System.out.println(" Parent2 have experience in handling home ");
  }
  @Override
    public void sport() {
	  System.out.println("Parent2 is interested in playing out door games");
  }
  @Override
  public void helpfull() {
	  System.out.println("Parent2 is always ready for helping ");
  }
}
