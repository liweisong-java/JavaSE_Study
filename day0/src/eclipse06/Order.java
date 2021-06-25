package eclipse06;

public class Order {
	private int orderld;
	private String orderName;
	
	
	public int getOrderld() {
		return orderld;
	}
	public void setOrderld(int orderld) {
		this.orderld = orderld;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Order(int orderld, String orderName) {
		super();
		this.orderld = orderld;
		this.orderName = orderName;
	}
	
	public boolean equals(Object obj){
			if(this == obj) {
				return true;
			}
			
			if(obj instanceof Order) {
				Order order = (Order)obj;
				return this.orderld == order.orderld && this.orderName.equals(order.orderName);
			}
			return false;
	}
	
}
