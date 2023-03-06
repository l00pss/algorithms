package az.rock.lesson.util;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public abstract class AbstractTimeMetric<T extends Comparable<T> & Cloneable> implements Sort<T>{

    public List<T> sortAsMetric(List<T> list){
        var startInstant = Instant.now();
        var result =  this.sort(list);
        var endInstant = Instant.now();
        long duration = Duration.between(startInstant,endInstant).getNano();
        System.err.println("-------------Execute time : " + duration + " ns------------");
        return result;
    }
}
