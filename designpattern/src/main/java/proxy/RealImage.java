package proxy;

/**
 * Created by mlh on 2017/12/31.
 */
public class RealImage implements Image {

    private String fileName;//图片名

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}