package colorcoder;

public class ColorPairTest 
{
	ColorPairTest(){}
	
	static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
		ColorPair colorPair = ColorWiring.getColorFromPairNumber(pairNumber);
		System.out.println("Got pair number " + colorPair);
		assert (colorPair.getMajor() == expectedMajor);
		assert (colorPair.getMinor() == expectedMinor);
	}

	static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
		int pairNumber = ColorWiring.getPairNumberFromColor(major, minor);
		System.out.println("Got pair number " + pairNumber);
		assert (pairNumber == expectedPairNumber);
	}
}
