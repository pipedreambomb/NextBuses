package uk.co.georgenixon.nextbuses;

/**
 * Created by g on 11/01/2016.
 */
public class DependencyInjectionContainer {

    public final MinuteTimer MinuteTimer;
    public final UiUpdater UiUpdater;

    public DependencyInjectionContainer(MinuteTimer timer, UiUpdater updater){
        this.MinuteTimer = timer;
        this.UiUpdater = updater;
    }
}
