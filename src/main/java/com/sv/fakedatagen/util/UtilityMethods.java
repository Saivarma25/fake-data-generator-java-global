package com.sv.fakedatagen.util;

import io.javalin.http.Context;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UtilityMethods {

    public static void renderWithBaseHtml(Context context, String contentFragment) {
        context.render("base.html", Map.of("contentFragment", contentFragment));
    }

}
