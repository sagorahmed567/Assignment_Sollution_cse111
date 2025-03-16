package LAB_3;
// Ungraded Task

public class Movie {
    public String title;
    public String director;
    public double rating;
    public int max = 3;
    public int current = 0;
    String[] actor_arr = new String[max];

    public void setMovieDetails(String s1, String s2, double r){
        title =  s1;
        director = s2;
        rating = r;
    }

    public void setMovieDetails(String s1, String s2){
        title =  s1;
        director = s2;
    }
    public void updateRating(double i){
        rating = i;
    }

    public void addActors(String s){

        if(current < max) {
            actor_arr[current] = s;
            current++;
            System.out.println("Added actor \""+s+"\" to "+ "\"" +title+"\"");
        }
    }
    public void addActors(String s1, String s2){
        if(current < max) {
            actor_arr[current] = s1;
            current++;
            System.out.println("Added actor \""+s1+"\" to "+"\""+ title+"\"");
        }
        if(current < max) {
            actor_arr[current] = s2;
            current++;
            System.out.println("Added actor \""+s2+"\" to "+"\""+ title+"\"");

        }
    }
    public void addActors(String s1, String s2, String s3){
        String[] x = {s1,s2,s3};
        for(String actor: x){
            actor_arr[current] = actor;
            current++;
            System.out.println("Added actor \""+actor+"\" to "+"\""+ title+"\"");

        }
    }

    public void showInfo(){
        System.out.println("Title: "+title+"\nDirector: "+director+"\nRating: "+rating+"\nActors: ");
        for (int i = 0; i < current; i++) {
            if( i == current -1){
                System.out.print(actor_arr[i]);
                System.out.println();
            }else{
                System.out.print(actor_arr[i]+",");
            }
        }
    }
}
