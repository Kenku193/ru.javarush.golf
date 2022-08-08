package Module2.IslandModel.services;

import Module2.IslandModel.entities.Game;
import Module2.IslandModel.entities.settings.Settings;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameWorker extends Thread {

    private final Game game;

    //
    private final long LIFE_CYCLE_DURATION = Settings.get().getCycleDuration();
    private final Boolean STOP_ON_TIMEOUT = Settings.get().getStopOnTimeout();
    private final int GAME_DURATION = Settings.get().getGameDuration();

    public GameWorker(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        game.showStatistics();
        //
        ScheduledExecutorService gameScheduledThreadPool = Executors.newScheduledThreadPool(4);
        gameScheduledThreadPool.scheduleWithFixedDelay(this::runAndWaitOrganismWorkers, LIFE_CYCLE_DURATION, LIFE_CYCLE_DURATION, TimeUnit.MILLISECONDS);

        if (STOP_ON_TIMEOUT) runTimer();
    }

    private void runAndWaitOrganismWorkers() {
        ArrayList<OrganismWorker> organismWorkers = new ArrayList<>();
        for (String organismType : Settings.get().getOrganismsTypes()) {
            organismWorkers.add(new OrganismWorker(organismType, game.getWorld()));
        }
        //
        int CORE_POOL_SIZE = 4;
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(CORE_POOL_SIZE);
        for (OrganismWorker organismWorker : organismWorkers) {
            fixedThreadPool.submit(organismWorker);
        }
        fixedThreadPool.shutdown();

        try {
            if (fixedThreadPool.awaitTermination(Integer.MAX_VALUE, TimeUnit.DAYS)) {
                game.showStatistics();
            }
        } catch (InterruptedException e) {
            //
            System.out.println("The game is finished");
        }
    }

    private void runTimer() {
        try {
            Thread.sleep(GAME_DURATION);
        } catch (InterruptedException e) {
            System.out.println("The game is already finished");
        }
        //
        System.out.println("The game is over by timeout");
        System.exit(1);
    }

}
