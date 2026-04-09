package week05;

public class LecturerData20 {

    Lecturer20[] listLecturers;
    int idx;

    public LecturerData20(int size) {
        listLecturers = new Lecturer20[size];
    }

    public void add(Lecturer20 lecturer) {
        if (idx < listLecturers.length) {
            listLecturers[idx] = lecturer;
            idx++;
        } else {
            System.out.println("List is full");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listLecturers[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listLecturers[j].age > listLecturers[j + 1].age) {
                    Lecturer20 temp = listLecturers[j];
                    listLecturers[j] = listLecturers[j + 1];
                    listLecturers[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listLecturers[j].age > listLecturers[maxIndex].age) {
                    maxIndex = j;
                }
            }
            Lecturer20 temp = listLecturers[maxIndex];
            listLecturers[maxIndex] = listLecturers[i];
            listLecturers[i] = temp;
        }
    }

}
