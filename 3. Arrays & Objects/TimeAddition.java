package array_and_objects;
import java.util.Scanner;
class Time
{
	int hours;
	int minutes;
	int seconds;
	
	public Time(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public void addTime(Time t1){
		this.seconds  += t1.seconds;
		if(this.seconds>=60){
			this.minutes+=1;
			this.seconds-=60;
		}
		
		this.minutes += t1.minutes;
		if(this.minutes>=60){
			this.hours+=1;
			this.minutes-=60;
		}
		
		this.hours += t1.hours;
	}
}

public class TimeAddition
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter hours, minutes, second (Time 1st): ");
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int s1 = sc.nextInt();
		
		System.out.println("Enter hours, minutes, second (Time 2nd): ");
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int s2 = sc.nextInt();
		
		Time t1 = new Time(h1, m1, s1);
		Time t2 = new Time(h2, m2, s2);
		t1.addTime(t2);
		
		System.out.println(t1.hours+":"+t1.minutes+":"+t1.seconds);
	}
}