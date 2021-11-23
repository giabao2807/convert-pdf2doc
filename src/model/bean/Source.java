package model.bean;

public class Source {
	private String filename;
	private byte[] pdf_text;
	private byte[] document_text;
	private String username;
	
	public Source(String filename, String username) {
		super();
		this.filename = filename;
		this.username = username;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public byte[] getPdf_text() {
		return pdf_text;
	}
	public void setPdf_text(byte[] pdf_text) {
		this.pdf_text = pdf_text;
	}
	public byte[] getDocument_text() {
		return document_text;
	}
	public void setDocument_text(byte[] document_text) {
		this.document_text = document_text;
	}
	
	
}
