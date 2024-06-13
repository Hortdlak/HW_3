import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup("Группа 1");
        StudyGroup group2 = new StudyGroup("Группа 2");
        StudyGroup group3 = new StudyGroup("Группа 3");

        List<StudyGroup> groups1 = new ArrayList<>();
        groups1.add(group1);
        groups1.add(group2);

        List<StudyGroup> groups2 = new ArrayList<>();
        groups2.add(group1);

        List<StudyGroup> groups3 = new ArrayList<>();
        groups3.add(group1);
        groups3.add(group2);
        groups3.add(group3);

        Stream stream1 = new Stream("Поток 1", groups1);
        Stream stream2 = new Stream("Поток 2", groups2);
        Stream stream3 = new Stream("Поток 3", groups3);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        StreamService streamService = new StreamService();
        streamService.sortStreams(streams);

        System.out.println("Потоки отсортированные по группам:");

        for (Stream stream : streams) {
            System.out.println(stream.getStreamName() + " с " + stream.size() + " учебной группой;");
        }
    }
}