package Java.DZ.Stream;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>  {


    @Override
    public int compare(Stream o1, Stream o2) {
        int size1 = o1.getGroupList().size();
        int size2 = o2.getGroupList().size();

        return Integer.compare(size1, size2);
    }
}
