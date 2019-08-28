package com.example.promedio;

public interface Main {
    interface View {
        void showResult(String result);
    }

    interface Presenter {
        void showResult(String result);
        void calculateAverage(double note1, double note2, double note3);
    }

    interface Model {
        void calculateAverage(double note1, double note2, double note3);
    }
}
