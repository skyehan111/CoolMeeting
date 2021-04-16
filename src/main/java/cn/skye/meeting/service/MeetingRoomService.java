package cn.skye.meeting.service;

import cn.skye.meeting.mapper.MeetingRoomMapper;
import cn.skye.meeting.model.MeetingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingRoomService {

    @Autowired
    MeetingRoomMapper meetingRoomMapper;

    public List<MeetingRoom> getAllMr() {
        return meetingRoomMapper.getAllMr();
    }

    public MeetingRoom getMrById(Integer roomid) {
        return meetingRoomMapper.getMrById(roomid);
    }

    public Integer updateroom(MeetingRoom meetingRoom) {
        return meetingRoomMapper.updateroom(meetingRoom);
    }

    public Integer doAddMr(MeetingRoom meetingRoom) {
        return meetingRoomMapper.doAddMr(meetingRoom);
    }
}
