package sba.sms.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "student_courses")

public class StudentCourse {
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    // ===================== OneToMany for Student to studentCourses =============

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    @ToString.Exclude
    private Student student;

    @Column(name = "student_id", updatable = false, insertable = false)
    private Integer studentId;

    // ===================== OneToMany for Student to studentCourses =============

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course_id", nullable = false)
    @ToString.Exclude
    private Course course;

    @Column (name = "course_id", updatable = false, insertable = false)
    private Integer courseId;

    public StudentCourse(Integer studentId, Integer courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }
}
