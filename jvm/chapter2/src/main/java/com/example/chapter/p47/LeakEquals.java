package com.example.chapter.p41.p47;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LeakEquals {

    public static long count = 0;

    public static Map<EqualsRepo, Long> map  = new HashMap<>();
    public static void main(String[] args) {

        while(true){
            if(count % 100 == 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            EqualsRepo repo = new EqualsRepo(1, "Tom");
            map.put(repo, 1L);
        }
    }
}

class EqualsRepo{

    private int id;
    private String name;

    private byte [] bytes = new byte[1024 * 1024];

    public EqualsRepo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EqualsRepo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsRepo)) return false;
        EqualsRepo repo = (EqualsRepo) o;
        return id == repo.id && Objects.equals(name, repo.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name);
        result = 31 * result + Arrays.hashCode(bytes);
        return result;
    }
}
