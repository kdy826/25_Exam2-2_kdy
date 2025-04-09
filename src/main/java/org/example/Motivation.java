package org.example;
import org.example.App;
class Motivation {   //id , content, author 저장
    private int id;
    private String content;
    private String author;

    Motivation(int id, String title, String author) { // 생성자에 id, content, author 불러와서 활성화
        this.id = id;
        this.content = content;
        this.author = author;

    }

    public String getContent() { // 게터 세터 작업
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override   //제너레이트로 투스트링 불러와서 작성
    public String toString() {
        return "Motivation{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}