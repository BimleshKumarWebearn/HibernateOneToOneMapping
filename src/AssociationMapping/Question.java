package AssociationMapping;

import javax.persistence.*;

@Entity
public class Question {
	@Id
	@Column(name="questionId")
private int questionId;
	@Column(name="question")
private String question;
@OneToOne
private Answer answer;
public Question() {
	//super();

}
public Question(int questionId, String question, Answer answer) {
	//super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}

public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Answer getAnswer() {
	return answer;
}
public void setAnswer(Answer answer) {
	this.answer = answer;
}
}
