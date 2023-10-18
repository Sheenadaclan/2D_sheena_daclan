public class Main{
    public static void main (String [] args){

        Scanner.scan = new scanner(system.in);

        Book book = new book();

        System.out.println("Enter book title: ");
        book.setTitle(scan.nextString());

        System.out.println("Enter book number of pages: ");
        book.setPages(scan.nextInt());

        System.out.println("Is fictional (Y - yes, N - no): ");
        book.setIsFiction(Boolean.nextBoolean());

        System.out.println(book.getTitle());
        System.out.println(book.getPages());
                
        boolean Y = true;

        if (isFiction == Y){
        System.out.println(book.getIsFictional());
        }else{
            System.out.println(book.getIsFictional());
        }
    }
}