package com.example.tp;

import com.example.tp.config.ApplicationConfig;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import java.net.URI;

public class Main {
    public static final String BASE_URI = "http://localhost:8080/api/";
    public static void main(String[] args) throws Exception {
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), new ApplicationConfig());
        System.out.println("Starter TP JAX-RS sur " + BASE_URI + " | OpenAPI: http://localhost:8080/openapi");
        Thread.currentThread().join();
    }
}
