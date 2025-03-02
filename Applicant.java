import java.util.List;
import java.util.ArrayList;

public class Applicant {
  private String firstName;
  private String lastName;
  private int expectedSalary;
  private List<String>education;
  private List<String>experience;
  private String earliestStartDate;

  public Applicant(String firstName, String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
    this.education=new ArrayList<String>();
    this.experience=new ArrayList<String>();
  }
  
  public String getFirstName(){
    return firstName;
  }

  public void setFirstName(String firstName){
    this.firstName=firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getExpectedSalary() {
    return expectedSalary;
  }

  public void setExpectedSalary(int expectedSalary) {
    this.expectedSalary = expectedSalary;
  }

  public List<String> getEducation() {
    return education;
  }

  public void setEducation(List<String> education) {
    this.education = education;
  }

  public List<String> getExperience() {
    return experience;
  }

  public void setExperience(List<String> experience) {
    this.experience = experience;
  }

  public String getEarliestStartDate() {
    return earliestStartDate;
  }

  public void setEarliestStartDate(String earliestStartDate) {
    this.earliestStartDate = earliestStartDate;
  }

  @Override
  public String toString() {
    return "Applicant [firstName=" + firstName + ", lastName=" + lastName + ", expectedSalary=" + expectedSalary
        + ", education=" + education + ", experience=" + experience + ", earliestStartDate=" + earliestStartDate + "]";
  }

  

  
}
