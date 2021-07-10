package shop.vinoweknow.api.seller.domain;

import lombok.Data;

import javax.persistence.Column;

@Data
public class SellerDto {
    private long sellerId;
    private String sellerName;
    private String sellerType;
    private String sellerContact;
    private String sellerAdress;
    private String sellerPage;
    private String sellerReview;
}
