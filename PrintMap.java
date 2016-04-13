/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 14052237
 */
public class PrintMap implements Runnable{
    
    int end = 0;
    int[][] arraymap;
    
    public PrintMap(int[][] array)
	{
            arraymap = array;
	}
    
    public void printing()
    {
            System.out.println("*********************************************************");
            for(int i = 0;i < 8; i++)
            {
                for(int j = 0; j < 8; j++)
                {
                    System.out.printf("%d\t",arraymap[i][j]);
                }
                System.out.println();
            }
            System.out.println("*********************************************************");
    }
    public void run()
    {
        while(end != -1)
        {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
            printing();
        }
    }
}
