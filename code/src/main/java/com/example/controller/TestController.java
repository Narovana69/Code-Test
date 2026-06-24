package com.example.controller;

import randy.framework.annotation.Controller;
import randy.framework.annotation.UrlMapping;

@Controller
public class TestController {

    @UrlMapping(value = "/test", method = "GET") 
    public void afficherFormulaire() {
        System.out.println(" -> [CONTROLLER] Exécution de la méthode GET pour /test");
    }

    @UrlMapping(value = "/test", method = "POST") 
    public void soumettreFormulaire() {
        System.out.println(" -> [CONTROLLER] Exécution de la méthode POST pour /test");
    }
}