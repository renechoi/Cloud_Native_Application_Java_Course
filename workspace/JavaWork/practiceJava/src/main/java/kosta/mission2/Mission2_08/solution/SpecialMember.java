package kosta.mission2.Mission2_08.solution;


public class SpecialMember extends GeneralMember {

    private int point;

    public SpecialMember() {
    }

    public SpecialMember(String id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public void rentalVideo(Video videoRented) {
        super.rentalVideo(videoRented);
    }

    @Override
    public String toString() {
        return super.toString() + "point : " + point;
    }
}
