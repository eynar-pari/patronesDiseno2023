package memento.example;

public class Git {
    private Project project;

    public void setProject(Project project){
        this.project = new Project(project.getName());
        this.project.setComment(project.getComment())
                .setCode(project.getCode())
                .setUserStoryEnd(project.getUserStoryEnd());
    }

    public Memento createCommitProject(){
        return new Memento (this.project);
    }

    public Project checkoutCommit(Memento memento){
        this.project =memento.getProjectState();
        return this.project;
    }

}
