public class Telco implements TelcoSubscription {

    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, int dataAllowance, double promoPrice, boolean unliCallText) {
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo) {
        return promo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage) {
        return unliPackage.showUnliCallTextOffer(telcoName, unliCallText);
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public boolean isUnliCallText() {
        return unliCallText;
    }
}
