import java.util.Scanner;


public class TableLogic {
	int num;
	
	public TableLogic() {
		this.num = num;
		System.out.println("Enter no for the table: ");
		Scanner n = new Scanner(System.in) ;
		num = n.nextInt();
		System.out.println("Table of "+num);
		
	}
	
	public void logic() {
		for(int i=1; i<=10; i++) {
			System.out.println(i*this.num);
		}
	}


}
