package com.stepanov.wicket_springboot_2;

import com.stepanov.wicket_springboot_2.Home.HomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WicketSpringboot2Application extends WebApplication {

    @Override
    public Class<? extends WebPage> getHomePage() {
        return HomePage.class;
    }
    @Override
    protected void init() {
        super.init();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(WicketSpringboot2Application.class)
                .run(args);
    }
}

