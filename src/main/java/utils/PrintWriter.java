package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public abstract class PrintWriter {
    private static FileWriter fileWriter;
    private static final HashMap<ModuleNames, Boolean> permissions = new HashMap<ModuleNames, Boolean>() {{
        put(ModuleNames.SIN, false);
        put(ModuleNames.COS, false);
        put(ModuleNames.TAN, false);
        put(ModuleNames.COT, false);
        put(ModuleNames.SEC, false);
        put(ModuleNames.CSC, false);
        put(ModuleNames.LN, false);
        put(ModuleNames.LOG2, false);
        put(ModuleNames.LOG3, false);
        put(ModuleNames.LOG5, false);
        put(ModuleNames.LOG10, false);
        put(ModuleNames.SYSTEM, false);
    }};

    static {
        try {
            fileWriter = new FileWriter("src/main/resources/result.csv");
        } catch (IOException e) {
            System.out.println("Result File not found");
        }
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("src/main/resources/permissions.csv"));
            String[] permissions = fileReader.readLine().split(",");
            for (String permission : permissions) {
                try{
                    PrintWriter.permissions.put(ModuleNames.valueOf(permission), true);
                } catch (IllegalArgumentException e) {
                    System.out.println("Permissions file corrupted");
                }
            }
        } catch (IOException e) {
            System.out.println("Permissions File not found");
        }
    }

    public static void write(double x, double result, ModuleNames module) {
        if (PrintWriter.permissions.get(module)) {
            try {
                fileWriter.write(module.toString().toLowerCase() + "," + x + "," + result + "\n");
                fileWriter.flush();
            } catch (IOException e) {
                System.out.println("Unable to write results");
            }
        }
    }

    public static void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to close to opened streams");
        }
    }
}
