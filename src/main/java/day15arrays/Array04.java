package day15arrays;

public class Array04 {
    public static void main(String[] args) {

        // Bir Arrayin icinde herhangi bir elemanin olup olmadigini
        // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        int a[]= {0,2,3,0,12,0};

        int num = 3;
        int counter=0;

        for(int w : a){
            if( w ==num){
                counter++;
        }
    }

        if(counter>0){
        System.out.println(num + ", array'de " + counter + " defa var.");
    }else{
        System.out.println(num + ", array'de yok." );
    }








//hcm konu disi degilse bu yöntemle bir Stringi splintle harflere ayirip array haline getirerek ,bir harfin kac
// defa gectigini bu yontemle bulabilirim o zaman degil mi?








     }
}


