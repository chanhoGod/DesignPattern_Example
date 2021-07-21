package com.company.proxy;

import com.company.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class ProxyTest {
    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//
//        IBrowser browser2 = new BrowserProxy("www.naver.com");
//        browser2.show();
//        browser2.show();
//        browser2.show();
//        browser2.show();
//        browser2.show();
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                    System.out.println("after");
                });


        aopBrowser.show();
        System.out.println("loading Time : "+ end.get());
        aopBrowser.show();
        System.out.println("loading Time : "+ end.get());
    }

}
