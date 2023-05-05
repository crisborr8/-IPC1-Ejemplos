from flask import Blueprint, request, jsonify
import random
import string
# Definiminos nuestro Blueprint
endpoint = Blueprint("endpoint", __name__, url_prefix='')
# Definimos los request que utilizaremos
methods = ["DELETE", "GET", "POST", "PUT", "PATCH"]

@endpoint.route("/", methods=methods)
def por_defecto():
    return jsonify({"estado": "Envio correcto :D"}), 200
# Creamos nuestro endpoint que regrese 10 datos con
# nombres y numeros aleatorios
@endpoint.route("/get_lista_aleatoria", methods=methods)
def get_lista_aleatoria():
    if request.method == "GET":
        array_elementos = []
        for _ in range(10): ## for(int i = 0: i < 10; i++)
            elemento_array = {
                "dato": get_nombre_Random(),
                "valor": get_numero_Random() 
            }
            array_elementos.append(elemento_array)
        return jsonify(array_elementos), 200
    else:
        return jsonify({
            "error": "No se ha implementado el request de tipo " + request.method + " en este endpoint. :c"
        }), 404


#Metodos para generar cadenas y valores aleatorios
def get_nombre_Random():
    return ''.join(random.choices(string.ascii_letters, k=5))
def get_numero_Random():
    return random.randint(1000, 9999)