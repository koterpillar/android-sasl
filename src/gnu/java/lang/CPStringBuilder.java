package gnu.java.lang;

public class CPStringBuilder {
	private StringBuilder that;
	
	public CPStringBuilder() {
		that = new StringBuilder();
	}
	
	public CPStringBuilder(int i){
		that = new StringBuilder(i);
	}

	public CPStringBuilder(String string) {
		that = new StringBuilder(string);
	}

	public CPStringBuilder append(char c) {
		that.append(c);
		return this;
	}
	
	@Override
	public String toString() {
		return that.toString();
	}

	public CPStringBuilder append(String string) {
		that.append(string);
		return this;
	}

	public CPStringBuilder append(int length) {
		that.append(length);
		return this;
	}

	public CPStringBuilder append(char[] cs) {
		that.append(cs);
		return this;
	}
}
