import java.util.Comparator;

// Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Stream;

class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream s1, Stream s2) {
        return Integer.compare(s1.size(), s2.size());
    }
}
