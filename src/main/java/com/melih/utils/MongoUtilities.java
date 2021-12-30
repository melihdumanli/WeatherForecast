package main.java.com.melih.utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import main.java.com.melih.common.geography.Country;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public enum MongoUtilities {
    getInstance;

    private MongoClient client;
    private MongoDatabase database;
    private PojoCodecProvider codecProvider;
    private CodecRegistry pojoCodecRegistry;
    private MongoCollection<Country> countries;

    private MongoUtilities() {
        initDatabase();
    }

    private void initDatabase() {
        this.client = new MongoClient("localhost", 27017);
        this.database = this.client.getDatabase("mongoDB");
        this.codecProvider = PojoCodecProvider.builder().automatic(true).build();
        this.pojoCodecRegistry = CodecRegistries.fromRegistries(MongoClient.getDefaultCodecRegistry(), CodecRegistries.fromProviders(codecProvider));
        countries = database.withCodecRegistry(pojoCodecRegistry).getCollection("countries", Country.class);
    }

    public MongoCollection<Country> getcurrentWeatherMongoCollection() {
        if (this.database == null)
            this.initDatabase();
        return this.countries;
    }
}
