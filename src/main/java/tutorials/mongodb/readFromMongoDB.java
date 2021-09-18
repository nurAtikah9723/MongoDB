package tutorials.mongodb;

import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class readFromMongoDB {
    public static void main(String[] args) {

        final String urlString = "mongodb+srv://natikah236:hamzahkamisah85@clusteratikah.voojb.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        MongoClient client = MongoClients.create(urlString);
        MongoDatabase db = client.getDatabase("dbAtikah"); //database name
        MongoCollection collect = db.getCollection("users"); // dbAtikah collection

        /**Find all document from a collection**/
//        FindIterable<Document> allDocs = collect.find();
//        allDocs.forEach(d -> System.out.println(d.toJson()));

        /**Find specific document (specify equality condition on a field that is a nested document)**/
//        FindIterable<Document> onlyOneDoc = collect.find(eq("address.state", "Johor"));
//        onlyOneDoc.forEach(d -> System.out.println(d.toJson()));

        client.close();
    }
}
