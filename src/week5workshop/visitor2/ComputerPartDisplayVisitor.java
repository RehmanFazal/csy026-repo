package week5workshop.visitor2;
/*
4. Concrete class implementing the visitor interface
this provides concrete behaviours on what each element does when visited
 */

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
