package cook_your_lasgna;
public class Lasagna {
    public static final int EXPECTED_MINUTES = 40;
    public static final int LAYER_TIME_IN_MINUTES = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    //DONE
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    //DONE
    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven()-time;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    //DONE
    public int preparationTimeInMinutes(int layers){
        return LAYER_TIME_IN_MINUTES*layers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    //DONE
    public int totalTimeInMinutes(int layers, int minutesInOven){
        return preparationTimeInMinutes(layers)+minutesInOven;
    }
}
