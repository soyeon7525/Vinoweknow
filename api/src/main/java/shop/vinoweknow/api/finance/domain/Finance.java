package shop.vinoweknow.api.finance.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "finances")
public class Finance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long sellerId;
    @Column private String profit;
    @Column private String income;
    @Column private String tax;
    @Column private String netIncome;
    @Column private String asset;
    @Column private String ca;
    @Column private String fa;
    @Column private String liabilities;
    @Column private String cl;
    @Column private String fl;
    @Column private String capital;


}
