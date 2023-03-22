package week5workshop.visitor2;
/*
3. This interface represents the Visitor
But what's the role of a visitor?
...to define methods for the algorithms
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
