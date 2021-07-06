// package question2;

// import java.sql.Date;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.Comparator;

// public class TemperatureComparator implements Comparator<String[]> {
 
//     @Override
//     public int compare(String[] o1, String[] o2) {
//         //最高気温比較
//         int maxTemp1 = (int)(Double.parseDouble(o1[1]) * 10);
//         int maxTemp2 = (int)(Double.parseDouble(o2[1]) * 10);
//         if(maxTemp1 < maxTemp2){
//             return 1 ;
//         }else if(maxTemp1 > maxTemp2){
//             return -1 ;
//         }else{
//             //最低気温比較
//             int minTemp1 = (int)(Double.parseDouble(o1[2]) * 10);
//             int minTemp2 = (int)(Double.parseDouble(o2[2]) * 10);
//             if(minTemp1 < minTemp2){
//                 return 1 ;
//             }else if(minTemp1 > minTemp2){
//                 return -1 ;
//             }else{
//                 //平均気温比較
//                 int avgTemp1 = (int)(Double.parseDouble(o1[3]) * 10);
//                 int avgTemp2 = (int)(Double.parseDouble(o2[3]) * 10);
//                 if(avgTemp1 < avgTemp2){
//                     return -1 ;
//                 }else if(avgTemp1 > avgTemp2){
//                     return 1 ;
//                 }else{
//                     //日付を比較
//                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//                     try {
//                         Date date1 = sdf.parse(o1[0]);
//                         Date date2 = sdf.parse(o2[0]);
//                         if(date1.before(date2)){
//                             return -1 ;
//                         }else if(date2.before(date1)){
//                             return 1 ;
//                         }else{
//                             return 0 ;
//                         }
//                     } catch (ParseException e) {
//                         // TODO 自動生成された catch ブロック
//                         e.printStackTrace();
//                     }
//                 }
//             }
//         }
//         return 0;
//     }
 
// }
