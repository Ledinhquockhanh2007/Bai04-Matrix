package com.uet.cs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.File;

public class PathUtilsTest {

    @Test
    public void testCreateLogFilePath() {
        PathUtils utils = new PathUtils();

        // Kỳ vọng chuẩn của hệ điều hành đang chạy (dùng File.separator)
        String expectedPath = "logs" + File.separator + "app.log";
        String actualPath = utils.createLogFilePath("logs", "app.log");

        assertEquals(expectedPath, actualPath,
                "Đường dẫn tạo ra phải tương thích với hệ điều hành hiện tại!");
    }
}