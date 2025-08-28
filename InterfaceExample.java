interface Institute{
    void Register();
    void Students();
    void Faculty();
    void Infrastructure();
    static void sportsFacility(){
        System.out.println("Sports Facility is Optional");
    }
    default void medicalFacility(){
        System.out.println("Medical Facility is Optional");
    }
}
class ABES implements Institute{
    @Override
    public void Register(){
        System.out.println("Register in ABES");
    }
    @Override
    public void Students(){
        System.out.println("Students in ABES");
    }
    @Override
    public void Faculty(){
        System.out.println("Faculty in ABES");
    }
    @Override
    public void Infrastructure(){
        System.out.println("Infrastructure in ABES");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        ABES obj = new ABES();
        obj.Register();
        obj.Students();
        obj.Faculty();
        obj.Infrastructure();
        obj.medicalFacility();
        Institute.sportsFacility();
    }
}
