/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author julia
 */

@Component("View")

public class View2 implements View{
    public View2() {
    }
    
    @Override
    public void show(){
        System.out.println("Adieus o Mundo");
    }
}

