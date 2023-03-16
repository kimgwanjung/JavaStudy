package kr.ac.kopo.Exam.Java0316_01;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;
    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(publishDate, other.publishDate) && Objects.equals(title, other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDate, title);
    }

    @Override
    public int compareTo(Book o) {       
        return this.publishDate.compareTo(o.getPublishDate());
    }
    
    @Override
    public Book clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stubs
        return (Book) super.clone();
    }
    
    @Override
    public String toString() {
        return "Book [title=" + title + ", publishDate=" + publishDate + ", comment=" + comment
                + "]";
    }

}

