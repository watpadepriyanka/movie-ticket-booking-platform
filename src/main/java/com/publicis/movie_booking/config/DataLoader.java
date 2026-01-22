//package com.publicis.movie_booking.config;
//
//import com.publicis.movie_booking.model.Show;
//import com.publicis.movie_booking.repository.ShowRepository;
//import org.springframework.boot.CommandLineRunner;
//
//import java.time.LocalDate;
//import java.time.LocalTime;
//
////@Component
//public class DataLoader implements CommandLineRunner {
//
//    private final ShowRepository showRepository;
//
//    public DataLoader(ShowRepository showRepository) {
//        this.showRepository = showRepository;
//    }
//
//    @Override
//    public void run(String... args) {
//        if (showRepository.count() == 0) {
//            Show show = new Show();
//            show.setMovieId("movie101");
//            show.setTheatreId("theatre1");
//            show.setShowDate(LocalDate.now());
//            show.setShowTime(LocalTime.of(18, 30));
//            show.setTotalSeats(100);
//            show.setAvailableSeats(100);
//
//            showRepository.save(show);
//        }
//    }
//}
//
//
//
