package visitor;

/**
 * Created by mlh on 2017/12/31.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        System.out.println("");
        Mouse mouse=new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());
    }
}