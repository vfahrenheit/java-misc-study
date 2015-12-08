package com.github.javastudy.udp.sample1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiver {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(3000);
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);//接收
            String receiveStr = new String(dp.getData(), 0, dp.getLength()) +
                    "from" + dp.getAddress().getHostAddress() + ":" + dp.getPort();
            System.out.println(receiveStr);
            ds.close();//关闭
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}