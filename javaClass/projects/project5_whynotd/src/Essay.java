
public class Essay extends GradedActivity {
	private final double GRAMMAR_WEIGHT = .3;
	private final double SPELLING_WEIGHT = .2;
	private final double LENGTH_WEIGHT = .2;
	private final double CONTENT_WEIGHT = .3;

	private double grammar;
	private double spelling;
	private double length;
	private double content;
	public GradedActivity() {
		grammar = 0;
		spelling = 0;
		length = 0;
		content = 0;
	}
	public GradedActivity(double g, double s, double l, double c) {
		grammar = g;
		spelling = s;
		length = l;
		content = c;
		this.updateScore();
	}
	public double getGrammar() {
		return grammar;
	}
	public double getSpelling() {
		return spelling;
	}
	public double getLength() {
		return length;
	}
	public double getContent() {
		return content;
	}
	public void setGrammar(double g) {
		grammar = g;
		this.updateScore();
	}
	public void setSpelling(double s) {
		spelling = s;
		this.updateScore();
	}
	public void setLength(double l) {
		length = l;
		this.updateScore();
	}
	public void setContent(double c) {
		content = c;
		this.updateScore();
	}
	public void updateScore() {
		this.setScore(grammar * GRAMMAR_WEIGHT + spelling * SPELLING_WEIGHT + length * LENGTH_WEIGHT + content * CONTENT_WEIGHT);
	}
}
