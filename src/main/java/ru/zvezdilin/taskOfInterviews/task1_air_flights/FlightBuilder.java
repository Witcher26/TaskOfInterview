package ru.zvezdilin.taskOfInterviews.task1_air_flights;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Factory class to get sample list of flights. //фабричный класс, позволяющий получить примерный список рейсов
 */
public class FlightBuilder {
    public static List<Flight> createFlights() {
        LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
        return Arrays.asList(
            //A normal flight with two hour duration // Обычный полет продолжительностью два часа
            createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2)),
            //A normal multi segment flight //Обычный многосегментный полет
            createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2),
                threeDaysFromNow.plusHours(3), threeDaysFromNow.plusHours(5)),
            //A flight departing in the past //рейс, отправляющийся в прошлое
            createFlight(threeDaysFromNow.minusDays(6), threeDaysFromNow),
            //A flight that departs before it arrives //Рейс, который отправляется до того, как он прибудет
            createFlight(threeDaysFromNow, threeDaysFromNow.minusHours(6)),
            //A flight with more than two hours ground time //Полет с более чем двухчасовым наземным временем
            createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2),
                threeDaysFromNow.plusHours(5), threeDaysFromNow.plusHours(6)),
            //Another flight with more than two hours ground time //Еще один рейс с более чем двухчасовым наземным временем
            createFlight(threeDaysFromNow, threeDaysFromNow.plusHours(2),
                threeDaysFromNow.plusHours(3), threeDaysFromNow.plusHours(4),
                threeDaysFromNow.plusHours(6), threeDaysFromNow.plusHours(7)));
    }

    private static Flight createFlight(final LocalDateTime... dates) {
        if ((dates.length % 2) != 0) {
            throw new IllegalArgumentException(
                "you must pass an even number of dates");  //вы должны пройти четное количество дат
        }
        List<Segment> segments = new ArrayList<>(dates.length / 2);
        for (int i = 0; i < (dates.length - 1); i += 2) {
            segments.add(new Segment(dates[i], dates[i + 1]));
        }
        return new Flight(segments);
    }
}



