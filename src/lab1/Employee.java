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

    public void giveOrentation(String firstname, String lastName, String ssn,
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

    public boolean isMeetWithHrForBenefitAndSalryInfo() {
        return meetWithHrForBenefitAndSalryInfo;
    }

    public void setMeetWithHrForBenefitAndSalryInfo(boolean meetWithHrForBenefitAndSalryInfo) {
        // needs valadition
        this.meetWithHrForBenefitAndSalryInfo = meetWithHrForBenefitAndSalryInfo;
    }

    public boolean isMeetDepartmentStaff() {
        return meetDepartmentStaff;
    }

    public void setMeetDepartmentStaff(boolean meetDepartmentStaff) {
        //needs valadition
        this.meetDepartmentStaff = meetDepartmentStaff;
    }

    public boolean isReviewDeptPolicies() {
        return reviewDeptPolicies;
    }

    public void setReviewDeptPolicies(boolean reviewDeptPolicies) {
        // needs valadition
        this.reviewDeptPolicies = reviewDeptPolicies;
    }

    private boolean isMoveIntoCubicle() {
        return moveIntoCubicle;
    }

    public void setMoveIntoCubicle(boolean moveIntoCubicle) {
        //needs valadition
        this.moveIntoCubicle = moveIntoCubicle;
    }

    private boolean isMetDeptStaff() {
        return meetDepartmentStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        //needs valadition
        this.meetDepartmentStaff = metDeptStaff;
    }

    private boolean isReviewedDeptPolicies() {
        return reviewDeptPolicies;
    }

    private void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        //needs validation
        this.reviewDeptPolicies = reviewedDeptPolicies;
    }

    private boolean isMovedIn() {
        return moveIntoCubicle;
    }

    public void setMovedIn(boolean movedIn) {
        //needs valadition
        this.moveIntoCubicle = movedIn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            System.out.println("Enter a Valid first name");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        // needs valadition
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        //needs valadition
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        //needs valadidation
        this.birthDate = birthDate;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        if (cubeId == null) {
            System.out.println("Enter a valid cubicale ID");

        }
        this.cubeId = cubeId;
    }

    public Employee() {
    }

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        //
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
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
