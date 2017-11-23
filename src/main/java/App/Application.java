/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import controller.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author julia
 */

@ComponentScan({"App", "View", "controller"})
@Configuration
public class Application {

    public Application() {
    }

    @Autowired
    Controller c;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        Application a = context.getBean(Application.class);
        a.start();
    }
    
    
    public void start() {

        c.showView();
    }

}
