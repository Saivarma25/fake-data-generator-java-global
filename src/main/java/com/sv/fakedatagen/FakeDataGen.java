package com.sv.fakedatagen;


import com.sv.fakedatagen.service.FakerService;
import com.sv.fakedatagen.util.TemplateConstants;
import com.sv.fakedatagen.util.UtilityMethods;
import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinThymeleaf;

public class FakeDataGen {

    public static void main(String[] args) {

        FakerService fakerService = new FakerService();

        Javalin app = Javalin.create(javalinConfig ->
                javalinConfig.fileRenderer(new JavalinThymeleaf())).start(1234);

        app.get("/checkHealthBySV", ctx -> ctx.result("Application is up and running"));

        app.get("/", ctx -> UtilityMethods.renderWithBaseHtml(ctx, TemplateConstants.HOME_TEMPLATE));

        app.post("/generate", fakerService::generateData);

    }

}