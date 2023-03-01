package command.example;

public class Client {
    public static void main(String []args){
        Ide intelliJ = new Ide("IntelliJ IDEA","2023","community","JB");
        CleanBuildFolder cleanCmd = new CleanBuildFolder(intelliJ);
        UnitTestExecution unitTestCmd = new UnitTestExecution(intelliJ);
        StandarizationReview standarCmd = new StandarizationReview(intelliJ);
        GenerateBuild buildCmd = new GenerateBuild(intelliJ);

        GenerateCommand makeBuildCMD = new GenerateCommand();
        makeBuildCMD.addNewCommand(cleanCmd);
        makeBuildCMD.addNewCommand(unitTestCmd);
        makeBuildCMD.addNewCommand(standarCmd);
        makeBuildCMD.addNewCommand(buildCmd);

        makeBuildCMD.run();
        makeBuildCMD.run();
    }

}
