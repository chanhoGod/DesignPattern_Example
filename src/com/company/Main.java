package com.company;

import com.company.singleton.AClazz;
import com.company.singleton.BClazz;
import com.company.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
        AClazz aClass = new AClazz();
        BClazz bClass = new BClazz();

        SocketClient aClient = aClass.getSocketClient();
        SocketClient bClient = bClass.getSocketClient();


        System.out.println(aClient.equals(bClient));
    }
}
