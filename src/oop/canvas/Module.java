package oop.canvas;

import java.util.ArrayList;

public class Module {
    public String moduleName;
    public ArrayList<File> files=new ArrayList<>();

    public Module(String moduleName) {
        this.moduleName = moduleName;
    }

    public Module(String moduleName, ArrayList<File> files) {
        this(moduleName);
        this.files = files;
    }
    public void addFile(File file){
       files.add(file);
    }


    public void removeFile(File file) {
        files.removeIf(p -> p.name.equals(file.name) && p.size == file.size);
    }


    public String toString() {
        return "> "+moduleName+
    "> "+ files.toString()
   ;
    }

    /*
    */
}
