package week5workshop.visitor1;

/**
 * This is a concrete implementation of
 * the Visitable interface
 */
public class Book implements Visitable
{
  private double price;
  private double weight;
  
  
  /**
   * accept the visitor
   * accept method allows the visitor access to the element. 
   * 
   */
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
  public double getPrice() {
    return price;
  }
  public double getWeight() {
    return weight;
  }

}
