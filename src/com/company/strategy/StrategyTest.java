package com.company.strategy;

public class StrategyTest {
    public static void main(String[] args) {

        Encoder encoder = new Encoder();


        //base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String baseResult = encoder.getMessage(message);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);

        System.out.println(baseResult);
        System.out.println(normalResult);
        System.out.println(appendResult);
    }
}
