**Triangle_Compiler**
-----------------

## Integrantes

+ ### Angelica Diaz Barrios - 2021044256  
+ ### Katerine Guzman Flores - 2019390523  
+ ### Rafael Vargas Bello - 2021123304  
+ ### Joseph David Santamaria Castro - 2021044250  
+ ### David Brenes Martínez - 2017093927
<br>

- - -

# Comandos para compilar el proyecto

### Cambia al directorio raíz del proyecto
```
cd C:\GitHub\Triangle_Compiler
```

### Encuentra archivos .java en los directorios específicos excluyendo cualquier archivo en Triangle_Compiler\Tri
```
Get-ChildItem -Recurse -Filter *.java | Where-Object {
    ($_.FullName -notmatch "\\Tri\\") -and (
        $_.FullName -match "Triangle\\[^\\]+\.java$" -or
        $_.FullName -match "Triangle\\AbstractSyntaxTrees\\[^\\]+\.java$" -or
        $_.FullName -match "Triangle\\CodeGenerator\\[^\\]+\.java$" -or
        $_.FullName -match "Triangle\\ContextualAnalyzer\\[^\\]+\.java$" -or
        $_.FullName -match "Triangle\\SyntacticAnalyzer\\[^\\]+\.java$" -or
        $_.FullName -match "Triangle\\TreeDrawer\\[^\\]+\.java$" -or
        $_.FullName -match "TAM\\[^\\]+\.java$"
    )
} | ForEach-Object { $_.FullName } > sources.txt
```

### Lee el contenido de sources.txt y compílalo en el directorio de salida "out"
```
$javaFiles = Get-Content sources.txt
```

 ### Pasa los archivos a javac como argumentos individuales
```
javac -d out $javaFiles
```

 ### Compila caso de prueba
```
java -cp out Triangle.Compiler C:\GitHub\Triangle_Compiler\Tri\case.tri
```

### Corre el código de Triangle compilado a .TAM
```
java -cp out TAM.Interpreter obj.tam
```