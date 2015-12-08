package com.github.javastudy.udp.sample1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSender {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();//ds相当于邮局
            String sendStr = "hello world!";
            //对数据打包,数据，数据长度，发送到的IP地址和端口号,端口号设定一个没被其他应用程序占用的端口
            DatagramPacket dp = new DatagramPacket(sendStr.getBytes(), sendStr.length(), InetAddress.getByName("127.0.0.1"), 3000);
            //发送
            ds.send(dp);
            //关闭
            ds.close();
        } catch (Exception ex) {
            System.out.println("发送失败");
        }
    }
}