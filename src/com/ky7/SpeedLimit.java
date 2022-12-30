package com.ky7;

public class SpeedLimit {

    /**
     *
     * The police have placed radars that will detect those vehicles that exceed the speed limit on that road. If the driver's speed is 10km/h to 19km/h above the speed limit, the fine will be 100 dollars, if it is exceeded by 20km/h to 29km/h the fine will be 250 dollars and if it is exceeded by more than 30km/h the fine will be 500 dollars.
     *
     * You will be provided with the speed limits of those roads with radar as a collection of speedlimits [90,100,110,120,....] and the speed of the driver will be the same on all roads and can never be negative and the amount of the fine will be accumulated example 95km/h.
     *
     * Example (Speed=100, Signals=[110,100,80]-> 250)
     *
     * @param speed Скорость автомобиля
     * @param signals органичение на дороге
     * @return
     */

    public static int speedLimit(final int speed, final int[] signals) {

        int sum = 0;
        int limit = 0;

        for(int signal : signals){
            limit = Math.max(0, speed - signal);

            if(limit >= 10 && limit <= 19)
                sum += 100;
            if(limit >= 20 && limit <= 29)
                sum += 250;
            if(limit >= 30)
                sum += 500;
        }

        return sum;

    }
}
