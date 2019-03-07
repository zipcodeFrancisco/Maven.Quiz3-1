package rocks.zipcode.io.quiz3.collections.student;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.collections.Lab;
import rocks.zipcode.io.quiz3.collections.Student;
import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

/**
 * @author leon on 10/12/2018.
 */
public class ToStringTest {
    @Test
    public void test1() {
        // given
        String labName = "blerpp";
        Lab duplicateDeleter = new Lab("blerpp");
        Lab learnerLab = new Lab("blarpp");
        Student student = new Student();
        LabStatus completed = LabStatus.valueOf("COMPLETED");
        String expected = "blerpp > COMPLETED\nblarpp > PENDING";

        // when
        student.forkLab(learnerLab);
        student.forkLab(duplicateDeleter);
        student.setLabStatus(labName, completed);
        String actual = student.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String casinoLabName = "asdaads";
        String learnerLabName = "lncbnv";
        Lab casino = new Lab(casinoLabName);
        Lab learnerLab = new Lab(learnerLabName);
        Student student = new Student();
        LabStatus completed = LabStatus.valueOf("COMPLETED");
        LabStatus incomplete = LabStatus.valueOf("INCOMPLETE");
        String expected = "asdaads > COMPLETED\nlncbnv > INCOMPLETE";

        // when
        student.forkLab(learnerLab);
        student.forkLab(casino);
        student.setLabStatus(casinoLabName, completed);
        student.setLabStatus(learnerLabName, incomplete);
        String actual = student.toString();

        Assert.assertEquals(expected, actual);
    }
}
