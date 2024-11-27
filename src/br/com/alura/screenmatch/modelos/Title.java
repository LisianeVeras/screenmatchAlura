package br.com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int yearOfRelease;
    private boolean includedPlan;
    private double sumOfReviews;
    private int totalReviews;
    private int minutesDuration;

   //getters
    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }
    //

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public double getSumOfReviews() {
        return sumOfReviews;
    }

    public void setSumOfReviews(double sumOfReviews) {
        this.sumOfReviews = sumOfReviews;
    }
    //

    public void displaysMovieTechnicalSheet() {
        System.out.println("Movie: " + name);
        System.out.println("Release: " + yearOfRelease);
        System.out.println("Duration: " + minutesDuration);
        System.out.println("Available: " + includedPlan);

    }


    public void rating(double review) {
        sumOfReviews += review;
        totalReviews++;
    }


    public double rateReviews() {
        if (totalReviews == 0) {
            System.out.println("No reviews");
            return 0;
        }
        double average = (sumOfReviews / totalReviews);
        System.out.println("Average rating: " + average);
        return average;
    }

}