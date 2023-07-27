package _1_july.easy_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _Test {

    public static void main(String[] args) {

        List<EmpDto> employeesList = new ArrayList<>();

        EmpDto emp1 = new EmpDto();
        emp1.setEmpName("Emp Name 1");
        emp1.setEmpSalary(111);
        emp1.setEmpAge(100);
        emp1.setManagerName("Manager 1");

        EmpDto emp2 = new EmpDto();
        emp2.setEmpName("Emp Name 2");
        emp2.setEmpSalary(222);
        emp2.setEmpAge(120);
        emp2.setManagerName("Manager 2");

        EmpDto emp3 = new EmpDto();
        emp3.setEmpName("Manager 3");
        emp3.setEmpSalary(333);
        emp3.setEmpAge(170);
        emp3.setManagerName(null);

        EmpDto emp4 = new EmpDto();
        emp4.setEmpName("Emp Name 4");
        emp4.setEmpSalary(111);
        emp4.setEmpAge(100);
        emp4.setManagerName("Manager 4");

        EmpDto emp5 = new EmpDto();
        emp5.setEmpName("Emp Name 5");
        emp5.setEmpSalary(111);
        emp5.setEmpAge(100);
        emp5.setManagerName("Manager 3");

        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);
        employeesList.add(emp4);
        employeesList.add(emp5);

        List<String> managers = new ArrayList<>();
        HashMap<String, EmpDto> hm = new HashMap();

        for (EmpDto i: employeesList) {
            if(i.getManagerName() != null && !managers.contains(i.getManagerName()))
            managers.add(i.getManagerName());
            if(i.getManagerName() == null)
                managers.add(i.getEmpName());
        }


        managers.stream().forEach(System.out::println);

        for(EmpDto i: employeesList){
            if(i.getManagerName()!=null)
            hm.put(i.getManagerName(), i);
        }

        for(Map.Entry<String, EmpDto> i:hm.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue().toString());
        }
    }
}

class EmpDto {

    private String empName;
    private int empSalary;
    private int empAge;
    private String managerName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "EmpDto{" +
                "empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAge=" + empAge +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}