/* 
Hecho por Jose Manuel Moron Jurado
*/
public class ejercicio12  {
  public static void main(String[] args) {
    System.out.println("A continuación tendrás una serie de 10 preguntas sobre asignaturas que estás dando este año");
    System.out.println("1.- ¿Qué lenguaje estamos aprendiendo en programación?");
    System.out.println("A-JAVA");
    System.out.println("B-JavaScript");
    System.out.println("C-C++");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    
    int puntos = 0;
    String respuesta =System.console().readLine();
    respuesta = System.console().readLine();
    if (respuesta.equals("A")){
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("2.- ¿Qué lenguaje  estamos aprendiendo en lenguajes de marcas?");
    System.out.println("A-HTML Y CSSS");
    System.out.println("B-JavaScript");
    System.out.println("C-C++");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    
    respuesta = System.console().readLine();
    if (respuesta.equals("A")){ 
      puntos++;
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    respuesta = System.console().readLine();
    System.out.println("3.- ¿Cuánto vale el 10 en binario?");
    System.out.println("A-0010");
    System.out.println("B-0001 0001");
    System.out.println("C-1010");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    
    respuesta = System.console().readLine();
    if (respuesta.equals("C")){
      puntos++;
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("4.- ¿Qué base tiene un número octal?");
    System.out.println("A-2");
    System.out.println("B-8");
    System.out.println("C-16");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("B")){
      puntos++;
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("5.- ¿De que color es el botón del dsipensador de gel hidroalcóholico de la clase?");
    System.out.println("A-Rojo");
    System.out.println("B-Verde");
    System.out.println("C-Amarillo");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    
    respuesta = System.console().readLine();
    if (respuesta.equals("C")){
      puntos++;
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("6.- ¿Qué hay que hacer para aprobar programación?");
    System.out.println("A-Sobornar al profesor");
    System.out.println("B-Programar todos los días");
    System.out.println("C-Es imposible de aprobar");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    
    respuesta = System.console().readLine();
    if (respuesta.equals("B")){
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("7.- ¿Qué memoria es volátil?");
    System.out.println("A-RAM");
    System.out.println("B-ROM");
    System.out.println("C-RON-COLA");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    
    respuesta = System.console().readLine();
    if (respuesta.equals("A")){
      puntos++;
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("8.- ¿Qué día de la semana tenemos 3 horas de programación?");
    System.out.println("A-No lo sé, no me gusta");
    System.out.println("B- Jueves ");
    System.out.println("C- Martes");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    
    respuesta = System.console().readLine();
    if (respuesta.equals("B")){
      puntos++;
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("9.- ¿Qué se estudia en LM(Lenguaje de Marcas)?");
    System.out.println("A-HTML y CSS");
    System.out.println("B-JavaScript");
    System.out.println("C-Todas son correctas");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
    

    respuesta = System.console().readLine();
    if (respuesta.equals("C")){
      puntos++;
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("10.- ¿A que hora es el descanso?");
    System.out.println("A-En la hora de programación, porque no entiendo nada");
    System.out.println("B-A las 11:15");
    System.out.println("C-A las 12:00");
    System.out.println("Escribe tu respuesta en mayúsculas a continuación: ");
  
    respuesta = System.console().readLine();
    if (respuesta.equals("B")){
      puntos++;
      System.out.println("Correcto Tienes 1 punto más");
    }else{ 
      System.out.println("Respuesta Incorrecta");
    }
    
    System.out.println("Tu nota es " + puntos);
  }
}
