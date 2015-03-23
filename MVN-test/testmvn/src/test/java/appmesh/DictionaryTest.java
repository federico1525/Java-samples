package appmesh;

import appmesh.dictionary.Dictionary;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class DictionaryTest {

    private Dictionary dictionary = Dictionary.getInstance();


    @Before
    public void inizializeDirectory() {

    List<String> testWords = Arrays.asList("foo", "fooz", "baz", "bar");
    // potevo fare anche dictionary.addWord("foo") etc una per una?
        for (String word : testWords) {
            dictionary.addWord(word);
        }
    }

    @Test
    public void testComplete(){
        // test complete
        // actual significa che devo usare i metodi del dictionary per poi confrontarlo con quello expected
        // in questo caso uso quindi l'istanza di Dictionaray e il metodo getWords()
        List<String> actual = dictionary.getWords("baz");
        List<String> expected = Arrays.asList("baz");

        assertThat(actual, is(expected));

    }

    @Test
    public void testNiente(){
        // test complete
        // actual significa che devo usare i metodi del dictionary per poi confrontarlo con quello expected
        // in questo caso uso quindi l'istanza di Dictionaray e il metodo getWords()
        List<String> actual = dictionary.getWords("baazz");
        List<String> expected = Collections.emptyList();
        assertThat(actual, is(expected));

    }

    @Test
    public void testPrefisso(){
        // test complete
        // actual significa che devo usare i metodi del dictionary per poi confrontarlo con quello expected
        // in questo caso uso quindi l'istanza di Dictionaray e il metodo getWords()
        List<String> actual = dictionary.getWords("ba");
        List<String> expected = Arrays.asList("baz", "bar");
        assertThat(actual, is(expected));

    }

    @Test
    public void testCache(){
        dictionary.getWords("foo");

        List<String> actual = dictionary.getLastResults();
        List<String> expected = Arrays.asList("foo", "fooz");
        assertThat(actual, is(expected));

        // let's empty the cache by putting a value generatin an empty string

        dictionary.getWords("invalidate cache");
        actual = dictionary.getLastResults();
        assertThat(actual, not(is(expected)));

    }

}
