public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double price) {
        return telcoName + " offers a data allowance for the price of ₱" + price;
    }
}
