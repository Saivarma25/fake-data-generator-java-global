package com.sv.fakedatagen.util;

import io.javalin.http.Context;
import lombok.experimental.UtilityClass;

import java.util.Map;

@UtilityClass
public class UtilityMethods {

    public void renderWithBaseHtml(Context context, String contentFragment) {
        context.render("base.html", Map.of("contentFragment", contentFragment));
    }

}
