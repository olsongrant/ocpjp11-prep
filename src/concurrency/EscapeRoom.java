package concurrency;

import java.util.concurrent.*;
import java.util.List;

public class EscapeRoom {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        ExecutorService anExecutorService = Executors.newFixedThreadPool(10);
        CyclicBarrier signedIn = new CyclicBarrier(6, () -> System.out.println("Everyone is signed in!"));
        CyclicBarrier inTheRoom = new CyclicBarrier(6, () -> System.out.println("The team is ready!"));
        List<String> participantNames = List.of("Ashley", "Maya", "Jourdanne", "Adam", "Jim", "Ryan");
        for (String aName: participantNames) {
            Participant p = new Participant(aName, signedIn, inTheRoom);
            anExecutorService.execute(p);
        }
        Thread.sleep(1000);
        anExecutorService.shutdown();
        anExecutorService.awaitTermination(30, TimeUnit.SECONDS);
        if (anExecutorService.isTerminated()) {
            System.out.println("Game is done!");
        }
    }
}

class Participant implements Runnable {
    private String name = "default";
    private CyclicBarrier signInCheck = null;
    private CyclicBarrier readinessCheck = null;

    public Participant(String aName, CyclicBarrier c1, CyclicBarrier c2) {
        this.name = aName;
        this.signInCheck = c1;
        this.readinessCheck = c2;
    }

    private String addNameToMessage(String msg) {
        return this.name + ": " + msg;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.addNameToMessage("signing in"));
            signInCheck.await();
            System.out.println(this.addNameToMessage("getting ready"));
            readinessCheck.await();
            System.out.println(this.addNameToMessage("solving puzzles"));
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

}

