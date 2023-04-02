import java.util.*;
class prog {
    Scanner s = new Scanner(System.in);
    int age, sal;
    String nm;
    void g() {
        System.out.println("Enter Employee Name");
        nm = s.nextLine();
        System.out.println("Enter Employee Age");
        age = s.nextInt();
        System.out.println("Enter Employee Salary");
        sal = s.nextInt();
        s.nextLine();
    }
}
class emp {
    public static void main(String args[]) {
        prog p[] = new prog[5];
        for (int i = 0; i < 5; i++) {
            p[i] = new prog();
            p[i].g();
        }
        for(int turn=0;turn<4;turn++)
        {
            for(int j=0;j<4-turn;j++)
            {
                if(p[j].sal>p[j+1].sal)
                {
                    prog t1=p[j];
                    p[j]=p[j+1];
                    p[j+1]=t1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + " Details:");
            System.out.println("Name: " + p[i].nm);
            System.out.println("Age: " + p[i].age);
            System.out.println("Salary: " + p[i].sal);
        }
    }
}
