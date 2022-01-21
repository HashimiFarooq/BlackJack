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
public interface UserInterface {//DO NOT MODIFY
    /** Set the Blackjack game
     * this UserInterface belongs to.
     * @param game
     */
    public void setGame(BlackjackGame game);
    /**
     * Display the cards held by the House
     * and the player (you).
     */
    public void display();
    /**
     * Prompt the user if they want another
     * card.  Return true if another card
     * desired.
     * @return
     */
    public boolean hitMe();
    /**
     * Display the final cards, scores
     * and winner.
     */
    public void gameOver();
}