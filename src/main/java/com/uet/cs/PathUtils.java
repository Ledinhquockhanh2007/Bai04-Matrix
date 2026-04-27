//package com.uet.cs;
//
//public class PathUtils {
//    public String createLogFilePath(String directory, String filename) {
//        // CỐ TÌNH CODE LỖI: Dùng cứng dấu gạch chéo của Linux/Mac
//        return directory + "/" + filename;
//    }
//}

package com.uet.cs;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathUtils {
    public String createLogFilePath(String directory, String filename) {
        // REFACTOR: Sử dụng java.nio.file.Paths để hệ điều hành tự quyết định dấu gạch chéo
        Path path = Paths.get(directory, filename);
        return path.toString();
    }
}