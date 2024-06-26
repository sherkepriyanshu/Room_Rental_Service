package service;

import java.util.LinkedHashMap;
import java.util.Scanner;

import entity.Customers;

public class RRSserviceimpl implements RRSservice{

	{
		for(int i=101;i<=108;i++)
		{
			ac.put(i, null);
		}
		for(int i=109;i<=116;i++)
		{
			nonAc.put(i, null);
		}
		for(int i=117;i<=124;i++)
		{
			delux.put(i, null);
		}
		
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============Check-IN============");
		System.out.println("=========Room Details=========");
		System.out.println("1.AC\n2.nonAc\n3.delux");
		System.out.println("==========Enter your option==========");
		int op = sc.nextInt();
		System.out.println("Please enter your roomno");
		int roomno =sc.nextInt();
		switch(op)
		{
		case 1: if(ac.containsKey(roomno) && ac.get(roomno)==null)
		{
			allocate(ac,2500,"AC",roomno);
			System.out.println("Allocate");
			
		}
		else
		{
			System.out.println("Invalid roomno or room is not availablr...!!");
		}
		break;
		case 2: if(ac.containsKey(roomno) && ac.get(roomno)==null)
		{
			allocate(ac,2500,"AC",roomno);
			System.out.println("Allocate");
			
		}
		else
		{
			System.out.println("Invalid roomno or room is not availablr...!!");
		}
		break;
		case 3: if(ac.containsKey(roomno) && ac.get(roomno)==null)
		{
			allocate(ac,2500,"AC",roomno);
			System.out.println("Allocate");
			
		}
		else
		{
			System.out.println("Invalid roomno or room is not availablr...!!");
		}
		break;
		default: System.out.println("wrong input");
		}
	}

	

	@Override
	public void roominfo() {
		// TODO Auto-generated method stub
		System.out.println("===========Room Details=============");
		System.out.println("========AC Rooms==============");
		System.out.println("1.AC\n2.TV\n3.WIFI\n4.Fridge");
		System.out.println("Price:2500/day");
	}
	
	@Override
	public void checkAvailablity()
	{
		System.out.println(" =======AC Rooms=========");
		int c = 0;
		for( int key:ac.keySet()) //{101,102,________________108}
		{
			if( ac.get(key) ==null)
			{
				System.out.print(key+" ");
				c++;
			}
		}
		if(c==0)
		{
			System.out.println(" All Rooms Are Occupied>>>>!!");
		}
		System.out.println();
	}



	@Override
	public void allocate(LinkedHashMap<Integer, Customers> m, double customer_amount, String roomtype, int roomno) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("========Customer Details==========");
		System.out.println("please Enter Customer id");
		int cid = sc.nextInt();
		System.out.println("please Enter Customer Name");
		String name = sc.next();
		System.out.println("Please Enter Customer phone");
		long phone = sc.nextLong();
		System.out.println("Please enter the adhar number");
		String addhar= sc.next();
		
		Customers c1 = new Customers(cid,name,phone,addhar,customer_amount,roomtype);
		
		l1.add(c1);
		m.put(roomno, c1);
		System.out.println(c1.getCname()+" has allocate for "+roomtype+"");
		System.out.println("amoun to be paid "+customer_amount);
		
		
	}



	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		System.out.println("=========Check_out==========");
		System.out.println("1.AC\n2.nonAc\n3.delux");
		System.out.println("=====Room details=========");
		System.out.println("Please enter the customer id");
		int id = sc.nextInt();
		System.out.println("please enter the roomno");
		int roomno =sc.nextInt();
		System.out.println("please enter the option");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:if(ac.containsKey(roomno) && ac.get(roomno)!=null && ac.get(roomno).getCid()==id)
		{
			ac.put(roomno, null);
		}
		}
		
	}
	
	
}
