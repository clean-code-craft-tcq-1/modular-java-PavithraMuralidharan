package colorcoder;

enum MinorColor {
	BLUE(0,"Blue"),
    ORANGE(1,"Orange"),
    GREEN(2,"Green"),
    BROWN(3,"Brown"),
    SLATE(4,"Slate");
	
    private int index;
    private String color;
    
    private MinorColor(int index, String color) {
        this.index = index;
        this.color = color;
    }

	public int getIndex() {
		return index;
	}

	public String getColor() {
		return color;
	}
	
	public static MinorColor fromIndex(int index, MinorColor[] values) {
        for(MinorColor color: values) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
    
}
