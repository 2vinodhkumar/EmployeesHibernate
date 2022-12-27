import net.erp.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Date;
import java.util.List;

public class EmployeesMain {
    public static void main(String[] args) {
        try {
            Configuration configuration=new Configuration();
                configuration.configure();
            ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory(serviceRegistry);
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            @SuppressWarnings("unchecked")
            List<Employees> employees=(List<Employees>)session.createQuery("FROM Employees").list();
//            Employees employees=new Employees();
//            employees.setBirthDate(new Date());
//            employees.setFirstName("Vinodh");
//            employees.setLastName("Kumar");
//            employees.setGender("M");
//            employees.setHireDate(new Date());
//            session.save(employees);
            session.getTransaction().commit();
//            for(Employees employees1:employees)
//                System.out.println(employees1.getFirstName());

//            List<DeptManager> deptManagers=(List<DeptManager>) session.createQuery("FROM DeptManager").list();
//            for (DeptManager deptManager:deptManagers)
//                System.out.println(deptManager.toString());
//            List<Departments> departments=(List<Departments>) session.createQuery("From Departments").list();
//            for (Departments departments1:departments)
//                System.out.println(departments1.toString());
//                List<Titles> titles=(List<Titles>) session.createQuery("From Titles").list();
//                for(Titles titles1: titles)
//                    System.out.println(titles1.toString());
//            List<DeptEmp> deptEmps=(List<DeptEmp>) session.createQuery("From DeptEmp").list();
//            for (DeptEmp deptEmp:deptEmps)
//                System.out.println(deptEmp.toString());
            List<Salaries> salaries=(List<Salaries>) session.createQuery("From Salaries").list();
            for(Salaries salaries1:salaries)
                System.out.println(salaries1.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
