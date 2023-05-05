# Estas importaciones son para crear nuestra API
from flask_cors import CORS
from flask import Flask

# Inicio de nuestra API
def create_app():
    app = Flask(__name__)
    CORS(app)
    #Aplicamos nuestro endpoint
    from .endpoint import endpoint as endpoint
    app.register_blueprint(endpoint)
    return app

# Levantar la API
app = create_app()
if __name__ == '__main__':
    app.run()