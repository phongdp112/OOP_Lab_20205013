package hust.soict.hedspi.aims.media;


public abstract class Media {
    // Fields
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor
    public Media() {
    	
    }
    
    public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
    

	public Media(String title, float cost) {
		super();
		this.title = title;
		this.cost = cost;
	}

	public Media(int id, String title) {
 		super();
 		this.id = id;
 		this.title = title;
 	}


    public Media(int id, String title, String category) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
	}


	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}


	// Getters and Setters
    public int getId() {
        return id;
    }

 
	public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        // Kiểm tra nếu đối tượng truyền vào là null hoặc không phải là đối tượng của lớp Media
        if (this == o) return true;  // Nếu là cùng đối tượng thì trả về true
        if (o == null || getClass() != o.getClass()) return false;

        Media media = (Media) o;  // Ép kiểu Object sang Media
        return title != null ? title.equals(media.title) : media.title == null;  // So sánh title
    }
}
