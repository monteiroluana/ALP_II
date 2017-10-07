package ADO_II;

/**
 *
 * @author Monteiro
 */
public class Pessoa {

    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

//    public String getNome() {
//        String name = this.nome;
//        return name;
//    }
//    public int getIdade() {
//        int age = this.idade;
//        return age;
//    }
//    public float getPeso() {
//        float weight = this.peso;
//        return weight;
//    }
//    public float getAltura() {
//        float height = this.altura;
//        return height;
//    }
    public float calcIMC(float peso, float altura) {
        float imc = peso / (altura * altura);
        return imc;
    }

    public void categoriaIMC(float imc) {
        if (imc < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else if (imc >= 40) {
            System.out.println("Obesidade grau III");
        }
    }

}
