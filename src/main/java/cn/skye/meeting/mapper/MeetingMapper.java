package cn.skye.meeting.mapper;

import cn.skye.meeting.model.Meeting;
import org.apache.ibatis.annotations.Param;

public interface MeetingMapper {
    Integer addMeeting(Meeting meeting);

    void addParticipants(@Param("meetingid") Integer meetingid, @Param("mps") Integer[] mps);
}
