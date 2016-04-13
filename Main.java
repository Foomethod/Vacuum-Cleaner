/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 14052237
 */
public class Main {
    
    public static void main(String args[])
    {
        int[][] arraymap = new int[8][8];
        
        Move task1 = new Move(arraymap);
        Thread t1 = new Thread(task1);
        
        PrintMap task2 = new PrintMap(arraymap);
        Thread t2 = new Thread(task2);
        
        t1.start();
        t2.start();
    }
}
