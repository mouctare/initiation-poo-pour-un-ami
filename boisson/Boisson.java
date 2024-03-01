package boisson;

import java.util.Calendar;
import java.util.Date;

public class Boisson {

    private String name;

    private String marque;

    private int quantity;

    private int amountOfsugar;

    private Date dateOfManufacture;

    private Date expireDate;

    private int price;

    Calendar calendrier = Calendar.getInstance();
    
    public Boisson(String name, String marque, int price){
        this.name = name;
        this.marque = marque;
        this.price = price;
        calendrier.setTime(new Date());
        calendrier.add(calendrier.YEAR, 5);
    
      this.dateOfManufacture = new Date();
      this.expireDate = calendrier.getTime();

    }

    public String displayBoisson(){
        return "Le nom de la boisson est " +  this.name +  " " +  "de la marque " + " " 
        + this.marque +  " " + "le prix est " + this.price + " " + " la quantité du sucre est de "
         + this.amountOfsugar + " % " + "la quantité est de " + this.quantity + " litre " + "la date de fabrication est de "
        + this.dateOfManufacture + " la date d'expiration est le " + this.expireDate;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getMarque(){
        return this.marque;
    }
    public void setMarque(String marque){
        this.marque = marque;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getAmountOfsugar(){
        return this.amountOfsugar;
    }
    public void setAmountOfsugar(int amountOfsugar){
        this.amountOfsugar = amountOfsugar;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public Date getExpireDate(){
        return this.expireDate;
    }
  
    public Date getDateOfManufacture(){
        return this.dateOfManufacture;
    }
    public void setDateOfManufacture(Date dateOfManufacture){
        this.dateOfManufacture = dateOfManufacture;
    }
   
}
