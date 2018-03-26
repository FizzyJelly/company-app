package bit.javaoop;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;

public abstract class Manager extends AbstractEmployee {

    protected List<Employee> employees;



    public Manager(String name, double salary) {
        super(name, salary);
        this.employees=new ArrayList<Employee>();
    }

    public Employee getEmployeeByName(String name){
        Employee none =new Employee("None",0);
        for(Employee x: employees){
            if(x.getName()==name) return x;
        }
        return none;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public abstract boolean canHire(double salary);

    public abstract void Hire(String name, double salary);

}
