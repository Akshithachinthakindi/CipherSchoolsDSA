package Lecture4;

public class MinimumNumberOfPlatforms {
    public static int minPlatforms(int [] arr, int dep[]) {

        int result = 1;

        int arrivalIndex = 1;
        int departureIndex =0;
        int platformRequired = 1;



        while (arrivalIndex < arr.length && departureIndex < dep.length) {

            int currentArrivalTime = arr[arrivalIndex];
            int currentDepartureTime = dep[depatrureIndex];

            if(currentArrivalTime <= currentDepartureTime) {
                platformRequired--;
                departureIndex++;
            }
            if(platformRequired > result) {
                result = platformRequired;
            }
        }
        return result;

    }
    public static void main(String[] args) {

    }