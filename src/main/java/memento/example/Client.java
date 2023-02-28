package memento.example;

public class Client {

    public static void main(String[] args) throws Exception {
        Github github = new Github();
        Git git = new Git();

        Project patronesDiseno = new Project("Patrones Diseno");

        patronesDiseno.setComment("init project")
                .setCode("public class Persona")
                .setUserStoryEnd("USER, inprogress");

        patronesDiseno.setCode(patronesDiseno.getCode()+"\npublic class Docente")
                        .setUserStoryEnd("USER, done");
        git.setProject(patronesDiseno);
        github.createCommit("4624ed1",git.createCommitProject());

        patronesDiseno.setCode(patronesDiseno.getCode()+"\npublic class Estudiante")
                        .setUserStoryEnd("USER, inprogress");

        patronesDiseno.setCode(patronesDiseno.getCode()+"\npublic class Director")
                .setUserStoryEnd("USER, inprogress");

        patronesDiseno.setCode(patronesDiseno.getCode()+"\npublic class Curso")
                .setUserStoryEnd("USER, done");
        git.setProject(patronesDiseno);
        github.createCommit("4556fff",git.createCommitProject());

        patronesDiseno.setCode(patronesDiseno.getCode()+"\npublic class Notas")
                .setUserStoryEnd("USER, inprogress");

        System.out.println("Deberia mostrar el ultimo commit --> 6 linias de codigo");
        patronesDiseno.showInfo();

        patronesDiseno = git.checkoutCommit(github.getCommit("4624ed1"));

        System.out.println("Deberia mostrar el 2do commit --> 2 linias de codigo");
        patronesDiseno.showInfo();


        patronesDiseno = git.checkoutCommit(github.getCommit("4556fff"));

        System.out.println("Deberia mostrar el 2do commit --> 5 linias de codigo");
        patronesDiseno.showInfo();
    }
}
