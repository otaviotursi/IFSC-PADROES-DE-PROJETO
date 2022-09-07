package creationals.builder.exercise;

public class AlbumCollectionItemBuilder implements CollectionItemBuilder{

	private Album album;
	
	@Override
	public CollectionItemBuilder buildItem() {
		this.album = new Album();
		return this;
	}

	@Override
	public CollectionItemBuilder setName(String name) {
		this.album.setName(name);
		return this;
	}

	@Override
	public CollectionItemBuilder setYear(int year) {
		this.album.setYear(year);
		return this;
	}

	@Override
	public CollectionItemBuilder setPublisher(String publisher) {
		this.album.setRecordCompany(publisher);
		return this;
	}

	@Override
	public CollectionItemBuilder addAuthor(String author) {
		this.album.addAuthor(author);
		return this;
	}

	@Override
	public CollectionItemBuilder addContent(String content) {
		this.album.addAlbum(content);
		return this;
	}

	public Album getAlbum() {
		
		return this.album;
	}
	
}
