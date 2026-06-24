package com.example.entity;

import randy.framework.annotation.Controller;
import randy.framework.annotation.UrlMapping;

@Controller
public class Test {
    @UrlMapping("/")
    public String accueil() {
        System.out.println("[RACINE] -> L'accueil de l'application a été atteint avec succès !");
        return "Résultat de la méthode GET pour /";
    }

    @UrlMapping(value = "/test/get", method = {"GET"})
    public String test() {
        System.out.println(" -> [CONTROLLER] Exécution de la méthode GET pour /test/get");
        return "Résultat de la méthode GET pour /test/get";
    }
    
    @UrlMapping(value = "/test/post", method = {"POST"})
    public String testPost() {
        System.out.println(" -> [CONTROLLER] Exécution de la méthode POST pour /test/post");
        return "Résultat de la méthode POST pour /test/post";
    }
}
