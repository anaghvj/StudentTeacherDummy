package student.avjlabs.com.student.objects;

import java.io.Serializable;

/**
 * Created by mypoolin on 11/25/2017.
 */

public class Teacher implements Serializable {
    int teacherId;
    String name;
    int mobile;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
