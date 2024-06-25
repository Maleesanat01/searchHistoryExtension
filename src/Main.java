import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        LinkedListStack searchHistory=new LinkedListStack();
        int response;
        do{
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Insert search record/s (Enter 1)\n");
            System.out.println("2. Display search history (Enter 2)\n");
            System.out.println("3. Delete latest record & display search history (Enter 3)\n");
            System.out.println("4. Display reversed search history (Enter 4)\n");
            System.out.println("5. Display bookmarks (Enter 5)\n");
            System.out.println("6. Exit (Enter 6)\n");
            System.out.println("Your response: ");
            response=scanner.nextInt();
            switch (response) {
                case 1 -> {
                    System.out.println("How many search records do you want to enter? ");
                    int searchRecNum = scanner.nextInt();
                    scanner.nextLine();
                    int i = 1;
                    while (i <= searchRecNum) {
                        System.out.println("Enter Page name: ");
                        String pg_name = scanner.nextLine();

                        System.out.println("Enter Page ID: ");
                        String pg_id = scanner.nextLine();

                        System.out.println("Enter date: ");
                        String pg_date = scanner.nextLine();

                        System.out.println("Enter Page URL: ");
                        String pg_url = scanner.nextLine();

                        System.out.println("Do you want to mark it as a bookmark (true/false): ");
                        Boolean pg_bookmark = scanner.nextBoolean();
                        scanner.nextLine();

                        SearchRecord searchRecord = new SearchRecord(pg_name, pg_id, pg_date, pg_url, pg_bookmark);
                        //insert records to history
                        searchHistory.insertSearchRecord(searchRecord);

                        i++;
                    }
                }
                case 2 ->
                    //display search history
                        searchHistory.displaySearchHistory();
                case 3 -> {
                    //delete record
                    searchHistory.deleteSearchRecord();
                    System.out.println("Your history after latest search record deletion");
                    searchHistory.displaySearchHistory();
                }
                case 4 ->
                    //display reversed search history
                        searchHistory.displayReverse();
                case 5 ->
                    //display bookmarks
                        searchHistory.displayBookmarks();
                case 6 -> {
                    //exit
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Enter valid response!");
            }
        }while(response!=6);
    }
}
