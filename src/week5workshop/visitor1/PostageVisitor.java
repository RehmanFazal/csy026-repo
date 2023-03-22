package week5workshop.visitor1;

/**
 * this class implements the Vistor interface
 * it now deals with the specifics of what to do when we visit a book.
 */
public class PostageVisitor implements Visitor
{
    /**
     * Main idea - all calculation for book postage is 
     * done in one central place. 
     * Separating data from operations on it
     */
    private double totalPostageForCart;
  //collect data about the book
  public void visit(Book book) {
    //assume we have a calculation here related to weight and price
    //free postage for a book over 10 
    if(book.getPrice() < 10.0) {
      totalPostageForCart += book.getWeight() * 2;
    }
  }

  //return the total postage
  public double getTotalPostage() {
    return totalPostageForCart;
  }
}
