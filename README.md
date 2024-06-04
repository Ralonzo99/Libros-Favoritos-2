# Web-API-de-Libro
Basado en la tarea anterior se debe de hacer una modificación a los API, lo primero seria crear una nueva carpeta "utils" para crear las clases que necesitaremos para los mensajes de error y del estado.

![image](https://github.com/Ralonzo99/Libros-Favoritos-2/assets/147834274/540915a6-556c-4cac-b792-2cb82a359644)

Ahora vamos con la modificación del codigo para lograr lo que se pide en la parte del controlador.

![image](https://github.com/Ralonzo99/Libros-Favoritos-2/assets/147834274/dffb9c99-f76a-4636-853e-37473bc72d28)

1. Si no existe un libro, se debe de lanzar una clase LibroException (GET /libros/{id_libro}). El estado que se debe enviar es un NOT_FOUND con un mensaje personalizado

   * LibroException

    ![image](https://github.com/Ralonzo99/Libros-Favoritos-2/assets/147834274/2c516ad2-a433-4943-9647-61d2e7f37d64) 
  
   * ExceptionResponse
  
   ![image](https://github.com/Ralonzo99/Libros-Favoritos-2/assets/147834274/900d8d31-bb49-46fa-a174-cd9b2cc466a8)
   
   * RestResponseEntityExceptionHandler
  
   ![image](https://github.com/Ralonzo99/Libros-Favoritos-2/assets/147834274/351170a7-892f-40c3-a93b-f21819286ab6)

    # Ejecución
     
   LIBRO NO ENCONTRADO
  
   ![image](https://github.com/Ralonzo99/Libros-Favoritos-2/assets/147834274/3815e491-df7a-43e9-9287-6a57c0cfb508)

   Creación de un libro, debe de enviar el estado CREATED

   ![Imagen de WhatsApp 2024-06-03 a las 13 11 14_de73c2b0](https://github.com/Ralonzo99/Libros-Favoritos-2/assets/147834274/70228d8b-6933-4e9d-a40a-84e9b75760ca)




