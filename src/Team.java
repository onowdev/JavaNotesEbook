public class Team {
    Member member;
    public Team(Member member){
        this.member = member;
    }

    //Main Method nya
    public static void main(String[] args) {
        Member myMember = new Member("Aurieel", "light", 10, 1);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
}

class Member{
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name, String type, int level, int rank){
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }
    /* let's define our getter Functions Here */
    public String getName(){ // Whats your name?
        return this.name; // My name is....
    }
    public String getType(){ // Whats Your type
        return this.type; // My type is...
    }
    public int getLevel(){ // Whats is your level?
        return this.level; // My level is...
    }
    public int getRank(){// Whats is your Rank?
        return this.rank;// My Rank is...
    }
}
