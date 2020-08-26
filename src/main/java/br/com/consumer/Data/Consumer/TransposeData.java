package br.com.consumer.Data.Consumer;

import br.com.consumer.Data.entities.Data;
import br.com.consumer.Data.entities.PojoData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.json.JSONObject;

public class TransposeData {

    public static void main(String[] args) {

        Gson gson=new GsonBuilder().create();
        PojoData pojo = gson.fromJson(new GenerateJSON().geraJSON(), PojoData.class);
        System.out.println("ok");

    }
}
