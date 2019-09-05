package se.lexicon.kristian;

import se.lexicon.kristian.carList.Car;

public class App {
        public static void main( String[] args )
        {


            Car volvo = new Car("Volvo", "1990", "White",1);
            Car saab = new Car("Saab", "2001", "Blue", 0);
            Car nissan = new Car("Nissan", "2006", "Gray", 1);
            Car toyota = new Car("Toyota", "1998", "Red", 1);
            Car ford = new Car("Ford", "1984","Black", 0);


            Car[] carCount = {volvo, saab, nissan, toyota, ford};

            for (Car one : carCount)
            {
                if(one.isReady()){
                    one.checking();
                }


            }
        }

    }

