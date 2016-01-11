package uk.co.georgenixon.nextbuses;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import android.content.SharedPreferences;
import android.os.Bundle;


/**
 * Created by g on 11/01/2016.
 */

@RunWith(MockitoJUnitRunner.class)
public class NowNextTest {

    @Test
    public void OnCreate_CreatesTheSUT() throws Exception {
        NowNext sut = new NowNext();
        sut.onCreate(new Bundle());
        assertThat(sut, is(notNullValue()));
        assertThat(sut.Dic, is(notNullValue()));
        assertThat(sut.Dic.MinuteTimer, is(notNullValue()));
        assertThat(sut.Dic.UiUpdater, is(notNullValue()));
    }
}