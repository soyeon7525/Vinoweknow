package shop.vinoweknow.api.importer.domain;

import lombok.Data;



@Data
public class ImporterDto {
    private long sellerId;
    private String sellerName;
    private String sellerType;
    private String sellerContact;
    private String sellerAdress;
    private String sellerPage;
    private String sellerReview;
}
