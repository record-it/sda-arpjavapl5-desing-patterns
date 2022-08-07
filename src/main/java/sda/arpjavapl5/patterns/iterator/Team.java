package sda.arpjavapl5.patterns.iterator;

import lombok.Builder;
import lombok.Data;

import java.util.Iterator;

@Data
@Builder
public class Team implements Iterable<String>{
    private String leader;
    private String developer;
    private String tester;

    @Override
    public Iterator<String> iterator() {
        return new TeamIterator(this);
    }

    public static class TeamIterator implements Iterator<String>{
        final Team team;
        int count = 0;
        public TeamIterator(Team team) {
            this.team = team;
        }

        @Override
        public boolean hasNext() {
            return count < 3;
        }

        @Override
        public String next() {
            String member = "";
            switch (count){
                case 0:
                    member = team.leader;
                    break;
                case 1:
                    member = team.developer;
                    break;
                case 2:
                    member = team.tester;
                    break;
                default:
                    throw new IllegalStateException();
            }
            count++;
            return member;
        }
    }
}
