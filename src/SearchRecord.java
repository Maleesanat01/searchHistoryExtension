public class SearchRecord {
    private String page_name;
    private String page_id;
    private String date;
    private String url;
    private Boolean bookMark;
    SearchRecord next;

    //setters
    public void setPage_name(String page_name) {this.page_name = page_name;}

    public void setPage_id(String page_id) {
        this.page_id = page_id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBookMark(Boolean bookMark) {
        this.bookMark = bookMark;
    }

    //getters
    public String getPage_name() {
        return page_name;
    }

    public String getPage_id() {
        return page_id;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public Boolean getBookMark() {
        return bookMark;
    }

    //constructor
    public SearchRecord(String page_name, String page_id, String date, String url, Boolean bookMark){
        this.page_name=page_name;
        this.page_id=page_id;
        this.date=date;
        this.url=url;
        this.bookMark=bookMark;
        this.next=null;
    }

    //constructor when passing a SearchRec to the stack
    public SearchRecord(SearchRecord search){
        this.page_name= search.page_name;
        this.page_id= search.page_id;
        this.date= search.date;
        this.url= search.url;
        this.bookMark=search.bookMark;
        this.next=null;
    }
}
