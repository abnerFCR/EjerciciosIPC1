from flask import Flask, request, jsonify
from flask_cors import CORS 
from Usuario import Usuario
import json

app = Flask(__name__)

Usuarios = []

CORS(app)

@app.route("/", methods=['GET'])
def hello():
    nuevo = {
        "nombre":"Abner Fernando",
        "edad":24,
        "correo": "correo@gmail.com"
    }
    return (nuevo)

@app.route("/obtenerUsuarios", methods=['GET'])
def obtenerUsuarios():
    global Usuarios
    envios = []
    for usuario in Usuarios:
        unEnvio = {
            "nombre":usuario.getNombre(),
            "telefono":usuario.getTelefono(),
            "direccion":usuario.getDireccion()
        }
        envios.append(unEnvio)
    retorno = jsonify(envios) 
    return (retorno)


@app.route("/obtenerUnUsuario", methods=['GET'])
def obtenerUnUsuario():
    global Usuarios
    for usuario in Usuarios:
        if (usuario.getNombre() == request.json['nombre'])  and (usuario.getTelefono() == request.json['telefono']):
            unEnvio = {
                "nombre":usuario.getNombre(),
                "telefono":usuario.getTelefono(),
                "direccion":usuario.getDireccion()
            }
            retorno = jsonify(unEnvio) 
            return (retorno)
        
    noSeEncontro = jsonify({"error":True, "mensaje":"No se pudo encontrar una coincidencia"})
    return (noSeEncontro)

@app.route("/insertarUsuario", methods = ['POST'])
def insertarUsuario():
    global Usuarios
    nuevoUsuario = Usuario(request.json['nombre'], int(request.json['telefono']), request.json['direccion'])
    Usuarios.append(nuevoUsuario)
    respuesta = jsonify({"error":False,"mensaje":"Todo salio bien"})
    return (respuesta)

@app.route("/eliminarUsuario", methods =['DELETE'])
def eliminarUsuario():
    global Usuarios
    for i in range(len(Usuarios)):
        if (Usuarios[i].getNombre() == request.json['nombre'])  and (Usuarios[i].getTelefono() == request.json['telefono']):
            del Usuarios[i]
            unEnvio = {
                "error":False,
                "mensaje":"Se elimino el usuario correctamente"
            }
            retorno = jsonify(unEnvio) 
            return (retorno)
        
    noSeEncontro = jsonify({"error":True, "mensaje":"No se pudo encontrar una coincidencia"})
    return (noSeEncontro)

@app.route("/actualizarUsuario", methods=['PUT'])
def actualizarUsuario():
    global Usuarios
    for usuario in Usuarios:
        if (usuario.getNombre() == request.json['nombre'])  and (usuario.getTelefono() == request.json['telefono']):
            
            usuario.setNombre(request.json['nombreNuevo'])
            usuario.setTelefono(request.json['telefonoNuevo'])
            usuario.setDireccion(request.json['direccionNueva'])

            unEnvio = {
                "error":False,
                "mensaje":"Se actualizo correctamente el usuario"
            }
            retorno = jsonify(unEnvio) 
            return (retorno)
        
    noSeEncontro = jsonify({"error":True, "mensaje":"No se pudo encontrar una coincidencia para actualizar"})
    return (noSeEncontro)

if __name__ =="__main__":
    app.run(host="0.0.0.0", port=3000, debug=True)
