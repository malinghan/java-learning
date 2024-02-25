package adapter;

/**
 * Created by mlh on 2017/12/24.
 */
public class MediaAdapter implements  MediaPlayer {//新的接口
    private AdvancedMediaPlayer advancedMusicPlayer;//私有的旧的类
    //新的构造函数
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer = new VlcPlayer();//旧的对象实例
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer=new Mp4Player();
        }
    }
    //新的方法
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
