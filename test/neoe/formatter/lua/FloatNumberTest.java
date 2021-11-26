package neoe.formatter.lua;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloatNumberTest {
    @Test
    public void test() {
        String code = "function onCanRx()\n" +
                "id = 0.1\n" +
                "end";
        String formatted = new LuaFormatter().format(code, new LuaFormatter.Env());
        assertEquals("function onCanRx()\n" +
                "\tid = 0.1\n" +
                "end\n" +
                "\n", formatted);

    }
}
