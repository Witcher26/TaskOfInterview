package ru.zvezdilin.taskOfInterviews.task1_air_flights;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Bean that represents a flight. //Сегмент, представляющий полет.
 */
public class Flight {
    private final List<Segment> segments;

    Flight(final List<Segment> segs) {
        segments = segs;
    }

    List<Segment> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        return segments.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}
