package com.student;

import java.math.BigDecimal;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks(){
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int total = 0;
        for (int mark : marks)
            total += mark;
        return total;
    }

    public int getMaximumMark() {
        int max = Integer.MIN_VALUE;
        for (int mark : marks)
            if (mark > max)    
                max = mark;
        return max;
    }

    public int getMinimumMark() {
        int min = Integer.MAX_VALUE;
        for (int mark : marks)
            if (mark < min)    
                min = mark;
        return min;
    }

    public BigDecimal getAverageMarks(){
        BigDecimal totalSum = BigDecimal.valueOf(getTotalSumOfMarks());
        return totalSum.divide(BigDecimal.valueOf(this.getNumberOfMarks()));
    }
}
