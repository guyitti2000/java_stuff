import java.lang.Math.*;

public class Sounds{


    // DO NOT CHANGE
    static final int SAMPLE_RATE = 22050;  // 22.05 KHz

    public static void main(String[] args){

      // You can uncomment these lines to hear an example of playing a sound.
      // int[] sound = CSE8ALib.readSound("sounds/UpbeatFunk.wav");
      // CSE8ALib.play(sound);

    }

    static int[] subSamples(int[] sound, int startIndex, int count){
        return new int[0];
    }

    static int[] concatSounds(int[] sound1, int[] sound2){
        return new int[0];
    }

    static int[] cosineSound(int length, int frequency, int amplitude){
        return new int[0];
    }

    static int[] mix(int[] sound1, int[] sound2){
        return new int[0];
    }

    // DO NOT CHANGE -- this example is provided to get you started
    // changeVolume
    // 2 parameters:
    //      1) array of ints representing one sound
    //      2) double representing the scaling factor
    // returns:
    //      an array of ints representing the scaled input sound
    // NOTE: to lower the volume, scalar should be less than 1
    // NOTE: to raise the volume, scalar should be greater than 1
    public static int[] changeVolume(int[] sound, double scalar){
        int[] res = new int[sound.length];
        for(int i = 0; i < sound.length; i++){
            res[i] = CSE8ALib.doubleToInt(CSE8ALib.intToDouble(sound[i]) * scalar);
        }
        return res;
    }

    // DO NOT CHANGE
    // printArray
    // 1 parameter:
    //      1) array of ints representing one sound
    // returns:
    //      this function does not return anything
    public static void printArray(int[] array){
        System.out.print("{");
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] + ", ");
        }
        if (array.length > 0) {
            System.out.print(array[array.length-1]);
        }
        System.out.println("}");
    }

}
