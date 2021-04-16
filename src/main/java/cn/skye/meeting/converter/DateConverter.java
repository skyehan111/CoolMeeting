package cn.skye.meeting.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public Date convert(String source) {
        try {
            return sdf.parse(source);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
