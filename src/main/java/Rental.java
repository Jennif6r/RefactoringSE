
class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
	public double getcharge() {
		return movie.getcharge(this.daysRented);
	}
	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(getDaysRented());
	}
}
