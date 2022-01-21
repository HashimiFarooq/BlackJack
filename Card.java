/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab5;
/**
 *
 * @author Muham
 */
public class Card implements Comparable {
    int rank, suit;
    boolean faceUp;
    public static final int CLUB = 0;
    public static final int DIAMOND = 1;
    public static final int HEART = 2;
    public static final int SPADE = 3;
    public Card(int rank, int suit, boolean faceUp) {
        this.rank = rank ;
        this.suit = suit ;
        this.faceUp = faceUp;
    }
    public boolean isFaceUp() {
        return this.faceUp;
    }
    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }
    public int getRank() {
        return this.rank;
    }
    public int getSuit() {
        return this.suit;
    }

    @Override
    public boolean equals(Object ob) {
        if (!(ob instanceof Card)) {
            return false;
        }
        Card c = (Card) ob;
        if(c.rank == this.rank && c.suit == this.suit){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {//DO NOT MODIFY
        int hash = 7;
        hash = 31 * hash + this.getRank();
        hash = 31 * hash + this.getSuit();
        return hash;
    }
    @Override
    public int compareTo(Object obj) {//DO NOT MODIFY
        return compareTo((Card) obj);
    }
    public int compareTo(Card c) {
        if(this.rank < c.rank){
            return(-1);
        }else if(this.rank > c.rank){
            return(1);
        }
        if(this.suit > c.suit){
            return 1;
        }else if(this.suit < c.suit){
            return -1;
        }else{
            return 0;
        }
    }
    public String getRankString() {
        switch(this.rank){
            case 11:
                return("Jack");
            case 12:
                return("Queen");
            case 13:
                return("King");
            case 14:
                return("Ace");

            default:
                return(Integer.toString(this.rank));
        }
    }
    public String getSuitString() {
        String suit = "";
        switch(this.suit){
            case 0:
                suit = "Clubs";
                break;
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Spades";
                break;
        }
        return(suit);
    }
    public int value(){
        if(this.rank == 14){
            return(1);
        }else if(this.rank  > 10){
            return(10);
        }else{
            return(this.rank);
        }
    }
    @Override
    public String toString() {
        if(this.faceUp){
            return(this.getRankString() + " of " + this.getSuitString());
        }else{
            return("?");
        }
    }
    public static void main(String[] args) {
        //Create 5 of clubs
        Card club5 = new Card(5, 0, true);
        System.out.println("club5: " + club5);
        Card spadeAce = new Card(14, SPADE, true);
        System.out.println("spadeAce: " + spadeAce);
        System.out.println("club5 compareTo spadeAce: "
                + club5.compareTo(spadeAce));
        System.out.println("club5 compareTo club5: "
                + club5.compareTo(club5));
        System.out.println("club5 equals spadeAce: "
                + club5.equals(spadeAce));
        System.out.println("club5 equals club5: "
                + club5.equals(club5));

    }
}