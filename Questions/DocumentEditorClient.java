package com.learn.designPattern.Questions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Document Editor which should be scalable Interface: DocumentElement and
 * Persistence Class: Document to hold document Element
 */
public class DocumentEditorClient {
	public static void main(String[] args) {
		Document document = new Document();
		Persistence persistence = new FileStorage();

		DocumentEditor editor = new DocumentEditor(document, persistence);

		// Simulate a client using the editor with common text formatting features.
		editor.addText("Hello, world!");
		editor.addNewLine();
		editor.addText("This is a real-world document editor example.");
		editor.addNewLine();
		editor.addTabSpace();
		editor.addText("Indented text after a tab space.");
		editor.addNewLine();
		editor.addImage("picture.jpg");

		// Render and display the final document.
		System.out.println(editor.renderDocument());

		editor.saveDocument();
	}
}

interface DocumentElement {
	abstract String render();
}

interface Persistence {
	void save(String data);
}

class TextElement implements DocumentElement {
	private String text;

	public TextElement(String text) {
		this.text = text;
	}

	@Override
	public String render() {
		return text;
	}

}

class ImageElement implements DocumentElement {
	private String imagePath;

	public ImageElement(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String render() {
		return "[Image: " + imagePath + "]";
	}
}

//NewLineElement represents a line break in the document.
class NewLineElement implements DocumentElement {
	@Override
	public String render() {
		return "\n";
	}
}

//TabSpaceElement represents a tab space in the document.
class TabSpaceElement implements DocumentElement {
	@Override
	public String render() {
		return "\t";
	}
}

//FileStorage implementation of Persistence
class FileStorage implements Persistence {
	@Override
	public void save(String data) {
		try {
			FileWriter outFile = new FileWriter("document.txt");
			outFile.write(data);
			outFile.close();
			System.out.println("Document saved to document.txt");
		} catch (IOException e) {
			System.out.println("Error: Unable to open file for writing.");
		}
	}
}

//Placeholder DBStorage implementation
class DBStorage implements Persistence {
	@Override
	public void save(String data) {
		// Save to DB
	}
}

//Document class responsible for holding a collection of elements
class Document {
	private List<DocumentElement> documentElements = new ArrayList<>();

	public void addElement(DocumentElement element) {
		documentElements.add(element);
	}

	public List<DocumentElement> getElements(){
		return documentElements;
	}
}

class DocumentRenderer {
	private Document document;
    public DocumentRenderer(Document document) {
        this.document = document;
    }

	// Renders the document by concatenating the render output of all elements.
	public String render() {
		StringBuilder result = new StringBuilder();
		for (DocumentElement element : document.getElements()) {
			result.append(element.render());
		}
		return result.toString();
	}
}

//DocumentEditor class managing client interactions
class DocumentEditor {
	private Document document;
	private DocumentRenderer docRender;
	private Persistence storage;
	private String renderedDocument = "";

	public DocumentEditor(Document document, Persistence storage) {
		this.document = document;
		this.storage = storage;
		this.docRender = new DocumentRenderer(document);
	}

	public void addText(String text) {
		document.addElement(new TextElement(text));
	}

	public void addImage(String imagePath) {
		document.addElement(new ImageElement(imagePath));
	}

	// Adds a new line to the document.
	public void addNewLine() {
		document.addElement(new NewLineElement());
	}

	// Adds a tab space to the document.
	public void addTabSpace() {
		document.addElement(new TabSpaceElement());
	}

	public String renderDocument() {
		if (renderedDocument.isEmpty()) {
			renderedDocument = docRender.render();
		}
		return renderedDocument;
	}

	public void saveDocument() {
		storage.save(renderDocument());
	}
}
