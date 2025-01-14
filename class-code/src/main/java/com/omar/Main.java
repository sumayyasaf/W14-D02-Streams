package com.omar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isNumberGreaterThan5 = new Predicate<Integer>(){
          public boolean test(Integer number){
              if(number >5){
                  return true;
              }
              return false;
          }
        };

        System.out.println(isNumberGreaterThan5.test(90));

        Function<Integer,Integer> numberMultipliedBy2 = num->num*2;

        System.out.println(numberMultipliedBy2.apply(10));
        System.out.println(numberMultipliedBy2.apply(25));


        ArrayList<Integer> numsArray = new ArrayList<>(Arrays.asList(1,7,8,2,3,4,5,6,7,8,9,10));

        System.out.println(numsArray);

        Stream<Integer> streamArray =  numsArray.stream();

//        Two types of stream methods
//        1. Intermediate method
//        2. Terminal method

        Consumer<Integer> printAge = (age)-> System.out.println("Your age is " + age);
        printAge.accept(33);
        streamArray.forEach(printAge);

        numsArray.stream()
                .forEach((num)-> System.out.println(num));



        System.out.println(numsArray.stream()
                .filter(isNumberGreaterThan5)
                .distinct()
                .toList());


        ArrayList<User> users = new ArrayList<>(Arrays.asList(
                new User("John",9),
                new User("Matt",20),
                new User("Sara",11)
        ));

        users.stream()
                .filter(user->user.getAge()>18)
                .map(user->{user.setAge(user.getAge()*2);
                    return user;})
                .forEach(user-> System.out.println(user));

        users.stream()
                .map((user)->user.getAge())
                .forEach(result-> System.out.println(result));


        ArrayList<Movie> movies = new ArrayList<>();


        // Add 10 movies to the ArrayList
        movies.add(new Movie(8.5, "Inception", 148, "Christopher Nolan", 2010, true));
        movies.add(new Movie(9.0, "The Shawshank Redemption", 142, "Frank Darabont", 1994, true));
        movies.add(new Movie(7.8, "The Grand Budapest Hotel", 99, "Wes Anderson", 2014, true));
        movies.add(new Movie(8.4, "Parasite", 132, "Bong Joon-ho", 2019, true));
        movies.add(new Movie(7.5, "Interstellar", 169, "Christopher Nolan", 2014, false));
        movies.add(new Movie(8.3, "The Dark Knight", 152, "Christopher Nolan", 2008, true));
        movies.add(new Movie(7.9, "The Social Network", 60, "David Fincher", 2010, true));
        movies.add(new Movie(8.7, "The Godfather", 175, "Francis Ford Coppola", 1972, true));
        movies.add(new Movie(7.9, "Dune", 155, "Denis Villeneuve", 2021, false));
        movies.add(new Movie(6.8, "Avatar", 162, "James Cameron", 2009, true));


        System.out.println(numsArray.stream().sorted(Comparator.reverseOrder()).toList());


        List<Movie> shortMovies = movies.stream()
                                        .filter(oneMovie->oneMovie.getLength()<100)
                                        .toList();

//        System.out.println(shortMovies);

        movies.stream()
                .filter(oneMovie->oneMovie.getRating()>8.0)
                .forEach(oneMovie-> System.out.println(oneMovie));

        System.out.println("------------------");

        movies.stream()
                .sorted(Comparator.comparingDouble((oneMovie)-> oneMovie.getRating()))
                .forEach(oneMovie-> System.out.println(oneMovie));


        System.out.println(movies.stream()
                .filter(oneMovie->oneMovie.getLength()<100)
                .count());

        System.out.println(movies.stream()
                .filter(oneMovie->oneMovie.getLength()<100)
                .anyMatch(movie -> movie.getRating()>9));


        System.out.println(movies.stream()
                .filter(oneMovie->oneMovie.getLength()<100)
                .allMatch(movie -> movie.getRating()>7));

        System.out.println(movies.stream()
                .filter(oneMovie->oneMovie.getLength()<100)
                .noneMatch(movie -> movie.getRating()>7));


        IntStream range = IntStream.range(1,10);


        System.out.println(range.count());

        DoubleStream intMovieRatings = movies.stream()
                .mapToDouble((movie)->  movie.getRating());

        IntStream intMovieYear = movies.stream()
                .mapToInt((movie)-> movie.getYear());



    }
}