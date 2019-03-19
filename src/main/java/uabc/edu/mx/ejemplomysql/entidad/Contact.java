package uabc.edu.mx.ejemplomysql.entidad;


import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="telephone")
    private String telephone;

    @Column(name="email")
    private String email;

    @ManyToOne
    Company company;

    public Contact(String firstname,String lastname, String telephone, String email){
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.email = email;
    }

    public Contact(){
        super();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
