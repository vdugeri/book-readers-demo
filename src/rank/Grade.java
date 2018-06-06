/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rank;

import java.util.Objects;

/**
 *
 * @author Verem
 */
public class Grade implements Comparable<Grade> {

    private String letterGrade;
    private int codePoint;

    public Grade(String letterGrade, int codePoint) {
        this.letterGrade = letterGrade;
        this.codePoint = codePoint;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public int getCodePoint() {
        return codePoint;
    }

    public void setCodePoint(int codePoint) {
        this.codePoint = codePoint;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.letterGrade);
        hash = 97 * hash + this.codePoint;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Grade)) {
            return false;
        }

        final Grade other = (Grade) o;

        if (this.codePoint != other.codePoint) {
            return false;
        }
        return Objects.equals(this.letterGrade, other.letterGrade);
    }

    @Override
    public String toString() {
        return "Grade{" + "letterGrade=" + letterGrade + ", codePoint=" + codePoint + '}';
    }


    @Override
    public int compareTo(Grade o) {
        return o.codePoint - this.codePoint;
    }


}
