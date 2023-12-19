# из модуля flask импортирую обект Flask
from flask import Flask


# создаем экземпляр
app = Flask(__name__)


@app.route("/") # декоратор
# если этот сайт вызовет приставку /, тогда будет запущенна функция ниже
def index():
    return "<h1>Не сдавайся</h1>"


@app.route("/info")
def info():
    return "<h1>GEEKBRAINS</h1>"

# проверяет запуск, не допускает вызов из вне. 
# Нужна обязательно
if __name__ == '__main__':
    app.run()