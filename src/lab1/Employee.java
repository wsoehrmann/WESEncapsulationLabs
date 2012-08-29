package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use proper
 * encapsulation and the four other best practices as explained by your
 * instructor.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.01
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean meetWithHrForBenefitAndSalryInfo;
    private boolean meetDepartmentStaff;
    private boolean reviewDeptPolicies;
    private boolean moveIntoCubicle;
    private String cubeId;
    
    

    public void orentation(String firstname, String lastName, String ssn,
            Date birthDate, String cubeID) {

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSsn(ssn);
        this.setBirthDate(birthDate);
        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();
        this.moveIntoCubicle(cubeID);
        
    }

    private boolean isMetDeptStaff() {
        return meetDepartmentStaff;
    }

    private void setMetDeptStaff(boolean metDeptStaff) {
        this.meetDepartmentStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return moveIntoCubicle;
    }

    public void setMovedIn(boolean movedIn) {
        this.moveIntoCubicle = movedIn;
    }
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null)
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }
     public Employee() {
    }

    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
    }

    public String getStatus() {
        if (meetWithHrForBenefitAndSalryInfo && meetDepartmentStaff
                && reviewDeptPolicies && moveIntoCubicle) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }
}
