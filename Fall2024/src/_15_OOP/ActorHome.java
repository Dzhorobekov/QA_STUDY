package _15_OOP;

import java.util.ArrayList;
import java.util.List;

public class ActorHome {
    public String name;
    public int birthYear;
    public boolean oscar;
    public List<String> listOfMovie;
    public List<Boolean> oscarMovies;
    public List<Integer> oscarYear;


    public ActorHome(String hisName, int hisBirthYear, boolean hisOscar){
        name = hisName;
        birthYear = hisBirthYear;
        oscar = hisOscar;
        listOfMovie = new ArrayList<>();
        oscarMovies = new ArrayList<>();
        oscarYear = new ArrayList<>();
    }
    public void addMovie(String movie, boolean hasOscar, int year){
        listOfMovie.add(movie);
        oscarMovies.add(hasOscar);
        oscarYear.add(year);
    }

    public String detectOscarMovieAndYear(){
        for(int i = 0; i < listOfMovie.size(); i++){
            if(oscarMovies.get(i)){
                return name + "Received an Oscar in " + oscarYear + "for the movie";
            }
        }
        return name + "didn't get an Oscar";
    }

    @Override
    public String toString() {
        return "ActorHome :" +
                "name--> " + name + "\n" +
                "birthYear-->" + birthYear + "\n" +
                "oscar-->" + oscar + "\n" +
                "listOfMovie-->" + listOfMovie + "\n" +
                "oscarMovies-->" + oscarMovies + "\n" +
                "oscarYear-->" + oscarYear;
    }
}
