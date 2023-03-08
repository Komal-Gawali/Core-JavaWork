package Inheritance1;

public class MultipleC implements MultipleP_1, MultipleP_2 {
	@Override
	public void game() {
		System.out.println("I gain gaming statergy from parent-1.");
	}
	@Override
	public void strength() {
		System.out.println("My bigest strength is parent-1.");
	}
	@Override
	public void aware() {
		System.out.println("Parent-2 well aware about enviroment situation.");
	}
  @Override
  public void help() {
	  System.out.println("Parent-2 always ready for help. ");
  }
}
