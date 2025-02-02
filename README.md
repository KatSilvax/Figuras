# 📐 Sistemas em Java para Gerenciamento de Formas Geométricas e Cálculo de Áreas 🖥️

Bem-vindo ao repositório do projeto **Sistemas em Java para Gerenciamento de Formas Geométricas e Cálculo de Áreas**!

 🎉 Este projeto foi desenvolvido para demonstrar o uso de **herança** em Java, criando um sistema que gerencia diferentes formas geométricas e calcula suas áreas de forma eficiente. 🚀

## 📋 Descrição do Projeto

Este projeto consiste em um sistema Java que permite:

- **Gerenciar diferentes formas geométricas** 📏🔵🔺
- **Calcular a área de cada forma** 🧮
- **Utilizar herança** para compartilhar comportamentos e atributos comuns entre as classes de formas geométricas. 🧬

### Formas Geométricas Implementadas:
- **Quadrado** ⬛
- **Retângulo** ⬛
- **Triângulo** 🔺

Cada forma geométrica é representada por uma classe específica, que herda de uma classe base chamada `Figura`. Isso permite que o código seja organizado, reutilizável e fácil de expandir para novas formas no futuro. 🌟

## 🛠️ Tecnologias Utilizadas

- **Java** ☕
- **Programação Orientada a Objetos (POO)** 🧩
- **Herança** 🧬
- **Git e GitHub** 🐙 (para versionamento e compartilhamento do código)

## 📂 Estrutura do Projeto

O projeto está organizado da seguinte forma:

```

├── 📁 src
 ├── 📁 aplicacao
│   ├── 📄 Main.java  
    ├── 📁 figura                 
│   ├── 📄 Quadrado.java               
│   ├── 📄 Retangulo.java             
│   ├── 📄 Triangulo.java              
│                     
└── 📄 README.md                      
```

## 🚀 Como Executar o Projeto

1. **Clone o repositório** para o seu ambiente local:
   ```bash
   https://github.com/KatSilvax/Figuras.git
   ```

2. **Navegue até a pasta do projeto**:
   ```bash
   cd SistemaFormasGeometricas
   ```

3. **Compile o código Java**:
   ```bash
   javac src/*.java -d bin
   ```

4. **Execute o programa**:
   ```bash
   java -cp bin Main
   ```

5. **Siga as instruções no terminal** para interagir com o sistema e calcular as áreas das formas geométricas. 🖱️

## 📝 Exemplo de Uso

Ao executar o programa, você verá um menu interativo que permite:

1. **Criar uma nova forma geométrica** (Círculo, Retângulo ou Triângulo).
2. **Calcular a área** da forma criada.
3. **Exibir informações** sobre a forma.

Exemplo de saída:
```
Escolha uma forma geométrica:
1. Círculo
2. Retângulo
3. Triângulo
Digite o número da forma desejada: 1

Informe o raio do círculo: 5
Área do Círculo: 78.54
```

## 📚 Conceitos Aplicados

- **Herança**: A classe `Figura` serve como base para as classes `Retangulo`, `Retangulo` e `Triangulo`.
- **Polimorfismo**: Métodos como `calcularArea()` são sobrescritos nas classes filhas para fornecer comportamentos específicos.
- **Encapsulamento**: Atributos como `tipo`, `base`, `altura`, etc., são privados e acessados por meio de métodos públicos (getters e setters).

## 🤝 Contribuição

Contribuições são bem-vindas! Se você quiser adicionar novas formas geométricas, melhorar o código ou corrigir bugs, siga estas etapas:

1. Faça um **fork** do projeto.
2. Crie uma **branch** para sua feature (`git checkout -b feature/nova-forma`).
3. Faça o **commit** das suas alterações (`git commit -m 'Adicionada nova forma geométrica'`).
4. Faça o **push** para a branch (`git push origin feature/nova-forma`).
5. Abra um **Pull Request**.

## 📄 Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito com ❤️ por Katcilane Silva 🚀  
Espero que este projeto seja útil e inspirador! 🌟  
Se tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato! 📧
