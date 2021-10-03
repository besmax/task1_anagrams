package bes.max.task1_anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


class MainTest {

    private Console consoleMock = Mockito.mock(DefaultConsole.class); 
    private Anagram anagramMock = Mockito.mock(Anagram.class); 
    private Main mainForTest = new Main(anagramMock, consoleMock);

    @Test
    void instructionIsPrinted() {
        when(consoleMock.read()).thenReturn("q");
        mainForTest.run();
        
        verify(consoleMock).print("Enter text for reverse or enter 'q' for quit");
    }
    
    
    @Test
    void mainCallsAnagramAndConsoleWithGivenString() {
        
        when(consoleMock.read()).thenReturn("wert1").thenReturn("q");
        when(anagramMock.run("wert1")).thenReturn("trew1");

        mainForTest.run();
        
        verify(anagramMock).run("wert1");
        verify(consoleMock).print("trew1");
    }

}
