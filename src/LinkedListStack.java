public class LinkedListStack {
    private SearchRecord tos;

    //constructor
    public LinkedListStack(){
        this.tos=null;
    }

    public boolean isEmpty(){
        return tos==null;
    }

    public void insertSearchRecord(SearchRecord search){
        SearchRecord newNode = new SearchRecord(search);
        if(isEmpty()){
            tos= newNode;
            tos.next = null;
        }
        else{
            newNode.next = tos;
            tos= newNode;
        }
    }

    public SearchRecord deleteSearchRecord(){
        if(isEmpty()){
            System.out.println("Search history empty, cannot delete record");
            return null;
        }
        else{
            SearchRecord popNode = tos;
            tos=tos.next;
            popNode.next=null;
            return popNode;
        }
    }

    public void displaySearchHistory(){ //displays new to old records in original stack
        if(isEmpty()){
            System.out.println("No search history...");
        }
        else{
            System.out.println("Your search history");
            SearchRecord temp = tos;
            while(temp != null){
                System.out.println("Page ID: "+temp.getPage_id());
                System.out.println("Page Name: "+temp.getPage_name());
                System.out.println("Date: "+temp.getDate());
                System.out.println("URL: "+temp.getUrl());
                System.out.println("Bookmark: "+temp.getBookMark());
                System.out.println("-----------------------------");
                temp=temp.next;
            }
        }
    }

    public void displayReverse(){ //displays old to new records from reversed stack
        if(isEmpty()){
            System.out.println("Your reversed Search history is empty");
        }
        else{
            System.out.println("Your reversed search history (Oldest to Latest Records)");
            LinkedListStack reversedStack= new LinkedListStack();
            SearchRecord temp=tos;
            while(temp != null){
                reversedStack.insertSearchRecord(temp);
                temp=temp.next;
            }
            reversedStack.displaySearchHistory();
        }
    }

    public void displayBookmarks(){
        if(isEmpty()){
            System.out.println("No bookmarks, search history is empty...");
        }
        else{
            System.out.println("Your Bookmarks");
            SearchRecord temp = tos;
            while(temp != null){
                if (temp.getBookMark() != null && temp.getBookMark()== true){
                    System.out.println("Page ID: "+temp.getPage_id());
                    System.out.println("Page Name: "+temp.getPage_name());
                    System.out.println("Date: "+temp.getDate());
                    System.out.println("URL: "+temp.getUrl());
                    System.out.println("Bookmark: "+temp.getBookMark());
                    System.out.println("-----------------------------");
                }
                temp=temp.next;
            }
        }
    }
}

