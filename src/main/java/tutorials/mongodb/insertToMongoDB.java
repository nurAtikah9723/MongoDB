package tutorials.mongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;
import java.util.List;

public class insertToMongoDB {
    public static void main(String[] args) {

        /** Connection with mongoDB Atlas **/
        final String urlString = /** connection string from mongoDB atlas **/;
        MongoClient client = MongoClients.create("urlString");
        MongoDatabase db = client.getDatabase("/** database name **/");
        MongoCollection collect = db.getCollection("/** collection name **/");

         /** Put one document to database **/
        /* Document insertOne = new Document()
                .append("name", "Intan Syazana")
                .append("age", 21)
                .append("personality", "Friendly")
                .append("education", Arrays.asList("UPSR","PMR"))
                .append("address", new Document("state", "Johor").append("postcode", 81500));
        collect.insertOne(insertOne); */

        /** Put multiple document to database **/
        /* List<Document> nameList = Arrays.asList(
                new Document().append("name", "Ali Imran").append("age", 22).append("personality", Arrays.asList("Precise", "Clumsy"))
                              .append("education", Arrays.asList("UPSR"))
                              .append("address", new Document("state", "Penang")),

                new Document().append("name", "Ng Jing Ting").append("age", 24)
                              .append("education", Arrays.asList("UPSR","PMR", "SPM", "COLLEAGUE"))
                              .append("address", new Document("postcode", 40170)),

                new Document().append("name", "Ramendra").append("age", 21).append("personality", "Charming")
                        .append("education", Arrays.asList("UPSR","PMR", "SPM", "COLLEAGUE", "DEGREE"))
                        .append("address", new Document("state", "Sabah").append("postcode", 88000))
        );
        collect.insertMany(nameList); */


        client.close();

    }
}
