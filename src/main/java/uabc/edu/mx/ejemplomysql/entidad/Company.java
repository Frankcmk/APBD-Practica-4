package uabc.edu.mx.ejemplomysql.entidad;


import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name ="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "statudID")
    private int statusID;


    public Company(String name, int statusID){
        this.name = name;
        this.statusID = statusID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

}
