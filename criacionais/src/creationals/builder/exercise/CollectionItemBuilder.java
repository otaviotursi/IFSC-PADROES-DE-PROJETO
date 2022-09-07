package creationals.builder.exercise;

public interface CollectionItemBuilder {
	
	public CollectionItemBuilder buildItem();
	public CollectionItemBuilder setName(String name);
	public CollectionItemBuilder setYear(int year);
	public CollectionItemBuilder setPublisher(String publisher);
	public CollectionItemBuilder addAuthor(String author);
	public CollectionItemBuilder addContent(String content);
}
