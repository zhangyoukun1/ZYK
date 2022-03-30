package com.zyk;

import java.io.IOException;

public class HackText {
    static {
        System.out.println("hacking");
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
