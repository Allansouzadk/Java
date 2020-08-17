package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
private Date date;
private OrderStatus status;
private Clients client ;
private List<OrderItem> itens = new ArrayList<>();
private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");




public Order() {
}
public Order(Date date, OrderStatus status, Clients client) {
	this.date = date;
	this.status = status;
	this.client = client;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public OrderStatus getStatus() {
	return status;
}
public void setStatus(OrderStatus status) {
	this.status = status;
}
public Clients getClient() {
	return client;
}
public void setClient(Clients client) {
	this.client = client;
}

public void addInten(OrderItem iten) {
	itens.add(iten);	
}
public void removeInten(OrderItem iten) {
	itens.remove(iten);	
}
public Double total() {
	double sum = 0.0;
	for (OrderItem it : itens) {
		sum = sum + it.subTotal();
			}
	return sum;
}
@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Order moment: ");
	sb.append(sdf.format(date) + "\n");
	sb.append("Order status: ");
	sb.append(status + "\n");
	sb.append("Client: ");
	sb.append(client + "\n");
	sb.append("Order items:\n");
	for (OrderItem item : itens) {
		sb.append(item + "\n");
	}
	sb.append("Total price: $");
	sb.append(String.format("%.2f", total()));
	return sb.toString();
}	
}

