import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class DZ2 {
    public static void main(String[] args){

        File file1 = new File("logsSort.txt"); 
        System.out.println("Расширение файла: " + findExtension(file1));

        File file2 = new File("файл.pdf"); 
        System.out.println("Расширение файла: " + findExtension(file2));

        File file3 = new File("Lesson2");
        System.out.println("Расширение файла: " + findExtension(file3));

        File file4 = new File("cupOfJava.jpg");
        System.out.println("Расширение файла: " + findExtension(file4));
        
    }

    static String findExtension(File file) {
// Задание

// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg
        String filename = file.getName();
        if (filename.lastIndexOf(".") != -1 && filename.lastIndexOf(".") != 0) {
            return filename.substring(filename.lastIndexOf(".") + 1); 
        } else {
            return "";
        }
    }
}




