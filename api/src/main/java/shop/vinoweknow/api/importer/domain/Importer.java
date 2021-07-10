package shop.vinoweknow.api.importer.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "importers")
public class Importer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long importerId;
    @Column private String importerName;
    @Column private String importerContact;
    @Column private String importerAdress;
    @Column private String importerPage;
    @Column private String importerWine;
}
