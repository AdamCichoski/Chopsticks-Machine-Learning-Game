package Matchboxes;

import java.util.LinkedList;

/**
 * This class is for "matchboxes" that are used for helping with the machine 
 * learning process to punish or reward each matchbox
 * 
 * @Author Adam Cichoski
 */
public class Matchbox {
    private LinkedList<Integer> moveSet;
    private int addToLeft=0;
    private int addToRight=1;
    private int moveToOther=2;

    /**
     * Constructor
     */
    public Matchbox(){
        moveSet = new LinkedList<>();
        moveSet.add(addToLeft);
        moveSet.add(addToRight);
        moveSet.add(moveToOther);
    }
    /**
     * Removes a certain element from the matchbox
     * @param move
     */
    public void remove(int move){
        if(!(move < 3 || move >= 0)){
            System.err.println("Error: Invalid Move");
        }
        else{
            moveSet.remove(move);
        }
    }
    /**
     * Adds a certain element from the matchbox
     * @param move
     */
    public void add(int move){
        if(!(move <= 2 || move >= 0)){
            System.err.println("Error: Invalid Move");
        }
        else{
            moveSet.add(move);
        }
    }
    /**
     * Picks a random move from inside of the Matchbox
     * @return
     */
    public int pick(){
        Object[] array = moveSet.toArray();
        return (int) array[(int)(Math.random()*array.length)];
    } 
    /**
     * Returns the elements inside of the Mathbox as a String
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(Object i: moveSet){
            sb.append(i+ " ");
        }
        return sb.toString();
    }
}
