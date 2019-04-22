package com.capstone.insole.webapp.app;

import java.io.*;
import java.util.stream.Stream;

/**
 * Call and receive output from Python script in Java.
 */

// Todo: Thread my be needed
public class ClassifierExecutor {

    /**
     * http://www.codecodex.com/wiki/Execute_an_external_program_and_capture_the_output
     *
     * @param pythonPath
     * @param pythonScriptPath
     */
    public static void execute(final String pythonPath, final String pythonScriptPath) {
        System.out.println("Executing ...");
        try {
            String line;
            Process p = Runtime.getRuntime().exec
                    (System.getenv("windir") +"\\system32\\"+"tree.com /A");
            BufferedReader input =
                    new BufferedReader
                            (new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            input.close();
        }
        catch (Exception err) {
            err.printStackTrace();
        }
    }

    // TODO: Refactorization
    public static void injectLines(final String pythonPath, final String pythonScriptPath){
        String line;
        OutputStream stdin = null;
        InputStream stderr = null;
        InputStream stdout = null;

        // launch EXE and grab stdin/stdout and stderr
        Process process = null;
        try {
            process = Runtime.getRuntime ().exec (pythonPath + " " + pythonScriptPath);

            stdin = process.getOutputStream ();
            stderr = process.getErrorStream ();
            stdout = process.getInputStream ();

            // "write" the parms into stdin
            line = "param1" + "\n";
            stdin.write(line.getBytes() );
            stdin.flush();

            line = "param2" + "\n";
            stdin.write(line.getBytes() );
            stdin.flush();

            line = "param3" + "\n";
            stdin.write(line.getBytes() );
            stdin.flush();

            stdin.close();

            // clean up if any output in stdout
            BufferedReader brCleanUp =
                    new BufferedReader (new InputStreamReader (stdout));
            while ((line = brCleanUp.readLine ()) != null) {
                //System.out.println ("[Stdout] " + line);
            }
            brCleanUp.close();

            // clean up if any output in stderr
            brCleanUp =
                    new BufferedReader (new InputStreamReader (stderr));
            while ((line = brCleanUp.readLine ()) != null) {
                //System.out.println ("[Stderr] " + line);
            }
            brCleanUp.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
