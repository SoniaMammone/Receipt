package org.generation.italy.receipt.model;

public class UserInterface {

    private double totalCost;
    private int quantity;
    private Product product;

    private void printMenu(){

        System.out.println("""
                Inserisci una tra le seguenti scelte: 
                1) Aggiungi prodotto
                2) Sconto prodotto
                3) Storno prodotto
                4) Stampa scontrino
                """);
    }

    private void doMenu(){

        
        
    }

}
