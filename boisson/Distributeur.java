package boisson;

import java.util.ArrayList;
import java.util.List;

public class Distributeur {

    // Liste des boissons dans mon stock(distributeur)
    List<Boisson> boissons;

   public Distributeur(){
    this.boissons = new ArrayList<Boisson>();
   }

   public void addBoisson(Boisson boisson){
     this.boissons.add(boisson);
   }

   public void addBoissons(List<Boisson> boissons){
       for (Boisson uneBoisson: boissons) {
          addBoisson(uneBoisson);
       }
  
   }

   public void acheter(String boissonAcheter){
      boolean notExistBoisson = true;
    for (int i = 0; i < this.boissons.size(); i++) {
        if(this.boissons.get(i).getName() == boissonAcheter){
            boissons.remove(this.boissons.get(i));
            System.out.println("Vous avez acheter " + boissonAcheter);
            notExistBoisson = false;
            break;
        }
    }
    if(notExistBoisson){
        System.out.println("La boisson que vous voulez acheter " + boissonAcheter +  " n'est pas disponible .");
    }
   }
   
}
