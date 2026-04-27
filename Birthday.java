public class Birthday{
    public static void main(String[] args){
        int[] groupSizes={5,10,15,20,25,30,35,40,50,100};
        int experiments=10;

        System.out.println("\n\t\tMatches\t\tProbability");
        System.out.println("----------------------------------------------");
        for (int n:groupSizes){
            int matchCount=0;

            for(int e=0;e<experiments;e++){
                int[] birthdays=new int[n];

                for (int i=0;i<n;i++){
                    birthdays[i]=(int)(Math.random()*365);
                }

                boolean found=false;
                for (int i=0;i<n && !found;i++){
                    for(int j=i+1;j<n && !found;j++){
                    if(birthdays[i]==birthdays[j]){
                        matchCount++;
                        found=true;
                    }
                }

            }
            double probability = (double) matchCount/experiments *100;
    System.out.println(n + "\t\t" + matchCount + "/" + experiments + "\t\t" + probability + "%");
    }
        }
    }
    
}