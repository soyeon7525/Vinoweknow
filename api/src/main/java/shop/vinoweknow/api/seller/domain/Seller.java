package shop.vinoweknow.api.seller.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long sellerId;
    @Column private String sellerName;
    @Column private String sellerType;
    @Column private String sellerContact;
    @Column private String sellerAdress;
    @Column private String sellerPage;
    @Column private String sellerReview;

}
