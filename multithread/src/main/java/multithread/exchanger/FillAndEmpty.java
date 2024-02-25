package multithread.exchanger;

import java.util.concurrent.Exchanger;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2022-03-24
 * 它使用一个交换器在线程之间交换缓冲区，
 * 这样填充缓冲区的线程在需要时就会得到一个刚清空的缓冲区，
 * 并将填充的缓冲区交给清空缓冲区的线程。
 */
class FillAndEmpty {
    Exchanger<DataBuffer> exchanger = new Exchanger<DataBuffer>();
    DataBuffer initialEmptyBuffer = new DataBuffer(); //...a made-up type
    DataBuffer initialFullBuffer = new DataBuffer(); //...

    class FillingLoop implements Runnable {
        public void run() {
            DataBuffer currentBuffer = initialEmptyBuffer;
            try {
                while (currentBuffer != null) {
                    addToBuffer(currentBuffer);
                    if (currentBuffer.isFull()) {
                        currentBuffer = exchanger.exchange(currentBuffer);
                    }
                }
            } catch (InterruptedException ex) {
//                ...handle ...
            }
        }
    }

    class EmptyingLoop implements Runnable {
        public void run() {
            DataBuffer currentBuffer = initialFullBuffer;
            try {
                while (currentBuffer != null) {
                    takeFromBuffer(currentBuffer);
                    if (currentBuffer.isEmpty()) {
                        currentBuffer = exchanger.exchange(currentBuffer);
                    }
                }
            } catch (InterruptedException ex) {
                // ...
                // handle
                //...
            }
        }
    }

    void takeFromBuffer(DataBuffer currentBuffer) {

    }

    void addToBuffer(DataBuffer currentBuffer) {

    }

    void start() {
        new Thread(new FillingLoop()).start();
        new Thread(new EmptyingLoop()).start();
    }

    class DataBuffer {
       public boolean isEmpty() {
            return true;
        }
        public boolean isFull() {
           return true;
        }
    }
}