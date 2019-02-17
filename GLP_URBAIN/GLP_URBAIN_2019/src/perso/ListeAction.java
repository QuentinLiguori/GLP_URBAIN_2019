package perso;

import java.util.Iterator;

public class ListeAction {
	  private DeList fst, lst ; // First and last cell
	  public ListeAction(){
		  fst = lst = null ; 
	  }

	  protected boolean isEmpty() { 
		  return fst == null ;
	  }

	  protected void addFirst(Action x) {
	    fst = new DeList(x, fst, null) ;
	    if (lst == null) {
	      lst = fst ;
	    } else {
	      fst.next.prev = fst ;
	    }
	  }

	  protected void addLast(Action x) {
	    lst = new DeList(x, null, lst) ;
	    if (fst == null) {
	      fst = lst ;
	    } else {
	      lst.prev.next = lst ;
	    }
	  }

	  protected Action removeFirst() {
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

	  protected Action removeLast() {
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
}
