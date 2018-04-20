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
        StringBuilder result = new StringBuilder("");
        result.append("\n\n\n\t\t\tCompany under name: " + this.getName() + "\n");
        result.append("Led by CEO: "+ this.getExecutive().getName()+ "\n");
        for(AbstractManager x: this.getExecutive().getManagers()){
            result.append("Hiring a manager: " + x.getName()+ "\n   Who supervises employees: \n");
                for(Employee y: x.getEmployees()){
                    result.append("\t\t" + y.getName()+"\n");
                }
        }

        return result.toString();
    }
}
