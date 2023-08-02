package task;
import java.util.Scanner;
class DayInc{
	int day,month,year;
	public void input(){
		Scanner s =new Scanner(System.in);
		System.out.println("Date:");
		day=s.nextInt();
		System.out.println("Month:");
		month=s.nextInt();
		System.out.println("Year:");
		year=s.nextInt();
		
	}
	public void output() {
		
         switch(month){
         case 4,6,9,11: if(day<=29){
     						day++;
     						System.out.println("Tommorow Date is:"+day+"-"+month+"-"+year);
    	                }
         				else if(day==30) {
         						day=0;
         						day++;
         						month++;
         						System.out.println("Tommorow Date is:"+day+"-"+month+"-"+year);
         				}
         				break;
  
         case 1,3,5,7,8,10,12:if(day<=30) {
        	 					day++;
        	 					System.out.println("Tommorow Date is:"+day+"-"+month+"-"+year);
        	 				}
         					else if(day==31) {
         						day=0;
         						day++;
         						month++;
         						System.out.println("Tommorow Date is:"+day+"-"+month+"-"+year);
         					}
         					break;
         case 2: if(year%4!=0&&day<=27) {
        	 		day++;
 					System.out.println("Tommorow Date is:"+day+"-"+month+"-"+year);
              	 }
               else if(year%4!=0&&day==28) {
        	 		day=1;
        			 month++;
        	 		System.out.println("Tommorow Date is:"+day+"-"+month+"-"+year);
                }
         		else if(year%4==0&&day<=28) {
         			 day++;
         			System.out.println("Tommorow Date is:"+day+"-"+month+"-"+year);
        	 	}
         		else if(year%4==0&&day==29){
                    day=1;
         			month++;
         			System.out.println("Tommorow Date is:"+day+"-"+month+"-"+year);
                }
               break;
        	 	
    }
}
}

public class Time {

	public static void main(String[] args) {
     DayInc da=new DayInc();
     da.input();
     da.output();
  }

}
