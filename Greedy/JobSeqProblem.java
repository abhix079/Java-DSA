import java.util.*;
public class JobSeqProblem {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i , int d, int p){ //construcuter
            id = i;
            deadline= d;
            profit= p;
        }
    }

    public static void main(String[] args) {
        int jobSeq[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs= new ArrayList<>();
        for(int i =0;i<jobSeq.length;i++){
            jobs.add(new Job(i,jobSeq[i][0],jobSeq[i][1]));


        }

        Collections.sort(jobs, (obj1,obj2)->obj2.profit- obj1.profit);//isse profit ke hissabse descending order me sort ho jayega

        //job sequence
        ArrayList<Integer> seq = new ArrayList<>();

        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr= jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
//print seq

System.out.println("Maximum jobs: "+seq.size());
for(int i =0;i<seq.size();i++){
    System.out.print("Job"+seq.get(i)+" ");
}


    }
}
