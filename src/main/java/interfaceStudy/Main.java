package interfaceStudy;

public class Main {

    public void main(){
        PolarBear polarBear = new PolarBear();
        Mamal mamal=polarBear;
        Swimmer swimmer=polarBear;

        GlidingLizard glidingLizard=new GlidingLizard();
        Eagle eagle = new Eagle();

        Hunter[] hunters={
            polarBear,glidingLizard,eagle
        };

        for (Hunter hunter: hunters){
            hunter.hunt();
        }

        FoodSafety.announcement();

        PizzaCmp pizzaCmp=new PizzaCmp();

        pizzaCmp.regularInspection();
        pizzaCmp.cleanKitchen();
        pizzaCmp.employeeEducation();
        // 안됌->pizzaCmp.announcement();
    }


}
