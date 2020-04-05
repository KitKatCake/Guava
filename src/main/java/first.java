import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class first {
    public static void main(String[] args) {
//        Stopwatch stopwatch = Stopwatch.createStarted();
//        for(int i=0; i<10000000; i++){
//        }
//        long nanos = stopwatch.elapsed(TimeUnit.MILLISECONDS);
//        System.out.println(nanos);



//        String str = "1-2-3-4-5-6";
//
//        List<String> list = Splitter.on("-").splitToList(str);
//
//        System.out.println(list);



        Map<String,Integer> map = Maps.newHashMap();

        map.put("xiaoming", 12);
        map.put("xiaohong",13);

        String result = Joiner.on(",").withKeyValueSeparator("=").join(map);

        System.out.println(result);

        List<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");
        list.add("cc");

        String result2 = Joiner.on("-").join(list);

        System.out.println(result2);

        Multimap<String,Integer> map1 = ArrayListMultimap.create();

        map1.put("aa",1);
        map1.put("aa",2);

        System.out.println(map1.get("aa"));
    }
}
