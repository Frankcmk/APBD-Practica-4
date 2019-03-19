package uabc.edu.mx.ejemplomysql.entidad;


import javax.persistence.*;

@Entity
@Table(name="companydetail")
public class CompanyDetail {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name ="id")
    private int id;

    @Column(name="employeeStrength")
    private String employeeStrength;

    @Column(name="notes")
    private String notes;

    public CompanyDetail(String employeeStrength, String notes){
        this.employeeStrength = employeeStrength;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeStrength() {
        return employeeStrength;
    }

    public void setEmployeeStrength(String employeeStrength) {
        this.employeeStrength = employeeStrength;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
