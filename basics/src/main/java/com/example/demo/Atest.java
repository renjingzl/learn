package com.example.demo;

import java.math.BigDecimal;

/**
 * <pre>
 *
 * </pre>
 * @author 杨帮东
 * @since 1.0
 * @date 2020/07/02 23:14
 **/
public class Atest {

    public static void main(String[] args) {
        //868120227184311
        BigDecimal startSoc = new BigDecimal("99.59898");
        BigDecimal startDistance = new BigDecimal("22750.3431");

//        //868120220774324
//        BigDecimal startSoc = new BigDecimal("33.74611");
//        BigDecimal startDistance = new BigDecimal("47.337");


        BigDecimal endSoc = new BigDecimal("40.83675");
        BigDecimal enddistance = new BigDecimal("22757.4718");


        BigDecimal ss = enddistance.subtract(startDistance);
        BigDecimal gongshi = ss.multiply(new BigDecimal("1000")).divide(new BigDecimal("550"), 6,
                BigDecimal.ROUND_HALF_UP);
        System.out.println("公式计算" + gongshi);

        BigDecimal shiji = startSoc.subtract(endSoc);
        System.out.println("实际消耗" + shiji);
        System.out.println("单程公里" + enddistance.subtract(startDistance));
        System.out.println("经度丢失" + shiji.subtract(gongshi));


    }
}
