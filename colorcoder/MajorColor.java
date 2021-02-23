package colorcoder;

enum MajorColor implements Color {
	WHITE(0,"White"), 
	RED(1,"Red"), 
	BLACK(2,"Black"), 
	YELLOW(3,"Yellow"),
	VIOLET(4,"Violet");
	
    private int index;
    private String color;
    
    private MajorColor(int index,String color) {
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