/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex27;

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Command {
    private String command;
    Command(String command) {
        this.command = command;
    }
    void operation() { System.out.print(command + " /// "); }
}

class CommandInflator {
    static Queue<Command> inflateWithCommands() {
        Command[] commandsArr = {new Command("Run!"), new Command("Pull up!"), new Command("Take care!"), new Command("Be careful!")};
        Queue<Command> commandsQ = new LinkedList<Command>();
        commandsQ.addAll(Arrays.asList(commandsArr));
        return commandsQ;
    }
}
public class QueueTest {
    public static void main(String[] args) {
        Queue<Command> qc = CommandInflator.inflateWithCommands();
        while(qc.peek() != null) {
            qc.remove().operation();
        }
    }
}
