package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_info")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int e_id;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + "]";
	}

}
