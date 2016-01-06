package com.github.javastudy.snmp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexText {

    public static void main(String[] args) {

        int count = 10000;
        Pattern[] patterns = new Pattern[count];
        String[] toMatch = new String[count];
        for (int i=0; i < count; i++) {
            Pattern p = Pattern.compile("userinfo" + i + "/.*");
            patterns[i] = p;
            toMatch[i] = "userinfo" + i + "/update";
        }

        boolean matched = false;
        long start = System.currentTimeMillis();
        for (int i=0; i< 10000; i++) {
            Matcher m = patterns[i].matcher(toMatch[i]);
            matched = m.matches();
        }
        long end = System.currentTimeMillis();

        System.out.println(matched  + " time: " + (end -start) +  " average: " + (end-start)/(float)count);

        Pattern p = Pattern.compile("userinfo/.*");
        //进行匹配，并将匹配结果放在Matcher对象中
        Matcher m = p.matcher("userinfo/update");
        matched = m.matches();

        System.out.println(matched);

        m = p.matcher("userinfo/");
        matched = m.matches();

        System.out.println(matched);

        m = p.matcher("userinfo");
        matched = m.matches();

        System.out.println(matched);

    }



}
