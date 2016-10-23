package com.sasha.SE_03.Task1;

import static java.util.concurrent.TimeUnit.MINUTES;

/**
 * Created by Александра on 23.10.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CrazyLogger logger = new CrazyLogger("First");
        logger.addMessage("message1");
        MINUTES.sleep(1);
        logger.addMessage("message2");
        MINUTES.sleep(1);
        logger.addMessage("message3");
        MINUTES.sleep(1);
        logger.addMessage("message4");

        String find = logger.findMessage("message3");
        System.out.println(find);
    }
}
