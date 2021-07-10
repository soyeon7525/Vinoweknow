package shop.vinoweknow.api.finance.domain;

import lombok.Data;

@Data
public class FinanceDto {
    private Long sellerId;
    private String profit;
    private String income;
    private String tax;
    private String netIncome;
    private String asset;
    private String ca;
    private String fa;
    private String liabilities;
    private String cl;
    private String fl;
    private String capital;
}
