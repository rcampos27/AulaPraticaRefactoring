public class TextStatement extends Statement {

    public String stringRentalsFor(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String stringMovieCharge(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
    }

    public String stringOwe(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String stringEarned(Customer aCustomer) {
        return  "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }

}