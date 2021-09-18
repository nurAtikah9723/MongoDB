package tutorials.mongodb;

import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class readFromMongoDB {
    public static void main(String[] args) {

        final String urlString = /** connection string from mongoDB atlas **/;
        MongoClient client = MongoClients.create("urlString");
        MongoDatabase db = client.getDatabase("/** database name **/");
        MongoCollection collect = db.getCollection("/** collection name **/");

        /**Find all document from a collection**/
//        FindIterable<Document> allDocs = collect.find();
//        allDocs.forEach(d -> System.out.println(d.toJson()));

        /**Find specific document (specify equality condition on a field that is a nested document)**/
//        FindIterable<Document> onlyOneDoc = collect.find(eq("address.state", "Johor"));
//        onlyOneDoc.forEach(d -> System.out.println(d.toJson()));

        client.close();
    }
}
