package Spring.SpringHibernateCrud;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import pojo.Employee;

/**
 * Hello world!
 *
 */
public class App {
	static Logger log = Logger.getLogger(App.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		log.debug("First");
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		EmployeeDao EmployeeDao = context.getBean(EmployeeDao.class);

		Employee employee1 = new Employee("Ajinkya");
		Employee employee2 = new Employee("Suraj");
		Employee employee3 = new Employee("Xyz");

		EmployeeDao.save(employee1);
		EmployeeDao.save(employee2);
		EmployeeDao.save(employee3);

		List<Employee> list = EmployeeDao.list();

		for (Employee e : list) {
			System.out.println("Person List::" + e);
		}
	}
}
