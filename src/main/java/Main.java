import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {

    public static void main(String[] args) {
//        MongoClientURI uriMongo = new MongoClientURI("mongodb+srv://starktk:raulsurf@ghanddb.mm0u0gz.mongodb.net/?retryWrites=true&w=majority");

        MongoClient mongoClient =  MongoClients.create("mongodb://atlas-sql-64caeaadcf2a4c4c2ba35814-v4olq.a.query.mongodb.net/Carro?ssl=true&authSource=admin");

        MongoDatabase mongoDatabase = mongoClient.getDatabase("Car");

        MongoCollection<Document> collection = mongoDatabase.getCollection("Ford");

        Document document = new Document()
                .append("modelo", "Fiesta")
                .append("year", "2010")
                .append("value", "10.000");
        collection.insertOne(document);

        System.out.println(collection.find());
    }
}
