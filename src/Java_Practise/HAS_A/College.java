package Java_Practise.HAS_A;

public class College {
    private String collegeName;
    private String collegeLocation;

    public College(String collegeName, String collegeLocation) {
        this.collegeName = collegeName;
        this.collegeLocation = collegeLocation;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLocation() {
        return collegeLocation;
    }
}
