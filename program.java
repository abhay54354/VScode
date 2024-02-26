public class program {

    String name , address;
    int empid, age;
    long withdrow(int salary){
        return salary;
    }
    public static void main(String[] args) {
        program emp = new program();
        System.out.println("program salary"+emp.withdrow(500));
    }
}