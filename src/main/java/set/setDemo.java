package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: jianliangzhang
 * Date: 2017/12/12
 * Time: 13:44
 */
public class setDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("123");
        set.add("223");
        set.add("323");
        set.add("423");
        for (String s:set) {
            System.out.println(s);
        }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
