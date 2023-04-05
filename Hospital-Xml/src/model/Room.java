package model;

import java.util.List;

public class Room {
    private int bedNumbers;
    private int floorNumbers;
    private int id;
    private List<Patient> patients;
    private int roomNumbre;


    public Room(int bedNumbers, int floorNumbers, int id, List<Patient> patients, int roomNumbre) {
        this.bedNumbers = bedNumbers;
        this.floorNumbers = floorNumbers;
        this.id = id;
        this.patients = patients;
        this.roomNumbre = roomNumbre;
    }

    public int getBedNumbers() {
        return bedNumbers;
    }

    public void setBedNumbers(int bedNumbers) {
        this.bedNumbers = bedNumbers;
    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public int getRoomNumbre() {
        return roomNumbre;
    }

    public void setRoomNumbre(int roomNumbre) {
        this.roomNumbre = roomNumbre;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bedNumbers=" + bedNumbers +
                ", floorNumbers=" + floorNumbers +
                ", id=" + id +
                ", patients=" + patients +
                ", roomNumbre=" + roomNumbre +
                '}';
    }
}
