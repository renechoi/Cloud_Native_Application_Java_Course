package kosta.basic.day024.author;

import java.util.Objects;

public class AuthorVo{
    int author_id;
    String author_name;
    String author_description;

    public AuthorVo(int author_id, String author_name, String author_description) {
        this.author_id = author_id;
        this.author_name = author_name;
        this.author_description = author_description;
    }

    public AuthorVo(String author_name, String author_description) {
        this.author_name = author_name;
        this.author_description = author_description;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getAuthor_description() {
        return author_description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorVo authorVo = (AuthorVo) o;
        return author_id == authorVo.author_id && Objects.equals(author_name, authorVo.author_name) && Objects.equals(author_description, authorVo.author_description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author_id, author_name, author_description);
    }

}
