package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import View.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author julia
 */
@Component
public class Controller {

    @Autowired @Qualifier("NiceView")
    View view;

    public Controller(View view) {
        this.view = view;
    }

    public void showView() {
        this.view.show();
    }

}
