package week5workshop.visitor2;
//Example 2

// 1.  Define an interface to represent the elements

/**
 * We create a ComputerPart interface defining accept operation.
 * Keyboard, Mouse, Monitor and Computer are concrete classes implementing ComputerPart interface.
 * We will define another interface ComputerPartVisitor
 * which will define a visitor class operations.
 * Computer uses concrete visitor to do corresponding action.
 */

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
