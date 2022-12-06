public class Books {
    static int id_books;
    String title;
    double ratings;
    {
        id_books++;
    }
    Books(String t, double r){
        title = t;
        ratings = r;
    }
    void setTitle(String t){
        title = t;
    }
    void setRatings(double r){
        ratings = r;
    }
    void showBooks(){
        System.out.printf(" id: %d\n title: %s \n rating: %s \n", id_books, title , ratings);
    }
}
