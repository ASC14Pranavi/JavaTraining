package Assignment1;
import java.util.*;

public class MeetingApp {
    public static void main(String[] args) {
        MeetingRooms room1 = new MeetingRooms(1, 10, 1, true);
        room1.setZoomDeviceId("123456");
        room1.setZoomAccountId("GFDVBBHKf");

        Booking booking1 = new Booking(3, "2024-06-27", "9:00", 30, room1);
        System.out.println("Booking Details Of Room:");
        System.out.println("Employee ID: " + booking1.getEmployeeId());
        System.out.println("Meeting Date: " + booking1.getMeetingDate());
        System.out.println("Meeting Time: " + booking1.getMeetingTime());
        System.out.println("Duration: " + booking1.getDuration() + " minutes");
        System.out.println("Room ID: " + booking1.getMeetingRoom().getRoomId());
        System.out.println("Capacity: " + booking1.getMeetingRoom().getCapacity());
        System.out.println("Floor: " + booking1.getMeetingRoom().getFloor());
        if (booking1.getMeetingRoom().ZoomMeetingFacility()) {
            System.out.println("Zoom Device ID: " + booking1.getMeetingRoom().getZoomDeviceId());
            System.out.println("Zoom Account ID: " + booking1.getMeetingRoom().getZoomAccountId());
        }
    }
}
class MeetingRooms{
    private int roomid;
    private int capacity;
    private int floor;
    private boolean ZoomMeetingfacility;
    private String zoomdeviceid;
    private String zoomaccountid;
    public MeetingRooms(int roomid, int capacity, int floor, boolean ZoomMeetingfacility) {
        this.roomid = roomid;
        this.capacity = capacity;
        this.floor = floor;
        this.ZoomMeetingfacility = ZoomMeetingfacility;
    }
    public int getRoomId() {
        return roomid;
    }

    public void setRoomId(int roomid) {
        this.roomid = roomid;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean ZoomMeetingFacility() {
        return ZoomMeetingfacility;
    }

    public void setZoomMeetingfacility(boolean ZoomMeetingfacility) {
        this.ZoomMeetingfacility = ZoomMeetingfacility;
    }

    public String getZoomDeviceId() {
        return zoomdeviceid;
    }

    public void setZoomDeviceId(String zoomdeviceid) {
        this.zoomdeviceid = zoomdeviceid;
    }
    public String getZoomAccountId() {
        return zoomaccountid;
    }

    public void setZoomAccountId(String zoomAccountId) {
        this.zoomaccountid = zoomAccountId;
    }
}
class Booking {
    private int employeeId;
    private String meetingDate;
    private String meetingTime;
    private int duration;
    private MeetingRooms meetingRoom;

    public Booking(int employeeId, String meetingDate, String meetingTime, int duration, MeetingRooms meetingRoom) {
        this.employeeId = employeeId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.duration = duration;
        this.meetingRoom = meetingRoom;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(String meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public MeetingRooms getMeetingRoom() {
        return meetingRoom;
    }

    public void setMeetingRoom(MeetingRooms meetingRoom) {
        this.meetingRoom = meetingRoom;
    }
}