package no.hvl.dat102.dobbeltkjedetliste;

public class DobbelNode<T> {
	private T element;
	private DobbelNode<T> neste;
	private DobbelNode<T> forrige;

	public DobbelNode() {
		element = null;
		neste = null;
		forrige = null;

	}

	public DobbelNode(T elem) {
		neste = null;
		forrige = null;
		element = elem;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public DobbelNode<T> getNeste() {
		return neste;
	}

	public void setNeste(DobbelNode<T> neste) {
		this.neste = neste;
	}

	public DobbelNode<T> getForrige() {
		return forrige;
	}

	public void setForrige(DobbelNode<T> forrige) {
		this.forrige = forrige;
	}

}
