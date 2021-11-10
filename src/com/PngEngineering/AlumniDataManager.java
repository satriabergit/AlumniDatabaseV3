package com.PngEngineering;

import java.util.ArrayList;

public class AlumniDataManager {
    private ArrayList<AlumniData> alumniDataList = new ArrayList<>();
    int currentIndex = 0;

    public int getAlumniDataCount() {
        return alumniDataList.size();
    }

    public ArrayList getAllAlumniData() {
        return alumniDataList;
    }

    public AlumniData getAlumniData(int index) {
        return alumniDataList.get(index);
    }

    public AlumniData getNextAlumniData() {
        if (currentIndex < alumniDataList.size()) {
            AlumniData result = alumniDataList.get(currentIndex);
            currentIndex++;
            return result;
        } else
            return null;
    }

    public void restartIterator() {
        currentIndex = 0;
    }

    public void addAlumniData(AlumniData newData) {
        alumniDataList.add(newData);
    }

}
