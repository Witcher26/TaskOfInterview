//package ru.zvezdilin.taskOfInterviews.task1_air_flights.testing;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//public interface FilterOfFlight {
//    /*
//    Данный интерфейс будет содержать текущий набор фильтров, который будет выражен в виде методов:
//        1.	вылет до текущего момента времени
//        2.	имеются сегменты с датой прилёта раньше даты вылета
//        3.	общее время, проведённое на земле превышает два часа (время на земле — это интервал между прилётом одного сегмента и вылетом следующего за ним)
//     */
//
//    List<Flight> departureUntilNow(List<Flight> storage, LocalDateTime localDateTime);
//
//    List<Flight> arriveSegmentsUntilDeparture(List<Flight> storage);
//
//    List<Flight> transferTime(List<Flight> storage, int minutes);
//
//}
