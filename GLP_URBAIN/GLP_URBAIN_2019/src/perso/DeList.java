package perso;
 public class DeList {
  Action val ; 
  DeList next, prev ;

  public DeList (Action x, DeList next, DeList prev) {
    this.val = x ;
    this.next = next ;
    this.prev = prev ;
  }
}