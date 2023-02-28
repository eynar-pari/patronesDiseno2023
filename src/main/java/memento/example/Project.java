package memento.example;

public class Project {
    private String name;
    private String comment;
    private String code;
    private String userStoryEnd;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public String getCode() {
        return code;
    }

    public String getUserStoryEnd() {
        return userStoryEnd;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public Project setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Project setCode(String code) {
        this.code = code;
        return this;
    }

    public Project setUserStoryEnd(String userStoryEnd) {
        this.userStoryEnd = userStoryEnd;
        return this;
    }

    public void showInfo(){
        System.out.println("*************");
        System.out.println("name: "+name);
        System.out.println("comment: "+comment);
        System.out.println("code: "+code);
        System.out.println("userStoryEnd: "+userStoryEnd);
        System.out.println("************");
    }
}
