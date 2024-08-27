package Files;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

/**
 * FilePath
 */
public class FilePath {
    Path path = Path.of("c:\\Personal\\foruda\\tead.txt");
//    Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
    boolean exists = Files.exists(path);
    final String parthOne = "c:\\Personal\\foruda\\tead.txt";
    final String parthTwo = "c:\\Personal\\readme.txt";
    // still not exits
    final String parthThree = "c:/Personal/foruda/file.txt";
    // use URI to path file


    public void testFilePath() throws IOException, URISyntaxException {
        System.out.println("hello");
        System.out.println(exists);
        System.out.println(path);

        // check if a file exists we could use method exist from the Files Class
        path = Path.of(new URI("file:///c:/Personal/foruda/tead.txt"));
        boolean existsFile = Files.exists(path);
        System.out.println(existsFile);
        FileTime lastModifiedTime = Files.getLastModifiedTime(path);
        System.out.println(lastModifiedTime);


        // compare two files, if you get 0 they are mismatch or -1 they are not
        long mismatchIndex = Files.mismatch(path, Paths.get(parthOne));
        System.out.println("mismatch = " + mismatchIndex);

        // owner of the file
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner = " + owner);

        // how to create a temp file
        Path tempFile1 = Files.createTempFile("somePrefixOrNull", ".jpg");
        System.out.println("tempFile1 = " + tempFile1);

        Path tempFile2 = Files.createTempFile(path.getParent(),"somePrefixOrNull", ".jpg");
        System.out.println("tempFile2 = " + tempFile2);

        Path tempDirectory = Files.createTempDirectory("prefix");
        System.out.println("tempFile3 = " + tempDirectory);

        // Create files and directories
//        Path newDirectory = Files.createDirectories(path.getParent().resolve("some/new/dir"));
//        System.out.println("newDirectory = " + newDirectory);

//        Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
//        System.out.println("newFile = " + newFile);

        try {
            Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path);
            System.out.println("permissions = " + permissions);
        }catch (UnsupportedOperationException e){
            System.err.println("Looks like you're not running on a posix file system");
        }



    }

}
