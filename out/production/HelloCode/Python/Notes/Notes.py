import json
import datetime

class Note:
    def __init__(self, note_id, title, body):
        self.note_id = note_id
        self.title = title
        self.body = body
        self.created_at = datetime.datetime.now()
        self.updated_at = datetime.datetime.now()

class NotesApp:
    def __init__(self, filepath):
        self.filepath = filepath
        self.notes = {}
        self.load_notes()

    def add_note(self, note_id, title, body):
        new_note = Note(note_id, title, body)
        self.notes[note_id] = new_note
        self.save_notes()

    def edit_note(self, note_id, new_title, new_body):
        if note_id in self.notes:
            self.notes[note_id].title = new_title
            self.notes[note_id].body = new_body
            self.notes[note_id].update_at = datetime.datetime.now()
            self.save_notes()

    def delete_note(self, note_id):
        if note_id in self.note:
            del self.notes[note_id]
            self.save_notes()

    def save_notes(self):
        with open(self.filepath, "w") as file:
            json.dump({note_id: vars(note) for note_id, note in self.notes.items()}, file, default=str)

    def load_notes(self):
        try:
            with open(self.filepath, "r") as file:
                notes_data = json.load(file)
                self.notes = {int(note_id): Note(int(note_id), note_data["title"], notes_data["body"])
                              for note_id, note_data in notes_data.items()}
        except FileNotFoundError:
            pass

    def print_notes(self):
        for note_id, note in self.notes.items():
            print(f"{note_id}: {note.title} - {note.created_at}\n")

    def get_note_by_id(self, note_id):
        if note_id in self.notes:
            note = self.notes[note_id]
            print(f"{note_id}: {note.title} Created: {note.created_at} Updated: {note.updated_at}\n")


notes_app = NotesApp("notes.json")
notes_app.add_note(1, "Первая запись", "Привет")
notes_app.add_note(2, "Вторая запись", "Как дела?")
notes_app.print_notes()
notes_app.get_note_by_id(1)
notes_app.edit_note(1, "Обнавляем запись", "Сколько время")
notes_app.delete_note(2)
notes_app.print_notes()

    
