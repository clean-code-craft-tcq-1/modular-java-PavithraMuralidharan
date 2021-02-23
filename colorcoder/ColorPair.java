package colorcoder;

public class ColorPair {
	private MajorColor majorColor;
	private MinorColor minorColor;

	public ColorPair(MajorColor major, MinorColor minor) {
		majorColor = major;
		minorColor = minor;
	}

	public MajorColor getMajor() {
		return majorColor;
	}

	public MinorColor getMinor() {
		return minorColor;
	}
	
	@Override
	public String toString() {
		return MajorColor.values()[majorColor.getIndex()].getColor() + " "
				+ MinorColor.values()[minorColor.getIndex()].getColor();
	}

}
