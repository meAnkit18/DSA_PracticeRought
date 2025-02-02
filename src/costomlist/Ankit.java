package costomlist;

import java.util.Arrays;

public class Ankit {
    private static  int data[];
    private static int DEfault_SIZE=10;
    private int size = 0;

    public Ankit(){
        this.data = new int[DEfault_SIZE];
    }



    public void add(int num){
        if(this.isFull()){
            resize();
        }
        this.data[size++] = num;
    }

    private boolean isFull(){
        if(size == data.length){
            return true;
        }
        return false;
    }
    void resize(){
        int t[] = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            t[i]=data[i];
        }
        data =t;

    }
@Override
    public String toString(){
        return Arrays.toString(data);

    }
}
