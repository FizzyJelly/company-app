package bit.javaoop;

public class Company {
    private String name;
    private CEO executive;


    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public CEO getExecutive() {
        return executive;
    }

    public void hireCEO(String name, double salary) {
        executive = new CEO(name, salary);

    }

    @Override
    public String toString() {
        String result="\n\n\n";
        result+="               Company under name: " + this.getName() + "\n";
        result+="Led by CEO: "+ this.getExecutive().getName()+ "\n";
        for(Manager x: this.getExecutive().getManagers()){
            result+="   Hiring a manager: " + x.getName()+ "\n   Who supervises employees: \n";
                for(Employee y: x.getEmployees()){
                    result+="       " + y.getName()+"\n";
                }
        }

        return result;
    }
}
