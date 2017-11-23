package View;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author julia
 */
@Component
@Primary
public class View1 implements View{

    public View1() {
    }
    
    public void show(){
        System.out.println("Bom dia o Mundo");
    }
}
