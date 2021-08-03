package colorcoder;

public class ColorWiring {
	
	static final int NUMBEROFMINORCOLORS = MinorColor.values().length;
	
	ColorWiring()
	{
		
	}

	static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor =  MajorColor.fromIndex(zeroBasedPairNumber / NUMBEROFMINORCOLORS , MajorColor.values());
		MinorColor minorColor =  MinorColor.fromIndex(zeroBasedPairNumber % NUMBEROFMINORCOLORS , MinorColor.values());
		return new ColorPair(majorColor, minorColor);
	}

	static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * NUMBEROFMINORCOLORS + minor.getIndex() + 1;
	}
}
