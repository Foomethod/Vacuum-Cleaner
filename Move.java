

import java.util.Random;

public class Move implements Runnable{

    int end = 0;
    int[][] array;
	int initial_left = 0;
	int initial_right = 0;
	int movement;
	Random rand = new Random();
        
        public Move(int[][] arraymap)
        {
            array = arraymap;
        }
	
	public void action()
	{
		movement = rand.nextInt(4) + 1;
		array[initial_left][initial_right] = 0;
	
		switch(movement)
		{
		case 1: 
			if(initial_left > 0)
			{
				initial_left--;
			}
                break;
                    
		case 2:
			if(initial_left < 7)
			{
				initial_left++;
			}
                break;
                    
		case 3:
			if(initial_right > 0)
			{
				initial_right--;
			}
                break;
                    
		case 4:
			if(initial_right < 7)
			{
				initial_right++;
			}
                break;
		}
                
		
		array[initial_left][initial_right] = 1;
	}
        
        public void run()
	{
		while(end != -1)
                {
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			action();
                }
	}
	
}
