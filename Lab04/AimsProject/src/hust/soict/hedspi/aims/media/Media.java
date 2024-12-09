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
}
