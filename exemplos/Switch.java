public class Switch {
    enum  Season {WINTER, SPRING, SUMMER, FALL}
    public static void main(String args[]) {
        int measurement = 10;
        int size = switch(measurement) {
            case 5 -> 1;
            case 10 -> (short)2;
            default -> 5;
        };
        System.out.println(size);
        
        int fish = 5;
        int length = 12;
        
        var name = switch(fish) {
            case 1 -> "Goldfish";
            case 2 -> {yield "Trout";}
            case 3 -> {
                if(length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };
        System.out.println(name);
        
        
        

        System.out.println(getWeather(Season.WINTER));
    }
    static String getWeather(Season value) {
            return switch(value) {
                case WINTER -> "Cold";
                case SPRING -> "Rainy";
                case SUMMER -> "Hot";
                case FALL -> "Warm";
            };
        }

}