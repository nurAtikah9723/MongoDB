package tutorials.mongodb;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.and;

public class deleteToMongoDB {
    public static void main(String[] args) {

        final String urlString = /** connection string from mongoDB atlas **/;
        MongoClient client = MongoClients.create("urlString");
        MongoDatabase db = client.getDatabase("/** database name **/");
        MongoCollection collect = db.getCollection("/** collection name **/");

        /** Delete one document **/
//        collect.deleteOne(Filters.eq("age", 23));

        /** Delete many document **/
        collect.deleteMany(eq("age", 21));

        /** To display the collection document **/
        FindIterable<Document> allDocs = collect.find();
        allDocs.forEach(d -> System.out.println(d.toJson()));

    }
}
