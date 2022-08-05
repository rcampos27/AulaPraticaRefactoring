import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = stringRentalsFor(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += stringMovieCharge(each) ;
        }
        //add footer lines
        result += stringOwe(aCustomer);
        result += stringEarned(aCustomer);
        return result;
    }

    public abstract String stringRentalsFor(Customer aCustomer);

    public abstract String stringMovieCharge(Rental each);

    public abstract String stringOwe(Customer aCustomer);

    public abstract String stringEarned(Customer aCustomer);

}