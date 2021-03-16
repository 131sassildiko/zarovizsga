//import java.io.BufferedReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.List;
//
//public class workhours {
//    public static class WorkHours {
//
//        public static void main(String[] args) {
//
//            Path file = Path.of("src/test/resources/workhours.txt");
//            try (BufferedReader reader = Files.newBufferedReader(file)) {
//                String line;
//                while ((line = reader.readLine())!=null) {
//                    String[] parts = line.split(",");
//                    String name = parts [0];
//                    int worktime = Integer.parseInt (parts [1]);
//                    String date = parts [2];
//                    List<Integer> l = new ArrayList<>();
//                    l.add (worktime);
//                    }
//            }
//            catch (IOException ioe) {
//                throw new IllegalStateException("Can not read file", ioe);
//            }
//        }
//
//    }   public int min(List<Integer> l) {
//        int min = Integer.MIN_VALUE;
//        for (Integer n: l) {
//            if (n < min) {
//                min = n;
//            }
//        }
//        return min;
//}
//
//    public String minWork (String file){
//        if (workhours.worktime==min) {
//            return ("name" + "date"I;
//        }
//    }
//
//    }