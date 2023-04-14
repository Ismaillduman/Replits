package eu7Arrays;

public class AverageValues {
    public static void main(String[] args) {
        int[] temps={80,88,88,84,82};
        double averageTemp=0;
        double sum=0;
        for (int each : temps) {
            sum+=each;

        }
        averageTemp=sum/(temps.length);
        System.out.println(averageTemp);}

}
