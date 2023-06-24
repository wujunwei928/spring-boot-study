package cn.w3home;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootNonWebApp implements CommandLineRunner {
    public static void main(String[] args) {
        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(SpringBootNonWebApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Spring Boot!");
    }

}
