import java.util.Collections;
import java.util.List;

// Создать класс StreamService, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

class StreamService {
    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
