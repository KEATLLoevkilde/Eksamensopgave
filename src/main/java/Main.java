public class Main {

  public static void main(String[] args) {
    Raflebæger raflebæger = new Raflebæger(2);

    //tildeler returværdi fra metodekald til variablen samletAntalØjne
    int samletAntalØjne = raflebæger.ryst();
    System.out.println(samletAntalØjne);


  }
}
