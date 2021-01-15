package pug0.nice;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int times = 3;

        if (args.length >= 1) {
            times = Integer.parseInt(args[0]);
        }

        try {
            for (int i = 0; i < times; i++) {
                Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=69"));
                TimeUnit.SECONDS.sleep(1);
                Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=nice"));
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (IOException | URISyntaxException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
