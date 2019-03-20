package perso;

import java.util.Stack;
public class ListeAction {
	  private DeList fst, lst ; // First and last cell
	  public ListeAction(){
		  fst = lst = null ; 
	  }

	  public boolean isEmpty() { 
		  return fst == null ;
	  }

	  public void addFirst(Action x) {
	    fst = new DeList(x, fst, null) ;
	    if (lst == null) {
	      lst = fst ;
	    } else {
	      fst.next.prev = fst ;
	    }
	  }

	  public void addLast(Action x) {
	    lst = new DeList(x, null, lst) ;
	    if (fst == null) {
	      fst = lst ;
	    } else {
	      lst.prev.next = lst ;
	    }
	  }

	  public Action removeFirst() {
	    if (fst == null) throw new Error ("removeFirst: empty List") ;
	    Action r = fst.val ;
	    fst = fst.next ;
	    if (fst == null) {
	      lst = null ;
	    } else {
	      fst.prev = null ;
	    }
	    return r ;
	  }

	  public Action removeLast() {
	    if (lst == null) throw new Error ("removeLast: empty List") ;
	    Action r = lst.val ;
	    lst = lst.prev ;
	    if (lst == null) {
	      fst = null ;
	    } else {
	      lst.next = null ;
	    }
	    return r ;
	  }
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
}
