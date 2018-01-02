package adapter;
import java.io.*;

/**
 * Created by mlh on 2017/12/24.
 */

/**
 *  Target:
 *     MediaPlayer：
 *        AudioPlayer
 *           + MediaAdapter mediaAdapter;
 *           +play(super(play) or mediaAdapter)
 *  Adaptee:
 *     AdvancedMediaPlayer：Mp4Player,VlcPlayer
 *  Adapter implements Target:
 *    MediaAdapter implements MediaPlayer
 *          private AdvancedMediaPlayer advancedMusicPlayer;//私有的旧的类
 *          +MediaAdapter(item){new AdvancedMediaPlayer or  new MediaPlayer}
 *          +play(audioType,other){MediaPlayer.play or AdvancedMediaPlayer.play}
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
