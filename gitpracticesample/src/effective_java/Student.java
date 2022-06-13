package effective_java;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String fullName;
    private int ssn;

    public Student(String fullName, int ssn, int secCode) {
        this.fullName = fullName;
        this.ssn = ssn;
        this.secCode = secCode;
    }

    public int getSecCode() {
        return secCode;
    }

    public void setSecCode(int secCode) {
        this.secCode = secCode;
    }

    //transient won't serialize
    transient int secCode = 103;

    public Student(String fullName, int ssn) {
        this.fullName = fullName;
        this.ssn = ssn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
}
