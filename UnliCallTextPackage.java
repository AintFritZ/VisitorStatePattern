public class UnliCallTextPackage implements UnliCallTextOffer {

    @Override
    public String showUnliCallTextOffer(String telecommunicationCompany, boolean unliCallText) {
        return telecommunicationCompany + (unliCallText ? " offers unlimited calls and texts." : " does not offer unlimited calls and texts.");
    }
}
