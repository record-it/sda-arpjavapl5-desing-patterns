package sda.arpjavapl5.patterns.iterator;

public class TeamIteratorDemo {
    public static void main(String[] args) {
        Team team = Team.builder()
                .developer("Marek")
                .leader("Konrad")
                .tester("Bonifacy")
                .build();
        for(String member: team){
            System.out.println(member);
        }
    }
}
