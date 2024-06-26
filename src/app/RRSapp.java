package app;

import 
java.util.Scanner;
import service.*;
import entity.*;

public class RRSapp {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		RRSservice r = new RRSserviceimpl();
		System.out.println("========Welcome To Room Rental System==========");
		boolean flag = true;
		while(flag)
		{
			System.out.println("================Menu===========");
			System.out.println("1.RoomInfo\n2.Rooms Availability");
			System.out.println("3.CheckIn "
					+ "\n4.Exit");
			System.out.println("========Enter Your Option=======");
			int op= ip.nextInt();
			switch(op)
			{
			case 1:r.roominfo();break;
			case 2:r.checkAvailablity();break;
			case 
			3:r.checkIn();break;
			
			case 4:System.out.println("thansk");flag=false;break;
			
			
			default:System.out.println("Wrong input");
			}
		}
	}
}
