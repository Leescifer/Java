
class DataTypes {

static int a = 10;
final double b = 10.5;
static final float c = 10.5f;

long d = 10L;
short e = 10;
byte f = 10;
boolean g = true;
char h = 'A';
String i = "Hello World";

void method (){
    int j = 20;
}
}

class Enum {
    public enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }
}


public class App {
  
    public static void main(String[] args){

        DataTypes dataTypes = new DataTypes();

        for (Enum.Season season : Enum.Season.values()) {
            System.out.println(season);
        }

        Game.play();

        numbers = new int[];


    }
}
