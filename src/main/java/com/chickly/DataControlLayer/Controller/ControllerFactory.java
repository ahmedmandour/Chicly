package com.chickly.DataControlLayer.Controller;

import com.chickly.DataControlLayer.View.HomeController;
import com.chickly.DataControlLayer.View.LoginController;

public class ControllerFactory {

    public ControllerFactory() {

    }

    public Controller getController(final String controllerName) {

        switch (controllerName) {
            case "login":
                return new LoginController();
            case "home":
                return new HomeController();
            default:
                return null;
        }
    }
}