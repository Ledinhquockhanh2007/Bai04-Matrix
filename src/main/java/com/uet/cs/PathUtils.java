package com.uet.cs;

public class PathUtils {
    public String createLogFilePath(String directory, String filename) {
        // CỐ TÌNH CODE LỖI: Dùng cứng dấu gạch chéo của Linux/Mac
        return directory + "/" + filename;
    }
}