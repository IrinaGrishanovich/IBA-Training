package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {  // первый раз

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int s = Integer.parseInt(s1);

        int[] channelList = new int[10];
        for(int i = 0; i < channelList.length; i++) {
            channelList[i] = i;
        }

        for (int i = 0; i < channelList.length; i++) {
            if (s == channelList[i]) {
                System.out.println(channelList[i] + " channel");
                break;
            }
        /*    else {                                               // почему при добавлении else, существующие
                System.out.println("The channel is not found");    // каналы - not found?
                break;
            }*/
        }

    }
}

