package Adapter_Assignment;

public class Adapter<T> implements IAdapter<T> {
    @Override
    public String convertToJson(T inputData) {
        // Detect the input type and convert to JSON accordingly
        if (inputData instanceof XML) {
            XML xml = (XML) inputData;
            xml.processXmlData("XML data");
            // Convert XML to JSON and return
            String jsonData = "<converted JSON data>";
            return jsonData;
        } else if (inputData instanceof Protobuf) {
            Protobuf protobuf = (Protobuf) inputData;
            protobuf.processProtobufData("Protobuf data");
            // Convert Protobuf to JSON and return
            String jsonData = "<converted JSON data>";
            return jsonData;
        } else {
            // Handle other data types
            throw new IllegalArgumentException("Unsupported input type");
        }
    }
}