package pack3;

public class Member {
   String Name;
   int age;
   double Salary;
}

class MemberVariable{
    Member m = new Member();
    public String printMember() {

        m.Name = "Priya";
        m.age = 55;
        m.Salary = 10000.0;

        return m.Name+" "+m.age+" "+m.Salary;
    }
}