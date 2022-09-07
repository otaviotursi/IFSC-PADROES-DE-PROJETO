package creationals.builder.exercise;

public class BookCollectionItemBuilder implements CollectionItemBuilder{

	private Book book;
	
	@Override
	public CollectionItemBuilder buildItem() {
		this.book = new Book();
		return this;
	}

	@Override
	public CollectionItemBuilder setName(String name) {
		this.book.setName(name);
		return this;
	}

	@Override
	public CollectionItemBuilder setYear(int year) {
		this.book.setYear(year);
		return this;
	}

	@Override
	public CollectionItemBuilder setPublisher(String publisher) {
		this.book.setPublishingCompany(publisher);
		return this;
	}

	@Override
	public CollectionItemBuilder addAuthor(String author) {
		this.book.addAuthor(author);
		return this;
	}

	@Override
	public CollectionItemBuilder addContent(String content) {
		this.book.addChapter(content);
		return this;
	}
	
	public Book getBook() {
		return this.book;
	}

}
