package colorcoder;

enum MajorColor {
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

	public int getIndex() {
		return index;
	}

	public String getColor() {
		return color;
	}
	
	 public static MajorColor fromIndex(int index, MajorColor[] values) {
	        for(MajorColor color: values) {
	            if(color.getIndex() == index) {
	                return color;
	            }
	        }
	        return null;
	    }
}