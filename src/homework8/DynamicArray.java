package homework8;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }


    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index > size) {
            return -1;
        }
        return array[index];
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

    public boolean isEmpty() {
        if (array.length < 0) {
            return true;
        }
        return false;

    }

    public int getFirstIndexByValue(int value) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (index > array.length) {
                return 0;
            } else if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void set(int index, int value) {
        for (int i = 0; i < size; i++) {
            if (index == i) {
                array[i] = value;
            }
            System.out.print(array[i] + " ");
        }
    }

    public void add(int index, int value) {
        for (int i = index; i <= size; i++) {
            int tmp = value;
            value = array[i];
            array[i] = tmp;
        }
        size++;
    }

    public void delete(int index) {

        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }
}



