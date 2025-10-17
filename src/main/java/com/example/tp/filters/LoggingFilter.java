package com.example.tp.filters;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.logging.Logger;

@Provider
public class LoggingFilter implements ContainerRequestFilter {
    private static final Logger LOG = Logger.getLogger(LoggingFilter.class.getName());
    @Override
    public void filter(ContainerRequestContext ctx) throws IOException {
        LOG.info(() -> "➡ " + ctx.getMethod() + " " + ctx.getUriInfo().getRequestUri());
    }
}
