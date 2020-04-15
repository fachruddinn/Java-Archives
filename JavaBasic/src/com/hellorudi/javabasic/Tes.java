package com.hellorudi.javabasic;

import java.util.Arrays;

public class Tes {
    public static void main(String args[]) {

        var str = "Kotlin TutorialsepTutorialasepKartsepExamples";
        var delimiter1 = "sep";
//        var aa = """"""

        var parts = str.split(delimiter1);

        System.out.println(Arrays.toString(parts));
    }
}
