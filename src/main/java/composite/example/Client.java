package composite.example;

public class Client {
    public static void main(String []args){
        Task task1 = new Task("tarea1",
                "esta tarea es la t1",
                "p1",
                "5",
                "eynar");

        Task task2 = new Task("tarea2",
                "esta tarea es la t2",
                "p2",
                "3",
                "jose");

        Task task3 = new Task("tarea3",
                "esta tarea es la t3",
                "p1",
                "8",
                "maria");


        Entity userStory1 = new Entity("US1","user story","1","1","alexis");
        Entity userStory2 = new Entity("US2","user story","2","2","alexis");

        userStory1.add(task1);
        userStory1.add(task2);

        userStory2.add(task3);

        Entity feature1 = new Entity("F1","f1","1","1","1");
        Entity feature2 = new Entity("F2","f2","2","2","2");

        feature1.add(userStory1);
        feature1.add(userStory2);

        feature1.add(userStory1);
        feature2.add(userStory2);


        Entity epic = new Entity("EPIC","epic1","5","8","mario");
        epic.add(feature1);
        epic.add(feature2);
        epic.showInfo();


    }

}
