package sda.arpjavapl5.patterns.flyweight;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookGeneratorTest {

    @Test
    public void shouldReturnSameBookDetailsReferenceInAllBooks(){
        //given
        BookGenerator generator = new BookGenerator();
        //when
        final List<Book> list = generator.generate("AAA", "BBB", 3);
        //that
        assertEquals(list.get(0).getDetails(), list.get(1).getDetails());
        assertEquals(list.get(0).getDetails(), list.get(2).getDetails());
    }

}