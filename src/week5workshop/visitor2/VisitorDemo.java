package week5workshop.visitor2;

/*
5. Now run the show
 */
public class VisitorDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
