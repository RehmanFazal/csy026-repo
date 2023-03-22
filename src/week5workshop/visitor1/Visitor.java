package week5workshop.visitor1;

/**
 * This is Visitor interface. 
 * For each different type of concrete element here, 
 * we'll need to add a visit method. 
 * For the Book, we do:
 */
public interface Visitor
{
    /**
     * visit Book object
     */
    public void visit(Book book);
    /**
     * for others that you may have
     */
    
     /*public void visit(CD cd);
     public void visit(DVD dvd);*/
}
