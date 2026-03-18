class Staff {
    String name;
    String ID;
    String department;

    Staff(String n, String id, String dept) {
        name = n;
        ID = id;
        department = dept;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + ID + ", Department: " + department);
    }
}

interface Teaching {
    void conductLecture();
}

interface Research {
    void publishPaper();
}

class Professor extends Staff implements Teaching, Research {
    Professor(String name, String id, String department) {
        super(name, id, department);
    }

    public void conductLecture() {
        System.out.println("Conducting lecture.");
    }

    public void publishPaper() {
        System.out.println("Publishing research paper.");
    }
}

class LabInstructor extends Staff implements Teaching {
    LabInstructor(String name, String id, String department) {
        super(name, id, department);
    }

    public void conductLecture() {
        System.out.println("Conducting lecture.");
    }
}

class ResearchAssistant extends Staff implements Research {
    ResearchAssistant(String name, String id, String department) {
        super(name, id, department);
    }

    public void publishPaper() {
        System.out.println("Publishing research paper.");
    }

    void conductLecture() {
        System.out.println("Not allowed.");
    }
}

public class StaffManagement {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Javeria", "101", "Biology");
        LabInstructor labInst = new LabInstructor("Mr. Saad", "102", "IT Lab");
        ResearchAssistant ra = new ResearchAssistant("Sara", "103", "Economics");

        prof.displayInfo();
        prof.conductLecture();
        prof.publishPaper();

        labInst.displayInfo();
        labInst.conductLecture();

        ra.displayInfo();
        ra.publishPaper();
        ra.conductLecture();
    }
}

