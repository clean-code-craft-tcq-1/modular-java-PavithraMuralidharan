package colorcoder;

public class TestColorCoder {
	public static void main(String[] args) {
		ColorPairTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		ColorPairTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
		ColorPairTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		ColorPairTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
