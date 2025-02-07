package Runner;

import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.jar.JarFile;

public class ReadManifest {

    public static void main(String[] args) throws IOException {
        String jarFilePath = "C:\\Users\\harishkannan.sukumar\\IdeaProjects\\ContinousIntegration\\target\\ContinousIntegration-1.0-SNAPSHOT-test-jar-with-dependencies.jar";
        try (JarFile jarFile = new JarFile(jarFilePath)) {
            Manifest manifest = jarFile.getManifest();

            if (manifest != null) {
                Attributes attributes = manifest.getMainAttributes();

                // Access attributes
                String mainClass = attributes.getValue(Attributes.Name.MAIN_CLASS);
                String classPath = attributes.getValue(Attributes.Name.CLASS_PATH);

                System.out.println("Main Class: " + mainClass);
                System.out.println("Class-Path: " + classPath);
            } else {
                System.out.println("Manifest not found in JAR file.");
            }
        }
    }
}
