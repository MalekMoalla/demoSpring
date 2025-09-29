package tn.esprit.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "t_user")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUser;
    @Column(nullable = false)
            @NonNull
    String nom;
    String prenom;
    @Column(length = 8, unique = true)
    Long cin;
    @Enumerated(EnumType.STRING)
    TypeUser type;
    @OneToOne
    DetailUser detailUser;
    @OneToMany(mappedBy = "user")
    Set<Fiche> fiche;
}
