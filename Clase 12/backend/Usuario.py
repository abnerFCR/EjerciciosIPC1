class Usuario:
    def __init__(self, nombre, telefono, direccion):
        self.nombre = nombre
        self.telefono = telefono
        self.direccion = direccion

    def getNombre(self):
        return self.nombre

    def getTelefono(self):
        return self.telefono

    def getDireccion(self):
        return self.direccion

    def setNombre(self, nombre):
        self.nombre= nombre

    def setTelefono(self, telefono):
        self.telefono= telefono
    
    def setDireccion(self, direccion):
        self.direccion= direccion

