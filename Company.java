import java.util.ArrayList;
import java.util.List;

public class Company {
  private String name;
  private String description;
  private String sector;
  private int size;
  private List<String> locations;
  private List<Job> jobs;

  public Company(String name, String description, String sector, int size, List<String> locations, List<Job>jobs){
    this.name = name;
    this.description =description;
    this.sector = sector;
    this.size=size;
    this.locations=new ArrayList<String>();
    this.jobs=new ArrayList<Job>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public List<String> getLocations() {
    return locations;
  }

  public void setLocations(List<String> locations) {
    this.locations = locations;
  }

  public List<Job> getJobs() {
    return jobs;
  }

  public void setJobs(List<Job> jobs) {
    this.jobs = jobs;
  }

  @Override
  public String toString() {
    return "Company [name=" + name + ", description=" + description + ", sector=" + sector + ", size=" + size
        + ", locations=" + locations + ", jobs=" + jobs + "]";
  }
  
}