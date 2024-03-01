package boisson;

import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main(String[] args) {
        Boisson boisson = new Boisson("Coca", "Coca cola", 99);
        Boisson boisson1 = new Boisson("Lipton", "Lipton", 1);
        Boisson boisson2 = new Boisson("Soda", "Cocala", 15);
        Boisson boisson3 = new Boisson("Cafe", "Cafet", 2);
        
        
        
        // System.out.println(boisson.displayBoisson());

        Distributeur distributeur = new Distributeur();
        List<Boisson> listBoisson = new ArrayList<Boisson>();
        listBoisson.add(boisson);
        listBoisson.add(boisson1);
        listBoisson.add( boisson2);
        listBoisson.add( boisson3);
            
        
        System.out.println("Bonjour");
            
        distributeur.addBoissons(listBoisson);
        distributeur.acheter("Soda");
        
        }
}