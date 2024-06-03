# Web API de Libro 
Para la creación de una entidad "Libro" que incluya las variables: id, título, autor, editorial y año de publicación, debemos organizar nuestro proyecto en varias capas, cada una en su propia carpeta: services, controllers, repositories y models. 

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/b28224f6-990b-44da-866f-abc846acadcf)

# Creamos la clase libro con los campos, junto con sus getters-setters
* id: Long
* titulo: String
* autor: String
* editorial: String
* año de Publicacion: Integer
  
![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/8be7f55b-2484-4cf3-95f7-d617017d4d15)

# Creación del controllers

Aqui definiremos el get y post

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/bd9ff111-8d1f-47b2-9dbc-f8d475668f6c)

# Creación del repository
"LibroRepository.java": Definimos los metodos, que vamos a utilizar

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/35787600-e2ea-4d35-87bb-a4431aafbf41)

"LibroRepositoryDemo.java" y "LibroRepositoryImpl.java": Definimos la base de datos que contendrá objetos quemados de los libros

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/4978d04d-c6a0-4046-abdf-fc3482fcd25a)

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/d6b56c58-5cc4-4268-a44f-2b2dc844626b)

# Creación del services
Se encargara de llamar a la instancia repository "LibroService.java" y el "LibroServiceImpl.java" sera nuestra interfaz

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/a910f079-4a92-4d46-9735-27f34bad5a00)   

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/fa4496a4-e1ac-483b-b2d1-de572dd07573)

# Ejecución del Web API

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/d8ca829d-acc5-490e-9691-f070cf6b06d9)

# Prueba en postman

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/da9a3ff0-5580-4273-8f8e-811735988f10)

Tambien se puede buscar por el id ejemplo:

![image](https://github.com/Ralonzo99/Libros-Favoritos/assets/147834274/2a371387-0bf4-4ada-aff6-44bc0f7b7172)


