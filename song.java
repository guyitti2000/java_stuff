import java.lang.Math.*;


public class song {

	
    static final int SAMPLE_RATE = 22051;  // 22.05 KHz

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
    public static void main(String[] args){
//sound 1
        CSE8ALib.play(conCAT());
//sound 2
        CSE8ALib.play(mixingthings());
//sound 3 is
//a famous Chinese song by Jay Chou)
//it is called GAOBAIQIQIU "love Confession"
//I played one part of the chorus from it
        int[] part1 = jaychou1();
        int[] part2 = jaychou2();
        CSE8ALib.play(concatSounds(part1, part2));
    }
    static int[] conCAT() {
        int[] sound = CSE8ALib.readSound("sounds/UpbeatFunk.wav");
        int[] sub1 = subSamples(sound, 0, 44100);
        int[] sosoft = changeVolume(sub1, 0.5);
        int[] sub2 = subSamples(sound, 44100, 88200);
        int[] soloud = changeVolume(sub2, 5);
        int[] conDOG = concatSounds(sosoft, soloud);
        return conDOG;
    }
    static int[] mixingthings() {
        int[] sound1 = CSE8ALib.readSound("sounds/UpbeatFunk.wav");
        int[] sound2 = CSE8ALib.readSound("sounds/UpbeatFunk.wav");
        int[] part1 = subSamples(sound1, 0, 100000);
        int[] part2 = subSamples(sound2, 10000, 110000);
        int[] finall = mix(part1, part2);
        return finall;
    }
    static int[] jaychou1() {
        double B = 987.77;
        double Db = 1108.73;
        double Eb = 1244.51;
        double E = 1318.51;
        double Ab = 830.61;
        double Gb = 1479.98;
        int[] sound1 = cosineSound(8000, (int) B, 10000);
        int[] sound2 = cosineSound(8000, (int) E, 10000);
        int[] sound3 = cosineSound(22000, (int) Eb, 10000);
        int[] sound4 = cosineSound(8000, (int) E, 10000);
        int[] sound5 = cosineSound(16000, (int) Eb, 10000);
        int[] sound6 = cosineSound(16000, (int) Db, 10000);
        int[] sound7 = cosineSound(22000, (int) B, 10000);
        int[] sound8 = cosineSound(8000, (int) Db, 10000);
        int[] sound9 = cosineSound(16000, (int) Eb, 10000);
        int[] sound10 = cosineSound(16000, (int) B, 10000);
        int[] sound11 = cosineSound(16000, (int) Ab, 10000);
        int[] sound12 = cosineSound(8000, (int) B, 10000);
        int[] sound13 = cosineSound(16000, (int) Gb, 10000);
        int[] sound14 = cosineSound(8000, (int) B, 10000);
        int[] sound15 = cosineSound(8000, (int) Eb, 10000);
        int[] sound16 = cosineSound(12000, (int) Eb, 10000);
        int[] sound17 = cosineSound(28000, 10, 100);
        int[] combines1 = concatSounds(sound1, sound2);
        int[] combines2 = concatSounds(sound3, sound4);
        int[] combined1 = concatSounds(combines1, combines2);
        int[] combines3 = concatSounds(sound5, sound6);
        int[] combines4 = concatSounds(sound7, sound8);
        int[] combined2 = concatSounds(combines3, combines4);
        int[] combcomb1 = concatSounds(combined1, combined2);
        int[] combines5 = concatSounds(sound9, sound10);
        int[] combines6 = concatSounds(sound11, sound12);
        int[] combined3 = concatSounds(combines5, combines6);
        int[] combines7 = concatSounds(sound13, sound14);
        int[] combines8 = concatSounds(sound15, sound16);
        int[] combined4 = concatSounds(combines7, combines8);
        int[] combcomb2 = concatSounds(combined3, combined4);
        int[] combcomb3 = concatSounds(combcomb1, combcomb2);
        int[] SONG = concatSounds(combcomb3, sound17);
        return SONG;
    }
    static int[] jaychou2() {
        double B = 987.77;
        double Db = 1108.73;
        double Eb = 1244.51;
        double E = 1318.51;
        double Ab = 830.61;
        double Gb = 1479.98;
        double Abup = 1661.22;
        int[] sound1 = cosineSound(8000,(int) B, 10000);
        int[] sound2 = cosineSound(8000,(int) E, 10000);
        int[] sound3 = cosineSound(22000,(int) Eb, 10000);
        int[] sound4 = cosineSound(8000, (int) E, 10000);
        int[] sound5 = cosineSound(16000, (int) Eb, 10000);
        int[] sound6 = cosineSound(16000, (int) Db, 10000);
        int[] sound7 = cosineSound(22000, (int) B, 10000);
        int[] sound8 = cosineSound(8000, (int) Db, 10000);
        int[] sound9 = cosineSound(16000, (int) Eb, 10000);
        int[] sound10 = cosineSound(22000, (int) Abup, 10000);
        int[] sound11 = cosineSound(16000, (int) Eb, 10000);
        int[] sound12 = cosineSound(8000, (int) Ab, 10000);
        int[] sound13 = cosineSound(16000, (int) B, 10000);
        int[] sound14 = cosineSound(16000, (int) Db, 10000);
        int[] sound15 = cosineSound(16000, (int) B, 10000);
        int[] combines1 = concatSounds(sound1, sound2);
        int[] combines2 = concatSounds(sound3, sound4);
        int[] combined1 = concatSounds(combines1, combines2);
        int[] combines3 = concatSounds(sound5, sound6);
        int[] combines4 = concatSounds(sound7, sound8);
        int[] combined2 = concatSounds(combines3, combines4);
        int[] combcomb1 = concatSounds(combined1, combined2);
        int[] combines5 = concatSounds(sound9, sound10);
        int[] combines6 = concatSounds(sound11, sound12);
        int[] combined3 = concatSounds(combines5, combines6);
        int[] combines7 = concatSounds(sound13, sound14);
        int[] combined4 = concatSounds(combines7, sound15);
        int[] combcomb2 = concatSounds(combined3, combined4);
        int[] SONG = concatSounds(combcomb1, combcomb2);
        return SONG;
    }
}
