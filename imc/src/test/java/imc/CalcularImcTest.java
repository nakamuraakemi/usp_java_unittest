package imc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcularImcTest 
{    
    @Test
    public void abaixoDoPeso()
    { 
        String retornoIMC = CalcularImc.FaixaIMC(18.49);
        assertEquals(retornoIMC, "Abaixo do Peso");
    }

    @Test
    public void pesoNormalLimiteInferior()
    { 
        String retornoIMC = CalcularImc.FaixaIMC(18.5);
        assertEquals(retornoIMC, "Peso Normal");      
    }  

    @Test
    public void pesoNormalLimiteSuperior()
    { 
        String retornoIMC = CalcularImc.FaixaIMC(24.9);
        assertEquals(retornoIMC, "Peso Normal");
    }

    @Test
    public void sobrepesoLimiteInferior()
    {  
        String retornoIMC = CalcularImc.FaixaIMC(25);
        assertEquals(retornoIMC, "Sobrepeso");
    }

    @Test
    public void ObesidadeGrauILimiteInferior()
    { 
        String retornoIMC = CalcularImc.FaixaIMC(30);
        assertEquals(retornoIMC, "Obesidade Grau I");
    }

    @Test
    public void ObesidadeGrauILimiteSuperior()
    { 
        String retornoIMC = CalcularImc.FaixaIMC(34.9);
        assertEquals(retornoIMC, "Obesidade Grau I");
    }

    @Test
    public void ObesidadeGrauIILimiteInferior()
    {
        String retornoIMC = CalcularImc.FaixaIMC(35);
        assertEquals(retornoIMC, "Obesidade Grau II");
    }

    @Test
    public void ObesidadeGrauIILimiteSuperior()
    { 
        String retornoIMC = CalcularImc.FaixaIMC(39.9);
        assertEquals(retornoIMC, "Obesidade Grau II");
    }

    @Test
    public void ObesidadeGrauIII()
    {
        String retornoIMC = CalcularImc.FaixaIMC(40);
        assertEquals(retornoIMC, "Obesidade Grau III ou Mórbida");
    }
   
}
