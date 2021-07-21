package com.company.facade;

public class FacadeTest {

    public static void main(String[] args) {
//        Ftp ftpClient = new Ftp("www.hi.co.kr", 22, "/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();

        SFtpClient sFtpClient = new SFtpClient("www.hi.co.kr", 22, "/home/etc", "text.tmp");
        sFtpClient.connect();
        sFtpClient.write();
        sFtpClient.read();
        sFtpClient.disConnect();

    }
}
