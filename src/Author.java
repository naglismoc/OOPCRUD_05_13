public class Author {
    private static long idCount = 0;

    private long id;
    private String name;
    private String surname;

    public Author() {
        this.id = ++idCount;
    }

    public Author(String name, String surname) {
        this.id = ++idCount;
        this.name = name;
        this.surname = surname;

    }
    public static void seed(){
        Main.authors.add(new Author("Jonas","Jakubaitis"));
        Main.authors.add(new Author("Valentinas","Vasiulonis"));
        Main.authors.add(new Author("Algirdas","Alzbergas"));
    }
public static void print(){

    for (Author author: Main.authors) {
        System.out.println(author);
    }
}
    public static void create(){
        Author author = new Author();
        System.out.println("parinkite varda:");
        author.setName(Main.sc.nextLine());
        System.out.println("parinkite pavarde:");
        author.setSurname(Main.sc.nextLine());
        Main.authors.add(author);
    }
    public static void edit(){
        System.out.println("parinkite id kuri norite redaguoti:");
        long editId = ValidateInput.longVal();
        for (int i = 0; i < Main.authors.size(); i++) {
            if(Main.authors.get(i).getId() == editId){
                System.out.println("parinkite varda:");
                Main.authors.get(i).setName(Main.sc.nextLine());
                System.out.println("parinkite pavarde:");
                Main.authors.get(i).setSurname(Main.sc.nextLine());
            }
        }
    }

    public static void delete(){
        System.out.println("parinkite id kuri norite salinti:");
        long delId = ValidateInput.longVal();
        for (int i = 0; i < Main.authors.size(); i++) {
            if(Main.authors.get(i).getId() == delId){
                Main.authors.remove(Main.authors.get(i));
            }
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
