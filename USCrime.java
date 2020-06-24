public class USCrime {
	// Private variables for the class USCrime.
    private int population;
    private float murderRate;
    private float robberyRate;
	// Builds an array for each data value under each year in the file.
    String[] year1994 = new String[20];
	String[] year1995 = new String[20];
	String[] year1996 = new String[20];
	String[] year1997 = new String[20];
	String[] year1998 = new String[20];
	String[] year1999 = new String[20];
	String[] year2000 = new String[20];
	String[] year2001 = new String[20];
	String[] year2002 = new String[20];
	String[] year2003 = new String[20];
	String[] year2004 = new String[20];
	String[] year2005 = new String[20];
	String[] year2006 = new String[20];
	String[] year2007 = new String[20];
	String[] year2008 = new String[20];
	String[] year2009 = new String[20];
	String[] year2010 = new String[20];
	String[] year2011 = new String[20];
	String[] year2012 = new String[20];
	String[] year2013 = new String[20];
	// Creates two arrays that will only temporarily hold values inside of methods used later.
	String[] temp1 = new String[20];
    String[] temp2 = new String[20];
    // Constructor.
    public USCrime() {
    }
    // Getters.
	// Getter method for getYear() creates an array to hold each year.
	public String[] getYear(String year) {
		
		if (year.equals("1994")) {
			return year1994;
		}
		else if (year.equals("1995")) {
			return year1995;
		}
		else if (year.equals("1996")) {
			return year1996;
		}
		else if (year.equals("1997")) {
			return year1997;
		}
		else if (year.equals("1998")) {
			return year1998;
		}
		else if (year.equals("1999")) {
			return year1999;
		}
		else if (year.equals("2000")) {
			return year2000;
		}
		else if (year.equals("2001")) {
			return year2001;
		}
		else if (year.equals("2002")) {
			return year2002;
		}
		else if (year.equals("2003")) {
			return year2003;
		}
		else if (year.equals("2004")) {
			return year2004;
		}
		else if (year.equals("2005")) {
			return year2005;
		}
		else if (year.equals("2006")) {
			return year2006;
		}
		else if (year.equals("2007")) {
			return year2007;
		}
		else if (year.equals("2008")) {
			return year2008;
		}
		else if (year.equals("2009")) {
			return year2009;
		}
		else if (year.equals("2010")) {
			return year2010;
		}
		else if (year.equals("2011")) {
			return year2011;
		}
		else if (year.equals("2012")) {
			return year2012;
		}
		else if (year.equals("2013")) {
			return year2013;
		}
		else {
			return year1994;
		}
	}
    public int getPopulation() {
        return population;
    }
    public float getMurderRate() {
        return murderRate;
    }
    public float getRobberyRate() {
        return robberyRate;
    }
    // Setters.
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setMurderRate(float murderRate) {
        this.murderRate = murderRate;
    }
    public void setRobberyRate(float robberyRate) {
        this.robberyRate = robberyRate;
    }
    public void setYear(String[] splitLine) {

	    if (splitLine[0].equals("1994")) {
			year1994 = splitLine;
		}
		else if (splitLine[0].equals("1995")) {
			year1995 = splitLine;
		}
		else if (splitLine[0].equals("1996")) {
			year1996 = splitLine;
		}
		else if (splitLine[0].equals("1997")) {
			year1997 = splitLine;
		}
		else if (splitLine[0].equals("1998")) {
			year1998 = splitLine;
		}
		else if (splitLine[0].equals("1999")) {
			year1999 = splitLine;
		}
		else if (splitLine[0].equals("2000")) {
			year2000 = splitLine;
		}
		else if (splitLine[0].equals("2001")) {
			year2001 = splitLine;
		}
		else if (splitLine[0].equals("2002")) {
			year2002 = splitLine;
		}
		else if (splitLine[0].equals("2003")) {
			year2003 = splitLine;
		}
		else if (splitLine[0].equals("2004")) {
			year2004 = splitLine;
		}
		else if (splitLine[0].equals("2005")) {
			year2005 = splitLine;
		}
		else if (splitLine[0].equals("2006")) {
			year2006 = splitLine;
		}
		else if (splitLine[0].equals("2007")) {
			year2007 = splitLine;
		}
		else if (splitLine[0].equals("2008")) {
			year2008 = splitLine;
		}
		else if (splitLine[0].equals("2009")) {
			year2009 = splitLine;
		}
		else if (splitLine[0].equals("2010")) {
			year2010 = splitLine;
		}
		else if (splitLine[0].equals("2011")) {
			year2011 = splitLine;
		}
		else if (splitLine[0].equals("2012")) {
			year2012 = splitLine;
		}
		else if (splitLine[0].equals("2013")) {
			year2013 = splitLine;
		}
    }
	// Method to fetch the population growth by percentage.
    public void populationGrowth(String firstYear, String secondYear) {
    	temp1 = getYear(firstYear);
		temp2 = getYear(secondYear);
		// Finds the number of people that the population increased by.
		float popIncrease = Float.parseFloat(temp2[1]) - Float.parseFloat(temp1[1]);
		// Converts that number into a percentage.
    	float popIncreasePercentage = ((popIncrease/Float.parseFloat(temp2[1])) * 100);
    	System.out.println("The increase in population between " + temp1[1] + " and " + temp2[1] + " is: " + popIncreasePercentage + "%.");
	}
	// Method to fetch the year with the highest murder rate.
    public void maxMurderRate() {
    	temp1 = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[5]);
    	for (int i = 1994; i <= 2013; i++) {
    		temp2 = getYear(String.valueOf(i));
    		if (Float.parseFloat(temp2[5]) > tempRate) {
    			tempRate = Float.parseFloat(temp2[5]);
    			temp1 = temp2;
    		}
    	}
    	System.out.println("The murder rate was highest in: " + temp1[0]);
	}
	// Method to fetch the year with the lowest murder rate.
    public void minMurderRate() {
    	temp1 = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[5]);
    	for (int i = 1994; i <= 2013; i++) {
    		temp2 = getYear(String.valueOf(i));
    		if (Float.parseFloat(temp2[5]) < tempRate) {
    			tempRate = Float.parseFloat(temp2[5]);
    			temp1 = temp2;
    		}
    	}
    	System.out.println("The murder rate was lowest in: " + temp1[0]);
	}
	// Method to fetch the year with the highest robbery rate.
    public void maxRobberyRate() {
    	temp1 = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[9]);
    	for (int i = 1994; i <= 2013; i++) {
    		temp2 = getYear(String.valueOf(i));
    		if (Float.parseFloat(temp2[9]) > tempRate) {
    			tempRate = Float.parseFloat(temp2[9]);
    			temp1 = temp2;
    		}
    	}
    	System.out.println("The robbery rate was highest in: " + temp1[0]);
	}
	// Method to fetch the year with the least robbery rate.
    public void minRobberyRate() {
    	temp1 = getYear("1994");
    	float tempRate = Float.parseFloat(year1994[9]);
    	for (int i = 1994; i <= 2013; i++) {
    		temp2 = getYear(String.valueOf(i));
    		if (Float.parseFloat(temp2[9]) < tempRate) {
    			tempRate = Float.parseFloat(temp2[9]);
    			temp1 = temp2;
    		}
    	}
    	System.out.println("The robbery rate was lowest in: " + temp1[0]);
    }
}
