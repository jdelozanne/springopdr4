package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import View.View;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author julia
 */
public class Controller {

    @Autowired
    View view;

    public Controller(View view) {
        this.view = view;
    }

    public void showView() {
        this.view.show();
    }

}