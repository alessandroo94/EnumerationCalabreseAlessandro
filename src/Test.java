public class Test {
    public static void main(String[] args) {

        enum Month {
            January, February, March, April, May, June, July, August, September, October, November, December
        }
        for (Month month : Month.values()) {
            String monthName = month.name();
            if (monthName.endsWith("y")) {
                System.out.println(monthName + " ends with y");
            } else {
                System.out.println(monthName + " doesn't end with y");
            }
        }
    }
}