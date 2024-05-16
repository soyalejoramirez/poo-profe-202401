package com.alejandro.antivirus.app;

import com.alejandro.antivirus.dominio.Antivirus;
import com.alejandro.antivirus.dominio.Documento;
import com.alejandro.antivirus.dominio.DocumentoPDF;
import com.alejandro.antivirus.dominio.DocumentoWord;
import com.alejandro.antivirus.dominio.Video;
import com.alejandro.antivirus.dominio.Viruseable;

import java.util.Arrays;
import java.util.List;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus avast = new Antivirus();

        DocumentoWord word1 = new DocumentoWord("hojadevida.docx");
        DocumentoWord word2 = new DocumentoWord("hojadevida☠️.docx");
        DocumentoPDF pdf1 = new DocumentoPDF("hojadevida.pdf");
        Video video = new Video("miprimeracomunion.mp4", 320);

        List<Viruseable> elementos = Arrays.asList(word1, word2, pdf1, video);
        avast.escanear(elementos);
    }
}
