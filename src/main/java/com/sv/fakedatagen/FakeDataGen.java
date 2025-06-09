package com.sv.fakedatagen;


import com.sv.fakedatagen.service.FakerService;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinThymeleaf;

public class FakeDataGen {

    public static void main(String[] args) {

//        FakerService fakerService = new FakerService();

        Javalin app = Javalin.create(javalinConfig ->
                javalinConfig.fileRenderer(new JavalinThymeleaf())).start(1234);

        app.get("/checkHealth", ctx -> ctx.result("Application is up and running"));

        app.get("/", ctx -> ctx.render("home.html"));

        app.post("/generate", ctx -> ctx.result("Form submitted"));

    }

}