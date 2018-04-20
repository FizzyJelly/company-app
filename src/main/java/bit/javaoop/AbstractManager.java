package bit.javaoop;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractManager extends AbstractEmployee {

    protected List<Employee> employees;



    public AbstractManager(String name, double salary) {
        super(name, salary);
        this.employees=new ArrayList<Employee>();
    }

    public Employee getEmployeeByName(String name){
        for(Employee x: employees){
            if(x.getName()==name) return x;
        }
        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public abstract boolean canHire(double salary);

    public abstract void Hire(String name, double salary);

}