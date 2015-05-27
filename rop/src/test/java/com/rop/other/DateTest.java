package com.rop.other;

import org.joda.time.DateTime;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * 项目：rop
 * 包名：com.rop.other
 * Created by 邵传波 on 2015/5/27.
 */
public class DateTest {


    public static  void conver(Long timestamp){
        Date date  = new Date(timestamp);

        if(!date.before(DateTime.now().plusSeconds(10 * 60).toDate())){
            System.out.println(timestamp + "不合法，早");
            return;
        }
        if (!date.after(DateTime.now().plusSeconds(-10 * 60).toDate())){
            System.out.println(timestamp + "不合法，晚");
            return;
        }
        System.out.println(timestamp + "合法");
    }

    @Test
    public  void main() {
        Long timestamp = 1432696334860L;

        conver(timestamp);
        conver(new Date().getTime());
        conver(DateTime.now().plusSeconds(10 * 60 -1).toDate().getTime());
        conver(DateTime.now().plusSeconds(-10 * 60 + 1).toDate().getTime());


    }
}
