package inheritace;

public class Employee {
    float salary=409999;

}
class programmer extends Employee{
    int bonus=1000;

    public static void main(String[] args) {
        programmer p =new programmer();
        System.out.println(p.salary);
        System.out.println(p.bonus);
    }
}