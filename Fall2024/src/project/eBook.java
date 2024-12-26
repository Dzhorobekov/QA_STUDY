package project;

public class eBook extends Book{
    public String downloadLink;



    public eBook(String title, String author, boolean isAvailable, String downloadLink) {
        super(title, author, isAvailable);
        this.downloadLink = downloadLink;
    }

    @Override
    public void borrow() {
        System.out.println("The eBook " + getTitle() + "can be downloaded from : " + downloadLink);
    }
}
