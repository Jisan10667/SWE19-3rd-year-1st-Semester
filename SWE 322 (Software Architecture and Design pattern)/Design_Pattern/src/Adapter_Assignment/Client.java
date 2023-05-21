package Adapter_Assignment;
public class Client {
    public static void main(String[] args) {
        //for XML
        XML xmlData = new XML();
        IAdapter<XML> xmlAdapter = new Adapter<XML>();
        String jsonData = xmlAdapter.convertToJson(xmlData);
        JSON json = new JSON();
        json.processJsonData(jsonData);

        //for ProtoBuffer
        Protobuf protobufData=new Protobuf() ;
        IAdapter<Protobuf> protobufAdapter=new Adapter<Protobuf>() ;

        jsonData=protobufAdapter.convertToJson(protobufData);
        json.processJsonData(jsonData);


    }
}