package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
