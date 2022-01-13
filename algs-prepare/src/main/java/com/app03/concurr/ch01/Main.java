package com.app03.concurr.ch01;

public class Main {

    public static void main(String[] args) {
        MyData myData = new MyData();
        Thread reader = new ReaderThread(myData);
        Thread writer = new WriterThread(myData);

        reader.start();
        writer.start();
    }
}
