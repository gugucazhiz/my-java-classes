import org.junit.*;

public class f57Junit {
    @Test
    public void main() {
        TesteJunit tj = new TesteJunit();
        Assert.assertEquals("Hello Word", tj.Say());
    }
}
