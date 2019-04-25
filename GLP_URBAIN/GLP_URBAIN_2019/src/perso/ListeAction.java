package perso;

import java.util.Stack;

public class ListeAction{
	public Action act = new Action();
	///////////////////////Avec Stack ///////////////////////////
	  Stack<Action> stack = new Stack<Action>();
	  
	  public void add(Action action) {
		  stack.push(action);
	  }
	  public void remove(){
		  stack.pop();
	  }
	  public void see(){
		  stack.peek();
	  }
	  public int search(Action action) {
		  int res;
		  res = stack.search(action);
		  return res;
	  }
	  public Stack<Action> createDay(int numero) {
		  for(int i = 0; i < 6; i++) {
			  add(act);
		  }
		  return stack;		  
	  }
	
}
