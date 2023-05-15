package Assignment;

public class SeasonFinder {

    String season;

    void meth1(String month) {
        switch (month.toLowerCase()) {
            case "january":
            case "february":
            case "december":
                season = "Winter";
                break;

            case "march":
            case "april":
            case "may":
                season = "Spring";
                break;

            case "june":
            case "july":
            case "august":
                season = "Summer";
                break;

            case "september":
            case "october":
            case "november":
                season = "Autumn";
                break;

            default:
                System.out.println("Invalid month name");
                return;
        }

        System.out.println("The season for " + month + " is " + season);
    }
    public static void main(String[] args) {
        new SeasonFinder().meth1("october");
    }
}