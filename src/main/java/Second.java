import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

public class Second {
    public static void main(String[] args) {
        var p = Range.open(1,4);

        for(int grade : ContiguousSet.create(p, DiscreteDomain.integers())) {
            System.out.print(grade +" ");
        }

    }
}
