//import java.util.HashSet;
//import java.util.Random;
//import java.util.Set;
//
//public class StudyMiniProject5 {
//    public static void main(String[] args) {
//        String[] TV = {"ATV","FOX","NOW","STAR","TV8","HABERTR"};
//        Random random = new Random();
//        Set<String> yazilanlar = new HashSet<>();
//
//        String oncekiIfade = null;
//        int sayac = 0;
//
//        while (sayac < TV.length){
//            int rasgeleindex = random.nextInt(TV.length);
//            String secilenIfade = TV[rasgeleindex];
//
//            if(yazilanlar.contains(secilenIfade)){
//                System.out.println("ayı TV kanalı tekrar seçildi"+secilenIfade);
//
//            }else {
//                yazilanlar.add(secilenIfade);
//                System.out.println(secilenIfade);
//                sayac++;
//            }
//
//        }
//
//    }
//}