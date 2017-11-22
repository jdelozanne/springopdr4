/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;


import controller.Controller;
import View.View1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author julia
 */

public class Application extends AnnotationConfigApplicationContext{
    
    public Application (){
    }

    @Autowired 
    Controller c;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Controller.class, View1.class);
        Application a = context.getBean(Application.class);
        a.start();
    }
     
    @Override
    public void start() {
        
        c.showView();
}

}
