package ru.zvezdilin.taskOfInterviews.task1_air_flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
//import задачи_с_собеседований.задача1_рейсы.testing.*;
/*
Для проверочного запуска создайте публичный класс Main c методом main() Этот метод должен выдать в консоль результаты
обработки тестового набора перелётов. Получить тестовый набор нужно методом FlightBuilder.createFlights()

Поместите в main() такой проверочный код. Исключите из тестового набора перелёты по следующим правилам
(по каждому правилу нужен отдельный вывод списка перелётов):
1.	вылет до текущего момента времени
2.	имеются сегменты с датой прилёта раньше даты вылета
3.	общее время, проведённое на земле превышает два часа (время на земле — это интервал между прилётом одного сегмента и вылетом следующего за ним)

 */

class Main {
    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        logger.info("Method start main");
        logger.warning("Test set of flights: ");

        FilterOfFlightImp filterOfFlightImp = new FilterOfFlightImp();
        List<Flight> tmpTransferTime = new ArrayList<>(); //для фильтра № 1
        List<Flight> tmpArriveSegment = new ArrayList<>(); //для фильтра № 2
        List<Flight> tmpArriveDeparture = new ArrayList<>();//для фильтра № 3

        //TODO метод текстового набора, который вызывает метод FlightBuilder.createFlights();
        try {
            logger.warning("Attempt to apply filters: ");
            tmpTransferTime = filterOfFlightImp.transferTime(FlightBuilder.createFlights(), 120);
            tmpArriveSegment = filterOfFlightImp.arriveSegmentsUntilDeparture(tmpTransferTime);
            tmpArriveDeparture = filterOfFlightImp.departureUntilNow(tmpArriveSegment, LocalDateTime.now());
            logger.info("Filters were applied successfully: ");
        } catch (NullPointerException ex) {
            logger.info("No flights with the specified filters/");
        }
        for (Flight flight : tmpArriveDeparture) {
            System.out.println("Вывод всех рейсов с использованием фильтра: ");
            System.out.println(flight.toString());
        }
        logger.info("End method main");
    }
}
