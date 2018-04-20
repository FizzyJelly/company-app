package bit.javaoop;

import java.util.ArrayList;
import java.util.List;

public class CEO extends AbstractEmployee{

    private List<AbstractManager> managers;


    public CEO(String name, double salary) {
        super(name, salary, new HolidayBonusSalary());
        this.managers = new ArrayList<AbstractManager>();
    }

    public List<AbstractManager> getManagers() {
        return managers;
    }

    public AbstractManager getManagerByName(String name){
        FixedEmployeeNumberManager none=new FixedEmployeeNumberManager("None",0,0);
        for(AbstractManager x: managers){
            if(x.getName()==name) return x;
        }
        return none;
    }

    public void HireManager(String name, double salary, String type){
        if(type=="FixedBudget"){
            managers.add(new FixedBudgetManager(name,salary,150_000));
            System.out.println(name+" was successfully hired as a new fixed budget manager!");
        }
        if(type=="FixedNumber"){
            managers.add(new FixedEmployeeNumberManager(name,salary,10));
            System.out.println(name+" was successfully hired as a new fixed employee number manager!");
        }
    }

    @Override
    public boolean isSatisfied() { //CEO is never satisfied
        return false;
    }
}
