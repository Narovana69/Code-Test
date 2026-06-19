package com.example.controller;

import randy.framework.annotation.Controller;
import randy.framework.annotation.UrlMapping;

@Controller
public class TestController {

    @UrlMapping("/accueil")
    public void afficherAccueil() {
    }

    @UrlMapping("/profil")
    public void voirProfil() {
    }
}