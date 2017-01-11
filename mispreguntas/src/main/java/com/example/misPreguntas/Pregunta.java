package com.example.misPreguntas;

public class Pregunta {

    private String Enunciado;
    private String Respuesta1;
    private String Respuesta2;
    private String Respuesta3;
    private String Respuesta4;
    private int idRespostaCorrecta;

    public String getEnunciado() {
        return Enunciado;
    }

    public String getRespuesta1() {
        return Respuesta1;
    }

    public String getRespuesta2() {
        return Respuesta2;
    }

    public String getRespuesta3() {
        return Respuesta3;
    }

    public String getRespuesta4() {
        return Respuesta4;
    }

    public int getIdRespostaCorrecta() {
        return idRespostaCorrecta;
    }

    public void setEnunciado(String enunciado) {
        Enunciado = enunciado;
    }

    public void setRespuesta1(String respuesta1) {
        Respuesta1 = respuesta1;
    }

    public void setRespuesta2(String respuesta2) {
        Respuesta2 = respuesta2;
    }

    public void setRespuesta3(String respuesta3) {
        Respuesta3 = respuesta3;
    }

    public void setRespuesta4(String respuesta4) {
        Respuesta4 = respuesta4;
    }

    public void setIdRespostaCorrecta(int idRespostaCorrecta) {
        this.idRespostaCorrecta = idRespostaCorrecta;
    }

    public Pregunta (String Enunciado, String Respuesta1, String Respuesta2, String Respuesta3, String Respuesta4, int idRespostaCorrecta){

        this.Enunciado = Enunciado;
        this.Respuesta1 = Respuesta1;
        this.Respuesta2 = Respuesta2;
        this.Respuesta3 = Respuesta3;
        this.Respuesta4 = Respuesta4;
        this.idRespostaCorrecta = idRespostaCorrecta;

    }

}
