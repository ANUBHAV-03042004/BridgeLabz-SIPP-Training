package jobscheduler;

//Job class
class Job implements Comparable<Job> {
String name;
int deadline;
int processingTime;

public Job(String name, int deadline, int processingTime) {
   this.name = name;
   this.deadline = deadline;
   this.processingTime = processingTime;
}

// Sort by earliest deadline, then shortest processing time
@Override
public int compareTo(Job other) {
   if (this.deadline == other.deadline) {
       return this.processingTime - other.processingTime;
   }
   return this.deadline - other.deadline;
}
}
