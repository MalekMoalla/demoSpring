package tn.esprit.demo.entity;

import jakarta.persistence.*;

@Entity
public class DetailUser {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idDetail;
    //classe fille
    @OneToOne(mappedBy = "detailUser")
    User user;
}
