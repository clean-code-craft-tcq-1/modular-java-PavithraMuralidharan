package colorcoder;

enum MinorColor implements Color {
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

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public String getColor() {
		return color;
	}
    
}
