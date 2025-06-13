package com.sv.fakedatagen.service;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public class FakerService {


    /**
     *
     * @param ctx context
     */
    public void generateData(@NotNull Context ctx) {
        ctx.result("Inside service class" + ctx.formParam("userName") + ctx.formParam("userEmail"));
    }

}
