public class Job {
  private Company company;
  private String position;
  private String description;
  private int salary;

  public Job(Company company, String position, String description){
    this.company=company;
    this.position=position;
    this.description=description;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Job [company=" + company + ", position=" + position + ", description=" + description + ", salary=" + salary
        + "]";
  }
  
  
}
