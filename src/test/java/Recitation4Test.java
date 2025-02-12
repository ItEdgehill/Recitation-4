import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recitation4Test {

    @Test
    void explode() {
        assertEquals("Coodddeeee", Recitation4.explode("Code"));
        assertEquals("22bbeeeOOOORRRRRnnnnnnoooooootttttttt2beORnot", Recitation4.explode("2beORnot!"));
        assertEquals("zzeeerrrrooooo",Recitation4.explode("0zero"));
        assertEquals("55555666666bbbbaaaaatttttt",Recitation4.explode("#56bat"));
        assertEquals("beebe22vvvvvnnnnnn",Recitation4.explode("be^2vn"));
    }
}