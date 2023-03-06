package hexlet.code.formatters;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {

    public static String jsonFormatter(Map<String, String> mapOfDiff) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        String result = mapper.writeValueAsString(mapOfDiff);

        return result;
    }
}
