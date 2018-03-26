package bit.javaoop;

public class Main {
    public static void main(String[] args) {

        Company MarekCO = new Company("MarekCO");
        MarekCO.hireCEO("Marek",70_000);
        MarekCO.getExecutive().HireManager("Piotrek",40_000,"FixedBudget");
        MarekCO.getExecutive().getManagerByName("Piotrek").Hire("Pani Helenka",20_000);
        MarekCO.getExecutive().getManagerByName("Piotrek").Hire("Mariusz",10_000);
        MarekCO.getExecutive().getManagerByName("Piotrek").Hire("Zbyszek",15_000);
        MarekCO.getExecutive().getManagerByName("Piotrek").Hire("Bogdan",17_000);
        MarekCO.getExecutive().HireManager("Rob",40_000,"FixedNumber");
        MarekCO.getExecutive().getManagerByName("Rob").Hire("Ela",16_000);
        MarekCO.getExecutive().getManagerByName("Rob").Hire("Radek",9_000);
        MarekCO.getExecutive().getManagerByName("Rob").Hire("Karol",18_000);
        MarekCO.getExecutive().getManagerByName("Rob").Hire("Mariola",14_000);
        if(MarekCO.getExecutive().getManagerByName("Piotrek").getEmployeeByName("Pani Helenka").isSatisfied()){
            System.out.println("Pani Helenka jest bardzo zadowolona!!");
        }
        System.out.println(MarekCO.toString());
    }

}
