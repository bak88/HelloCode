package Java.OOP.Lectures.Lectures02.Ex006.Interface;

import Java.OOP.Lectures.Lectures02.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
