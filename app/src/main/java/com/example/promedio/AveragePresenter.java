package com.example.promedio;

public class AveragePresenter implements Main.Presenter{
    private Main.Model averageModel;
    private Main.View averageView;

    public AveragePresenter(Main.View view) {
        this.averageView = view;
        averageModel = new AverageModel(this);
    }

    @Override
    public void showResult(String result) {
        if (averageView != null) {
            double average = Double.parseDouble(result);

            if (17 <= average && average <= 20 ) {
                result += " Logro destacado";
            } else if (14 <= average && average < 17) {
                result += " Logro medio";
            } else if (12.5 <= average && average < 14) {
                result += " Logro bajo";
            } else if (12.5 > average) {
                result += " No logrado";
            }

            averageView.showResult(result);
        }
    }

    @Override
    public void calculateAverage(double note1, double note2, double note3) {
        if (averageView != null) {
            averageModel.calculateAverage(note1, note2, note3);
        }
    }
}
