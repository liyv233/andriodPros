package com.example.hellow;

public class New {
        private String title;
        private String author;
        private String content;
        private int imageId;

        public New(String title, String author, String content, int imageId) {
            this.title = title;
            this.author = author;
            this.content = content;
            this.imageId = imageId;
        }
    public New() {

    }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }


        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }


        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }


        public int getImageId() {
            return imageId;
        }

        public void setImageId(int imageId) {
            this.imageId = imageId;
        }


}
