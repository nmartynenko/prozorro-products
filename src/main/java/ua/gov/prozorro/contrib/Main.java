package ua.gov.prozorro.contrib;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.gov.prozorro.contrib.config.SpringConfig;

public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
