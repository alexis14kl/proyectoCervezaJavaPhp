package code.backend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Entity
@Table(name="venta_temporal")
public class ProductTemp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id_venta_Temp")
	private int Id_venta_Temp;	
	@Column(name="New_Cantidad_Temp")
	private String New_Cantidad_Temp;
	@Column(name="Precio_Final")
	private double Precio_Final;
	@Column(name="Id_Producto")
	private int Id_Producto;
	@Column(name="Id_User")
	private int Id_User;	
	
}
