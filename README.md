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



- - -

# Codigos de prueba

### Codigo de ejemplo para Repeat (repeat.tri)
```
let
  var i: Integer
in
  begin
    i := 0;

    repeat
      begin
        i := i + 1;
        putint(i)
      end
    until (i > 10)
    end
  end
```

### Codigo de ejemplo para For (for.tri)
```
let
  var i: Integer;
  var a: Integer
in
  begin
    a := 0;
    for i := 1 to 10 do
      a := a + i
  end;
  putint(a);  
end
```

### Codigo de ejemplo para Do-While (dowhile.tri)
```
let
  var i: Integer
in
  begin
    i := 0;
    do
      begin
        putint(i);
        i := i + 1
      end
    while (i < 5)
  end
```

### Codigo de ejemplo para Case
```
let
    var age : Integer
in
    begin
        age := 20;
        case age of
            20 : putint(1)
            25 : putint(5)
            30 : putint(10)
        end;
    end
```
