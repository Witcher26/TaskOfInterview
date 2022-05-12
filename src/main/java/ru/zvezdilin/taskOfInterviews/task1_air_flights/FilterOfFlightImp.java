package ru.zvezdilin.taskOfInterviews.task1_air_flights;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


/*
Для проверочного запуска создайте публичный класс Main c методом main() Этот метод должен выдать в консоль результаты
обработки тестового набора перелётов. Получить тестовый набор нужно методом FlightBuilder.createFlights()

Поместите в main() такой проверочный код. Исключите из тестового набора перелёты по следующим правилам (по каждому правилу нужен отдельный вывод списка перелётов):
1.	вылет до текущего момента времени
2.	имеются сегменты с датой прилёта раньше даты вылета
3.	общее время, проведённое на земле превышает два часа (время на земле — это интервал между прилётом одного сегмента и вылетом следующего за ним)

 */

public class FilterOfFlightImp implements FilterOfFlight {
    private static final Logger loggerFilter = Logger.getLogger(String.valueOf(FilterOfFlightImp.class));
    //имплементация фильтров

    public FilterOfFlightImp() {
        super();
    }

    //TODO вылет до текущего момента времени
    @Override

    public List<Flight> departureUntilNow(List<Flight> storage, LocalDateTime localDateTime) {
        loggerFilter.info("Start method departureUntilNow");
        List<Flight> storageTmp = new ArrayList<>();
        for (Flight flight : storage) {
            if (flight.getSegments().size() == 0) {
                loggerFilter.info("No departures");
                break;
            }
            Segment segment = flight.getSegments().get(0); // получаем первый сегмент,с него начинается полет
            if (!segment.getDepartureDate().isBefore(localDateTime)) {
                storageTmp.add(flight);
            }
        }
        loggerFilter.info("End method departureUntilNow");
        return storageTmp;

    }

    //TODO имеются сегменты с датой прилёта раньше даты вылета
    @Override
    public List<Flight> arriveSegmentsUntilDeparture(List<Flight> storage) {
        loggerFilter.info("Start method arriveSegmentsUntilDeparture");
        List<Flight> storageTmp = new ArrayList<>();
        for (Flight flight : storage) {
            if (flight.getSegments().size() == 0) {
                loggerFilter.info("There are no segments up to the specified time");
                break;
            }
            if (!arriveUntil(flight.getSegments())) {
                storageTmp.add(flight);
            }
        }
        loggerFilter.info("End method arriveSegmentsUntilDeparture");
        return storageTmp;
    }

    public static boolean arriveUntil(List<Segment> ListSegments) {
        for (Segment storageSegment : ListSegments) {
            if (storageSegment.getArrivalDate().isBefore(storageSegment.getDepartureDate()))
                return true;
        }
        return false;
    }

    //TODO общее время, проведённое на земле превышает два часа (время на земле — это интервал между прилётом одного
    // сегмента и вылетом следующего за ним)
    @Override
    public List<Flight> transferTime(List<Flight> storage, int minutes) {
        loggerFilter.info("Start method transferTime");
        List<Flight> newTransferTime = new ArrayList<>();
        for (Flight flight : storage) {

            if (flight.getSegments().size() == 0) {
                loggerFilter.info("No flight segments.");
                break;
            }

            if (flight.getSegments().size() == 1) {
                loggerFilter.info("1 segment");
                newTransferTime.add(flight);
            }
            int minutesTmp = 0;
            for (int i = 0; i < flight.getSegments().size() - 1; i++) {
                minutesTmp += flight.getSegments().get(i + 1).getArrivalDate().getMinute() - flight.getSegments().get(i).getDepartureDate().getMinute();

            }
            if (minutesTmp > minutes) {
                storage.remove(flight);
            }
        }
        loggerFilter.info("End method transferTime");
        return newTransferTime;
    }
}
