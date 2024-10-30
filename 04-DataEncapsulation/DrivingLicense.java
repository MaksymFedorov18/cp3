public class DrivingLicense {
    private String name;
    private String surname;
    private int age;
    private int licenseNumber;
   

    
    public DrivingLicense(String name, String surname, int licenseNumber) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setLicenseNumber(licenseNumber);
    }

   
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge(){
        return age;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }


    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Driver's age: " + getAge());
        System.out.println("License Number: " + getLicenseNumber());
    }


}

