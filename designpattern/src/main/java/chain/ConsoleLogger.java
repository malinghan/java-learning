package chain;

/**
 * Created by mlh on 2017/12/31.
 */
public class ConsoleLogger extends  AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
