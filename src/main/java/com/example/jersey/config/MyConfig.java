package com.example.jersey.config;

import com.example.jersey.services.*;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.moxy.xml.MoxyXmlFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ApplicationPath("/")
public class MyConfig extends ResourceConfig {
    @Bean
    @Primary
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class);
        return jerseyServlet;
    }

    public MyConfig() {
        register(CompteRestJaxRSAPI.class);
        register(MoxyXmlFeature.class);
        register(JacksonFeature.class);
    }
}