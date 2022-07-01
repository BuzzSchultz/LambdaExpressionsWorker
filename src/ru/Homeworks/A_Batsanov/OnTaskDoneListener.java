package ru.Homeworks.A_Batsanov;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
