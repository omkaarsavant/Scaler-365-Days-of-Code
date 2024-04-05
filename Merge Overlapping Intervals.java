import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval {
  int start;
  int end;

  Interval() {
    start = 0;
    end = 0;
  }

  Interval(int s, int e) {
    start = s;
    end = e;
  }
}

public class Solution {
  public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    if (intervals == null || intervals.isEmpty()) {
      return new ArrayList<>();
    }

    // Sort intervals based on starting time (Java 7 compatible)
    Collections.sort(intervals, new Comparator<Interval>() {
      @Override
      public int compare(Interval i1, Interval i2) {
        return i1.start - i2.start;
      }
    });

    ArrayList<Interval> mergedIntervals = new ArrayList<>();
    Interval currentInterval = intervals.get(0);

    for (Interval interval : intervals) {
      // If current interval overlaps with the next interval
      if (interval.start <= currentInterval.end) {
        // Merge by extending the end time of the current interval
        currentInterval.end = Math.max(currentInterval.end, interval.end);
      } else {
        // No overlap, add the current interval to the result and update current
        mergedIntervals.add(currentInterval);
        currentInterval = interval;
      }
    }

    // Add the last interval to the merged results
    mergedIntervals.add(currentInterval);

    return mergedIntervals;
  }
}
