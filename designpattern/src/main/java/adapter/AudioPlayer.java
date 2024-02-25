package adapter;

import java.io.InputStreamReader;
import java.io.*;

/**
 * Created by mlh on 2017/12/24.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }

        //mediaAdapter 提供了播放其他文件格式,使用mediaAdapter支持
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);//
        }
        else{
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}