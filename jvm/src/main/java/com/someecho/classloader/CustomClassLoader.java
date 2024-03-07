package com.someecho.classloader;

/**
 * @author someecho <linghan.ma@gmail.com>
 * Created on 2024-02-27
 */
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CustomClassLoader extends ClassLoader {

    public static void main(String[] args) throws Exception {
        CustomClassLoader classLoader = new CustomClassLoader();
        Class<?> helloClass = classLoader.findClass("Hello");
        helloClass.getDeclaredMethod("hello").invoke(helloClass.newInstance());
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
//        String fileName = name + ".xlass";
        String fileName = name + ".class";
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int nextByte;
            while ((nextByte = fis.read()) != -1) {
                bos.write(nextByte); // 通过255减去每个字节来进行解码
            }
            byte[] bytes = bos.toByteArray();
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Failed to load class " + name, e);
        }
    }
}