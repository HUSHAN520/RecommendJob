package com.example.project;

import com.example.project.services.DoWork;
import org.apache.calcite.avatica.remote.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}*/
public class Application implements CommandLineRunner {
    @Autowired
    private DoWork doWork;


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        doWork.work();
    }

}

/*
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}*/
