public class Books {
    String title = "The Java GatsBy";
    String author;
}
    class BooksTestDrive {
        public static void main(String[] args) {
            Books[] myBooks = new Books[3];

            int x = 0;
            myBooks[0]=new Books();
            myBooks[1]=new Books();
            myBooks[2]=new Books();
            myBooks[0].title = "The Grapes of Java";
            myBooks[1].title = "The Java Gates";
            myBooks[2].title = "The Java Cookbook";
            myBooks[0].author = "Bob";
            myBooks[1].author = "Ian";
            myBooks[2].author = "Sue";

            while (x < myBooks.length) {

                System.out.print(myBooks[x].title);
                System.out.print(" by ");
                System.out.println(myBooks[x].author);
                x++;


            }
        }

    }



