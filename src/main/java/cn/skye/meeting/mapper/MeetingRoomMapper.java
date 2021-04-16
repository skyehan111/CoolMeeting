package cn.skye.meeting.mapper;

import cn.skye.meeting.model.MeetingRoom;

import java.util.List;

public interface MeetingRoomMapper {
    List<MeetingRoom> getAllMr();

    MeetingRoom getMrById(Integer roomid);

    Integer updateroom(MeetingRoom meetingRoom);

    Integer doAddMr(MeetingRoom meetingRoom);
}
