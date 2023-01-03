package kosta.mission2.Mission2_08.solution;

import java.util.Arrays;
import java.util.Objects;

public class GeneralMember {
    private String id;
    private String name;
    private String address;
    private Video videoRented;
    private final Video[] videosRented = new Video[10];
    private int rentedCounts = 0;

    public GeneralMember() {
    }

    public GeneralMember(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void rentalVideo(Video videoRented) {
        this.videoRented = videoRented;
        rentedCounts++;
    }

    public void rentalVideos(Video... videoRented) {
        for (Video video : videoRented) {
            this.videosRented[rentedCounts++] = video;
        }
    }

    public Video[] getVideosRented() {
        return videosRented;
    }

    public void showEach() {
        System.out.println(
                String.format("""
                                회원의 아이디: %s
                                회원의 이름: %s
                                회원의 주소: %s
                                """,
                        id, name, address)
                        + videoRented.getInfo()
                        + "-".repeat(30)
        );
    }

    public void showAll() {
        System.out.println(
                String.format("""
                                회원의 아이디: %s
                                회원의 이름: %s
                                회원의 주소: %s
                                %s
                                """,
                        id, name, address, "-".repeat(15))
                        + getAllVideos()
                        + "-".repeat(30)
        );
    }

    private String getAllVideos(){
        return Arrays.stream(this.getVideosRented())
                .filter(Objects::nonNull)
                .map(Video::getInfo)
                .toList()
                .toString()
                .replaceAll("[,\\[\\]]", "")
                ;
    }
}
