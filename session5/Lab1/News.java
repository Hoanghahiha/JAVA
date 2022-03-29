package session5.Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: "+ Title+" PublishDate: "+PublishDate+" Author: "+Author+" Content"+Content+"Average: "+AverageRate);
    }

    int[] RateList = new int[3];


    public void Caculate(){
        int[] RateList = new int[3];
        RateList[0] = 2;
        RateList[1] = 4;
        RateList[2] = 5;
        int total = 0;
        for (int i = 0; i < 2; i++){
            total = total + RateList[2];
        }
        int AverageRate = total/RateList.length;
        System.out.println("AverageRate: "+ AverageRate);
    }

}
