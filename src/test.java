import java.util.*;

public class test {
    public static void main(String[] args){
        String test = "This string is a test";
        boolean st;
        String sub, temp, fin;
        ArrayList<String> mix = new ArrayList<String>();

        for(int i = 0; i <= test.length() - 1; i++){

            if(i != test.length() - 1){
                mix.add(test.substring(i, i+1));
            }else{
                mix.add((test.substring(i)));
            }
        }

        System.out.println(mix);

        int r = (mix.size() - 1) / 2;
        System.out.println(r);
        for(int i = 1; i <= mix.size() - 1; i++){
            if(i%2 != 0){
                temp = mix.get(r);
                mix.set(r, mix.get(r + i));
                mix.set(r + i, temp);
                r += i;
                System.out.println(r);
            }else{
                temp = mix.get(r);
                mix.set(r, mix.get(r - i));
                mix.set(r - i, temp);
                r -= i;
                System.out.println(r);
            }
        }

        System.out.println(mix);
        //5 6 4 7 3 8 2 9 1 10 0
        //4 5 3 6 2 7 1 8 0 9
        //9 10 8 11 7 12 6 13 5 14 4 15 3 16 2 17 1 18 0 19
        //10 11 9 12 8 13 7 14 6 15 5 16 4 17 3 18 2 19 1 20 0

    }
}
