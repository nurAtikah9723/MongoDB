package tutorials.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import com.mongodb.client.*;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class updateToMongoDB {
    public static void main(String[] args) {

        final String urlString = /** connection string from mongoDB atlas **/;
        MongoClient client = MongoClients.create("urlString");
        MongoDatabase db = client.getDatabase("/** database name **/");
        MongoCollection collect = db.getCollection("/** collection name **/");

        /** Update document **/
        collect.updateOne(Filters.eq("name", "Ali Imran"),
                Updates.set("age", 23));

        /** Update document by ID **/
//        collect.updateOne(Filters.eq("id", 101), Updates.set("name", "Ng Jing Yao"));

        /** Update nested document **/
//        collect.updateOne(Filters.eq("name", "Ng Jing Ting"),
//                Updates.set("address.state", "Kuala Lumpur"));

        /** Update many document **/
//        collect.updateMany(Filters.eq("age", 21),
//                Updates.set("personality", "hardworking"));


        /** To display the collection document **/
        FindIterable<Document> allDocs = collect.find();
        allDocs.forEach(d -> System.out.println(d.toJson()));

        client.close();
    }
}
