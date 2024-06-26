package service;

import entity.Customers;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public interface RRSservice {

	LinkedHashMap<Integer,Customers> ac =new LinkedHashMap<Integer,Customers>();
	LinkedHashMap<Integer,Customers> nonAc =new LinkedHashMap<Integer,Customers>();
	LinkedHashMap<Integer,Customers> delux =new LinkedHashMap<Integer,Customers>();
	ArrayList<Customers> l1 = new ArrayList<Customers>();
	
	public void checkIn();
	public void roominfo();
	public void checkAvailablity();
	public void allocate(LinkedHashMap<Integer,Customers> m,double customer_amount,String roomtype,int roomno);
	public void checkOut();
	

	
	
}
