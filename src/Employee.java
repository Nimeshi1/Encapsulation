 class Employee {
    private int emp;
    private String email;
    private float salary;
    private long acc;
    public int getEmp() {return emp;}
     public String getEmail() {return email;}
     public float getSalary() {return salary;}
     public long getAcc() {return acc;}
     public void setEmp(int emp) {this.emp = emp;}
     public void setEmail(String email) {this.email = email;}
     public void setSalary(float salary) {this.salary = salary;}
     public void setAcc(long acc) {this.acc = acc;}}
 class Test { public static void main(String[] args) { Employee e = new Employee();
         e.setEmp(8120641); e.setEmail("nimeshisathya07@gmail.com");
         e.setSalary(200000f); e.setAcc(123456789987654321L);
         System.out.println("Employee number:-" + e.getEmp());
         System.out.println("Email:-" + e.getEmail());
         System.out.println("Salary:-" + e.getSalary());
         System.out.println("Account number:-" + e.getAcc());}}

