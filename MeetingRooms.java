/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
 
public class Solution {

    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> a.start - b.start);

        for (int i = 0; i < intervals.size() - 1; i++) {
            if (intervals.get(i + 1).start < intervals.get(i).end) {
                return false;
            }
        }
        return true;
        
    }
}








