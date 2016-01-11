package uk.co.georgenixon.nextbuses;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import android.content.SharedPreferences;


/**
 * Created by g on 11/01/2016.
 */

@RunWith(MockitoJUnitRunner.class)
public class NowNextTest {

    @Test
    public void OnCreate_CreatesTheSUT() throws Exception {
        NowNext sut = new NowNext();
        assertThat(sut, is(notNullValue()));
    }
}