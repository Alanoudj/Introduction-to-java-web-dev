package com.summer.controller;

import com.summer.annotations.Controller;
import com.summer.annotations.UrlMapping;
import org.reflections.Reflections;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DispatcherServlet extends HttpServlet {

  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    // get the classes

    Reflections reflections = new Reflections("com.summer.summercontroller");

    for (Class<?> classAnnotatedWithController : reflections.getTypesAnnotatedWith(Controller.class)) {
      if (classAnnotatedWithController.getAnnotation(Controller.class) != null) {
        try {
          Object controller = classAnnotatedWithController.newInstance();

          for (Method method : classAnnotatedWithController.getMethods()) {
            UrlMapping mapping = method.getAnnotation(UrlMapping.class);

            if (mapping != null) {
              // check that our method has the same method and uri as the received request
              if (mapping.method().toString().equals(req.getMethod())
                  && req.getRequestURI().endsWith(mapping.value())) {

                Object result = method.invoke(controller, null);
                resp.getOutputStream().print(result.toString());
                return;
              }
            }
          }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
