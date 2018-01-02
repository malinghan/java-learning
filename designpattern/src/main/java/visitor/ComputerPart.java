package visitor;

/**
 * Created by mlh on 2017/12/31.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
