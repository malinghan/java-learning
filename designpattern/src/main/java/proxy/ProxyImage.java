package proxy;

/**
 * Created by mlh on 2017/12/31.
 */
public class ProxyImage implements  Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    /**
     * 如果不存在RealImage，构造之
     * 如果存在 调用之
     */
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
