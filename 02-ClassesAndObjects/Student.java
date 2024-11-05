public class Student {
    public String studentId;
    public String name;
    public int semesterNumber;
    public int averageGrade;
    public boolean idCardValid;
    public String surname;
    public String Town;

    public void changeIdCardStatus(boolean newStatus){
        this.idCardValid = newStatus;
    }

    public Student(String studentId, String name, int semesterNumber, int averageGrade, boolean idCardValid,String surname, String Town ) {
        this.studentId = studentId;
        this.name = name;
        this.semesterNumber = semesterNumber;
        this.averageGrade = averageGrade;
        this.idCardValid = idCardValid;
        this.Town = Town;
        this.surname = surname;
    }

    public void displayIdCardInfo() {
        String validity = idCardValid ? "Valid" : "Invalid";
        System.out.println("Name: " + name + " "+surname);
        System.out.println("ID Card Number: "+studentId);
        System.out.println("ID Card Status: "+validity);
        System.out.println("Town: "+Town);
    }
}
