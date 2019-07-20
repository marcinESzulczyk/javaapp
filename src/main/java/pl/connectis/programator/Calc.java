package pl.connectis.programator;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.List;

public class Calc {
   // List<Double> values;
    DescriptiveStatistics stats = new DescriptiveStatistics();


    public Calc() {
        System.out.println("Calculator instance: " + this);
    }

    public void setValues(List<Double> values) {
        for (int i = 0; i<values.size();i++){
            stats.addValue(values.get(i));
        }
    }

    public double mean(){
       // DescriptiveStatistics stats = new DescriptiveStatistics();

        return stats.getMean();
        }



    public double std(){
        return stats.getStandardDeviation();
    }

    public long sum(long a, long b){
        return a+b;
    }

    public double div (double a, double b) {

        return a/b;}

    public void clear(){
        stats.clear();
    }

    public boolean isEven(int l){
        if (l %2 == 0)return true;
        return false;
    }

}
