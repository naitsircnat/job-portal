import java.util.Date;

public class Application {
  private Job job;
  private Applicant applicant;
  private Date applicationDate;
  
  public Application (Job job, Applicant applicant){
    this.applicant=applicant;
    this.job=job;
    this.applicationDate=new Date();
  }

  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  public Applicant getApplicant() {
    return applicant;
  }

  public void setApplicant(Applicant applicant) {
    this.applicant = applicant;
  }

  public Date getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(Date applicationDate) {
    this.applicationDate = applicationDate;
  }

  @Override
  public String toString() {
    return "Application [job=" + job + ", applicant=" + applicant + ", applicationDate=" + applicationDate + "]";
  }

}
