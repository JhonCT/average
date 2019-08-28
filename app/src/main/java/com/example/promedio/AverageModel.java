package com.example.promedio;

public class AverageModel implements Main.Model{
    private Main.Presenter averagePresenter;

    public AverageModel(Main.Presenter averagePresenter) {
        this.averagePresenter = averagePresenter;
    }

    @Override
    public void calculateAverage(double note1, double note2, double note3) {
        double average = (note1 + note2 + note3)/3;
        averagePresenter.showResult(String.valueOf(average));
    }
}
