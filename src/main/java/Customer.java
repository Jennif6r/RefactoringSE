
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        Enumeration <Rental> enumRentals = rentals.elements();	    
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enumRentals.hasMoreElements()) {
            Rental each = (Rental) enumRentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getcharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

	private double getTotalCharge() {
		double result = 0;
		Enumeration <Rental>enumRentals = this.rentals.elements();
		while (enumRentals.hasMoreElements()) {
			Rental each = (Rental) enumRentals.nextElement();
			result += each.getcharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration <Rental> enumRentals = this.rentals.elements();
		while (enumRentals.hasMoreElements()) {
			Rental each = (Rental) enumRentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	
	public String htmlStatement() {
		Enumeration <Rental> enumRentals = this.rentals.elements();
		String result = "<H1>Rentals for <EM>" + getName() + "</EM><H1><P>\n";
		while (enumRentals.hasMoreElements()) {
			Rental each = (Rental) enumRentals.nextElement();
			// show figures for each rental
			result += each.getMovie().getTitle() + ": " + String.valueOf(each.getcharge()) + "<BR>\n";
		}
		// add footer lines
		result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
		return result;
	}
}

    