package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    Lab lab = new Lab();
    List<Lab> labs;
//    String name;
    public Student() {
//        this(null);
        this.labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {

    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    }

    public void forkLab(Lab lab) {
        System.out.println("aaa");
        System.out.println(this);
        System.out.println(this.lab);
        this.getLabStatus("PENDING");
        System.out.println("end");
//        System.out.println(this.getLabStatus(lab));
//        System.out.println(LabStatus.valueOf(String.valueOf(lab)));
//        System.out.println( lab.status );


    }

    public LabStatus getLabStatus(String labName) {
        return LabStatus.valueOf(labName);
    }
}
