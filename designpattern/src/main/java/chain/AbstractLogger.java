package chain;

import abstractfactory.AbstractFactory;

/**
 * Created by mlh on 2017/12/31.
 */
public abstract  class AbstractLogger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    protected int level;

    //责任链的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger abstractLogger){
          this.nextLogger=abstractLogger;
    }

    public void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if(nextLogger!=null){
           nextLogger.logMessage(level,message);
        }

    }

    abstract  protected  void write(String message);

}
