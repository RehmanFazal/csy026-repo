package week5workshop.visitor2;
// 2. Keyboard concrete class implements interface ComputerPart
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
