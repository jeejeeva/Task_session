package assignment.task;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1) 1 3 5 7 9
 * 2) 0 2 6 8 10
 * 3) 3 6 9 12 15
 * 4) 25 20 15 10 5 
 * 
 *  int no =1;
 *  sysout (1+" ");
 * 
 * */
		Assignment as = new Assignment();
		as.first_task();
		System.out.println();
		as.second_task();
		System.out.println();
		as.third_task();
		System.out.println();
		as.forth_task();
		
	}

	public void forth_task() {
		// TODO Auto-generated method stub
		int no =25;
		while (no>=5)
		{
			System.out.print(no+" ");
			no = no -5;
			
		}
	}


	public void second_task()
	{
		int no = 0;
		while(no<=10)
		{
			System.out.print(no+" ");
			no = no +2;
		}
	}
	
	
	public void third_task()
	{
		
		int no = 3;
		while (no <= 15)
		{
			System.out.print(no+" ");
			no = no + 3;
		}
	}
	public void first_task() 
	{
		// TODO Auto-generated method stub
		int no =1;
		while(no<=9)
		{
			System.out.print(no+" ");
			no = no +2;
		}
	}
	
	
}
