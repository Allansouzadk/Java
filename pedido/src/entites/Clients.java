package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clients {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
private String name;
private String email;
private Date dataDeaniversario;

public Clients() {
}

public Clients(String name, String email, Date dataDeaniversario) {
	this.name = name;
	this.email = email;
	this.dataDeaniversario = dataDeaniversario;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Date getDataDeaniversario() {
	return dataDeaniversario;
}

public void setDataDeaniversario(Date dataDeaniversario) {
	this.dataDeaniversario = dataDeaniversario;
}

public String toString() {
	return 
			name + "(" + sdf.format(dataDeaniversario) + ") - " +	email;
	
}

}
