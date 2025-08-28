abstract class College{
    abstract void Register();
    abstract void Students();
    abstract void Faculty();
    abstract void Infrastructure();
    void medicalFacility(){
        System.out.println("Medical Facility is Optionl");
    }
}
class KIET extends College{
    @Override
    void Register(){
        System.out.println("Register in KIET");
    }
    @Override
    void Students(){
        System.out.println("Students in KIET");
    }
    @Override
    void Faculty(){
        System.out.println("Faculty in KIET");
    }
    @Override
    void Infrastructure(){
        System.out.println("Infrastructure in KIET");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        KIET obj = new KIET();
        obj.Register();
        obj.Students();
        obj.Faculty();
        obj.Infrastructure();
        obj.medicalFacility();
    }
}
