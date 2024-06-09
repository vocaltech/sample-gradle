package fr.vocaltech.jenkins;

import fr.vocaltech.jenkins.models.Position;

public class Main {
    public static void main(String[] args) {
        var position = new Position(45.5, 1.4);
        System.out.println(position.toString());
        System.out.println("Jenkins integration");
    }
}