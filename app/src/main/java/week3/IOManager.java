package week3;

//these methods are very very similar to the ones in Professor Griffith's Skill Drill 2 Walkthrough
//I'm not plagiarizing. I just don't know how else to do it.

import com.google.common.collect.Lists;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class IOManager {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public List<Course> readData(String file_name) {
        String json = "";
        try {
            json = Files.readString(Paths.get(file_name));
        }
        catch (IOException e) {e.printStackTrace();}

        if (json.isBlank()) {
            return Lists.newArrayList();
        } else {
            Type listType = new TypeToken<ArrayList<Course>>() {}.getType();
            return gson.fromJson(json, listType);
        }
    }


    public void writeData(String file, Course course) {
        String json = gson.toJson(course);
        try { Files.writeString(Paths.get(file), json);}
        catch (IOException e) {e.printStackTrace();}
    }
}
