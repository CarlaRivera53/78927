# csharp-vacio
Proyecto vacío construido a partir del SDK Dotnet 5.0.

# ejecutar
dotnet run

# imagen base
docker pull mcr.microsoft.com/dotnet/sdk:5.0

# limpiar los certificados
dotnet dev-certs https --clean
dotnet dev-certs https -t

# documentación de consulta para soporte de SoapCore
https://github.com/DigDes/SoapCore