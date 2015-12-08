package com.github.javastudy.udp.sample1;

import java.net.InetAddress;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            //当前主机
            InetAddress ia1 = InetAddress.getLocalHost();
            System.out.println(ia1);
            System.out.println(ia1.getHostName());
            System.out.println(ia1.getHostAddress());
            //百度主机
            InetAddress ia2 = InetAddress.getByName("www.baidu.com");
            System.out.println(ia2);
            System.out.println(ia2.getHostName());
            System.out.println(ia2.getHostAddress());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}