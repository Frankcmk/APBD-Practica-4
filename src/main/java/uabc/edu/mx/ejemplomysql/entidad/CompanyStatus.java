package uabc.edu.mx.ejemplomysql.entidad;


import javax.persistence.*;

@Entity
@Table(name="companystatus")
public class CompanyStatus {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    public CompanyStatus(String name){
        this.name = name;
    }

}
