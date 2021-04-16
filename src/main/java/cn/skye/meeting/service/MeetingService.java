package cn.skye.meeting.service;

import cn.skye.meeting.mapper.MeetingMapper;
import cn.skye.meeting.model.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MeetingService {

    @Autowired
    MeetingMapper meetingMapper;

    public Integer addMeeting(Meeting meeting, Integer[] mps) {
        meeting.setReservationtime(new Date());
        Integer result = meetingMapper.addMeeting(meeting);
        meetingMapper.addParticipants(meeting.getMeetingid(),mps);
        return result;
    }
}
