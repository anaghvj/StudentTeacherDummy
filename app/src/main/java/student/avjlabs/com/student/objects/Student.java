package student.avjlabs.com.student.objects;

import java.io.Serializable;

/**
 * Created by mypoolin on 11/25/2017.
 */

public class Student implements Serializable {
    int rollNo;
    String name;
    String address;
    int mobile;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

  }
