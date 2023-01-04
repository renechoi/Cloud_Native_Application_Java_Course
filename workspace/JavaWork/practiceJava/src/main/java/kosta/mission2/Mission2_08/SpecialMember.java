package kosta.mission2.Mission2_08;

public class SpecialMember extends Member{

    private int point;

    public SpecialMember() {
    }

    public SpecialMember(String id, String name, String address, Video video, int point) {
        super(id, name, address, video);
        this.point = point;
    }

    @Override
    public void watchVideo(Video video) {
        super.watchVideo(video);
        this.point+=5;
    }

    @Override
    public String toString() {
        return super.toString() + "point : " + point;
    }
}
