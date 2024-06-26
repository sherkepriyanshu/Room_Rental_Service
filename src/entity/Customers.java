package entity;

public class Customers {



	private int cid;
	private String cname;
	private long cphone;
	private String Addharno;
	private double amount;
	private String roomType;
	
	public Customers (int cid,String cname,long cphone,String Addharno,double amount,String roomType)
	{
		this.cid=cid;
		this.cname=cname;
		this.cphone=cphone;
		this.Addharno = Addharno;
		this.amount=amount; 
		this.roomType=roomType;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getCphone() {
		return cphone;
	}

	public void setCphone(long cphone) {
		this.cphone = cphone;
	}

	public String getAddharno() {
		return Addharno;
	}

	public void setAddharno(String addharno) {
		Addharno = addharno;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	

	

}
