public class BonusMilesService {
    public int calculate(int cost) {
        int percent = 5;
        int miles = cost * percent / 100;
        return miles;
    }
}
