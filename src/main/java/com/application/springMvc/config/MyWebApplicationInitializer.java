package com.application.springMvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * Java Config instead of web.xml using Servlet 3.0
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    private String TMP_FOLDER = System.getProperty("java.io.tmpdir");
    private int MAX_UPLOAD_SIZE = 15 * 1024 * 1024;

    public void onStartup(ServletContext container) {
        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        appContext.setConfigLocation("/WEB-INF/app-context-servlet.xml");
        ServletRegistration.Dynamic registration = container.addServlet("mvc-dispatcher", new DispatcherServlet(appContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");

        MultipartConfigElement multipartConfigElement = new MultipartConfigElement(TMP_FOLDER,
                MAX_UPLOAD_SIZE, MAX_UPLOAD_SIZE * 2, MAX_UPLOAD_SIZE / 2);

        registration.setMultipartConfig(multipartConfigElement);
    }
}
