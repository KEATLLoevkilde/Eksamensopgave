import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    //array af Terning objekter???

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
    }

    public int ryst(){
        Random random = new Random();//random generator

        int sum = 0;
        //loope svarende til antalterninger
        for(int i = 0; i< antalTerninger; i++ ) {
            //lave tilfældigt tal ml 1-6
            int randomNumber = random.nextInt(6) + 1;

            // summere og returnere samlet  værdi
            sum = sum + randomNumber;
        }

        return sum;
    }
}

