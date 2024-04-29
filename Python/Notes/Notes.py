import json
import datetime

class Note:
    def __init__(self, note_id, title, body):
        self.note_id = note_id
        self.title = title
        self.body = body
        self.created_at = datetime.datetime.now()
        # self.updated_at = datetime.datetime.now()

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
            self.notes[note_id].created_at = datetime.datetime.now()
            self.save_notes()

    def delete_note(self, note_id):
        if note_id in self.notes:
            del self.notes[note_id]
            self.save_notes()

    def save_notes(self):
        with open(self.filepath, "w") as file:
            json.dump({note_id: vars(note) for note_id, note in self.notes.items()}, file, default=str, indent=4)

    def load_notes(self):
        try:
            with open(self.filepath, "r") as file:
                notes_data = json.load(file)
                self.notes = {int(note_id): Note(int(note_id), note_data["title"], note_data["body"])
                              for note_id, note_data in notes_data.items()}
        except FileNotFoundError:
            pass

    def print_notes(self):
        for note_id, note in self.notes.items():
            print(f"{note_id}: {note.title} - {note.body} - {note.created_at}\n")

    def get_note_by_id(self, note_id):
        if note_id in self.notes:
            note = self.notes[note_id]
            print(f"{note_id}: {note.title} Updated: {note.created_at}\n")


notes_app = NotesApp("notes.json")
notes_app.add_note(1, "First entry ", "Hi")
notes_app.add_note(2, "Second entry ", "How are you?")
notes_app.add_note(3, "Third entry ", "Good, thanks")
notes_app.print_notes()
print("++++++++++++++++++++++++++\n")
notes_app.get_note_by_id(1)
notes_app.edit_note(1, "Update entry", "I need help learn")
notes_app.delete_note(2)
print("++++++++++++++++++++++++++\n")
notes_app.print_notes()

    
