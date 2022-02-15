package app.model;

import org.springframework.context.annotation.Bean;

public class Timer {

    private static Long nanoTime = System.nanoTime();

    @Bean
    public static Long getTime() {
        return nanoTime;
    }
}
