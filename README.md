# pruebaTecnicaMeli
##tecnologias
* framework
  * Spring Boot Java
* Motor de base de datos
  * Mysql
* Contenerización y despliegue
  * Docker

## URLS y instrucciones de uso de la API

> Authorization: basic auth
> 
> User: 5d2662e2-ef84-4922-9cab-d5e46541fdcb
> 
> pass: 3a97b852-9f5b-4d3c-b529-c79904783986

url de calculo del cupon de mercado libre 
> POST: http://165.232.153.114:8040/Meli/api/coupon
### Body example
`{
"item_ids": ["MLA1121025591","MLA1142471087","MLA1142471087","MLA1142471087","MLA1142471087"],
"amount": 100000
}`

url top 5 favoritos
> GET: http://165.232.153.114:8040/Meli/api/favoritescoupon

## intrucciones despliegue y imagenes docker



