package rocks.zipcode.io.quiz3.collections.student;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.collections.Lab;
import rocks.zipcode.io.quiz3.collections.Student;

/**
 * @author leon on 10/12/2018.
 */
public class GetLabTest {
    @Test
    public void test1() {
        // given
        String labName = "asdsadsr";
        Lab expected = new Lab(labName);
        Student student = new Student();
        student.forkLab(expected);

        // when
        Lab actual = student.getLab(labName);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String labName = "sda dasdassa";
        Lab expected = new Lab(labName);
        Student student = new Student();
        student.forkLab(expected);

        // when
        Lab actual = student.getLab(labName);

        // then
        Assert.assertEquals(expected, actual);
    }
}
