package calcselling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CalcSelling {
  private static FileInputStream fi = null;
  private static InputStreamReader is = null;
  private static BufferedReader br = null;
  private static HashMap<String, Integer> itemList = new HashMap<String, Integer>();
  private static Map<String, Integer> sellingTotalList = new HashMap<String, Integer>() {
    {
      put(WeekOfDay.MONDAY.toLabel(), 0);
      put(WeekOfDay.TUESDAY.toLabel(), 0);
      put(WeekOfDay.WEDNESDAY.toLabel(), 0);
      put(WeekOfDay.THURSDAY.toLabel(), 0);
      put(WeekOfDay.FRIDAY.toLabel(), 0);
      put(WeekOfDay.SATURDAY.toLabel(), 0);
      put(WeekOfDay.SUNDAY.toLabel(), 0);
    }
  };
  enum WeekOfDay {
    MONDAY("月曜日"),
    TUESDAY("火曜日"),
    WEDNESDAY("水曜日"),
    THURSDAY("木曜日"),
    FRIDAY("金曜日"),
    SATURDAY("土曜日"),
    SUNDAY("日曜日"); 
  
    private String label;
    private WeekOfDay(String label) {
      this.label = label; 
    }
  
    public String toLabel() {
      return this.label;
    } 
  }

  public static void main(String[] args) {
    // アイテムマスタからHashMap
    setItemToHashMap();
    setPriceResultToHashMap();
    List<Entry<String, Integer>> results = sortByTotalSelling();

    // 結果を出力
    System.out.println("対象期間の曜日別売上一覧");
    for(Entry<String, Integer> entry : results) {
      System.out.println(entry.getKey() + "の売上高合計は、" + String.format("%,d", entry.getValue()) + "円です。");
    }
  }


  private static List<Entry<String, Integer>> sortByTotalSelling() {
    List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(sellingTotalList.entrySet());
    Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
      //compareを使用して値を比較して降順でsort
      public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
      {
        return obj2.getValue().compareTo(obj1.getValue());
      }
    });
    return list_entries;
  }

  private static void calcTotal(String[] data , String date) {
    Integer selling = itemList.get(data[1]) * Integer.parseInt(data[2]);
    Integer total = sellingTotalList.get(date) + selling;
    sellingTotalList.put(date, total);
  }

  private static void setItemToHashMap() {
    // 商品マスタをHashMapに展開、参照用に保存
    try {
      fi = new FileInputStream("./csv/item-master.csv");
      is = new InputStreamReader(fi);
      br = new BufferedReader(is);

      String line;
      // 行を判定するため
      int i = 0;

      while ((line = br.readLine()) != null) {
        // 先頭行は列名なのでスキップ
        if (i != 0) {
          String[] data = line.split(",");
          itemList.put(data[0], Integer.parseInt(data[2]));
        }
        i++;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  private static void setPriceResultToHashMap() {
    try {
      fi = new FileInputStream("./csv/selling-record.csv");
      is = new InputStreamReader(fi);
      br = new BufferedReader(is);
      Calendar cal = Calendar.getInstance();

      String line;
      // 行を判定するため
      int i = 0;
      while ((line = br.readLine()) != null) {
        // 先頭行は列名なのでスキップ
        if (i != 0) {
          String[] data = line.split(",");

          // 日付を年、月、日を分割
          String[] date = data[0].split("/");
          cal.set(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));

          // Todo: ここに曜日で判定して値を加算する処理を入れる
          switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
              calcTotal(data, WeekOfDay.MONDAY.toLabel());
              break;
            case Calendar.TUESDAY:
              calcTotal(data, WeekOfDay.TUESDAY.toLabel());  
              break;
            case Calendar.WEDNESDAY:
             calcTotal(data, WeekOfDay.WEDNESDAY.toLabel());
              break;
            case Calendar.THURSDAY:
              calcTotal(data, WeekOfDay.THURSDAY.toLabel());
              break;
            case Calendar.FRIDAY:
              calcTotal(data, WeekOfDay.FRIDAY.toLabel());
              break;
            case Calendar.SATURDAY:
              calcTotal(data, WeekOfDay.SATURDAY.toLabel());
              break;
            case Calendar.SUNDAY:
              calcTotal(data, WeekOfDay.SUNDAY.toLabel());
              break;
            default:
              break;
          }
        }
        i++;
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}
