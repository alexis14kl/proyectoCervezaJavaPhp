package code.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_User")
	private int Id_User;
	
	@Column(name="Name_User")
	private String Name_User;
	
	@Column(name="LastName_User")
	private String LastName_User;
	
	@Column(name="Email_User")
	private String Email_User;
	
	@Column(name="Password_User")
	private String Password_User;
	
	@Column(name="Id_Rol_User")
	private int Id_Rol_User;

	public int getId_User() {
		return Id_User;
	}

	public void setId_User(int id_User) {
		Id_User = id_User;
	}

	public String getName_User() {
		return Name_User;
	}

	public void setName_User(String name_User) {
		Name_User = name_User;
	}

	public String getLastName_User() {
		return LastName_User;
	}

	public void setLastName_User(String lastName_User) {
		LastName_User = lastName_User;
	}

	public String getEmail_User() {
		return Email_User;
	}

	public void setEmail_User(String email_User) {
		Email_User = email_User;
	}

	public String getPassword_User() {
		return Password_User;
	}

	public void setPassword_User(String password_User) {
		Password_User = password_User;
	}

	public int getId_Rol_User() {
		return Id_Rol_User;
	}

	public void setId_Rol_User(int id_Rol_User) {
		Id_Rol_User = id_Rol_User;
	}

	@Override
	public String toString() {
		return "User [Id_User=" + Id_User + ", Name_User=" + Name_User + ", LastName_User=" + LastName_User
				+ ", Email_User=" + Email_User + ", Password_User=" + Password_User + ", Id_Rol_User=" + Id_Rol_User
				+ "]";
	}
	


}
