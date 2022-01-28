package takecare.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pharmacies {
    @Id
    private int id;

    private String pharmacy_Name;

    private String address;

    private String email;
    private String phone_Number;
    private String description;
    private String password;
    private String url;
    private String pharmacien_Titulaire;
    private String numero_Ordre;
    private String numero_Agrement;


}


