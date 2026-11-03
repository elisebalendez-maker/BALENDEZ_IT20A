package PatientQueueSystem;

public class Patient {
    private String name;
    private int age;
    private String patientType;
    private String category;

    public Patient(String name, int age, String patientType, String category) {
        this.name = name;
        this.age = age;
        this.patientType = patientType;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientType() {
        return patientType;
    }

    public String getCategory() {
        return category;
    }
}