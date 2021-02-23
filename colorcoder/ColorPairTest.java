package colorcoder;

public class ColorPairTest 
{
	static final int numberOfMinorColors = MinorColor.values().length;

	static ColorPair GetColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = (MajorColor) ColorCode.fromIndex(zeroBasedPairNumber / numberOfMinorColors , MajorColor.values());
		MinorColor minorColor = (MinorColor) ColorCode.fromIndex(zeroBasedPairNumber % numberOfMinorColors , MinorColor.values());
		return new ColorPair(majorColor, minorColor);
	}

	static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
	}

	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = GetColorFromPairNumber(pairNumber);
		System.out.println("Got pair number " + colorPair);
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = GetPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}
}
