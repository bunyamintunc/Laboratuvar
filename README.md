# Labaratuvar 
Hasta laborat ve rapor ekleyip bu raport üzerinde ekleme silme ve güncelleme işmlemlerini gerçekleştirdiğimiz temel düzeyde bir  `spring boot` web uygulmasıdır.


## İndirip Çalıştırma
İlgili dosyayı local bilgisyarınıza klonlayıp veya indirdikten sonra terminalden root dizinin içindeyken aşağıdaki kodları sırası ile  çalışırtımanız yeterlidir.

```terminal
./mvnw clean package -DskipTest
```
```terminal
docker-compose up -d 
```
Kodları çalıştırdıktan sonra uygulamamız localhost:8080 portunda ayağa kalkacaktır.

## Uygulama Arayüzü

Yukarıdaki işlemleri yaptıktan sonra uygulamamız localhost:8080 adresinden erişebileceğiz.

![alt text](https://r.resimlink.com/zIQZWuyn.png)

******************************************

kullanıcı adını ve şifremizi  admin olarak girelim. Kullanıcı adı ve şifremizi doğru girdikten sonra kaşımıza aşağıdaki gibi bir ana ekran çıkacaktır.

![alt text](https://r.resimlink.com/0WjiG1LEr.png)

- Labaratuvar
  * Eğer varsa bütün raporları listeler
- Add Patient 
  * Hasta eklememizi sağlar
- Add Laborant
  * Laboratuvar görevlisi eklememizi sağlar
- Add Report 
  * Raport eklememiz sağlar
-Seacrh
  *İnput olarak girdiğimiz hasta adı, laborat adı, laborant id  ve hasta id'sine göre arama yapmamızı sağlar. 
  
******************************************
  
![alt text](https://r.resimlink.com/nwjhE2cbJy.png)

Raport eklediğimizde karşımıza çıkan kart yukarıda olduğu gibidir. Update butonuna tıklayarak raporu güncelleyebilir veya Delete butonuna tıklayarak Raporu silebiliriz.

## Kullandığım Teknolojiler

### SRİNG BOOT   ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

 - Web uygulama geliştirmek için güçlü bir framework olduğu ve java ekosisteminde çok yaygın olarak kullanıldığı için kullanmayı uygun buldum. 

### POSTRESQL ![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

 - Açık kaynak kodlu, ücretsiz ve kolay anlaşılabilir bir yapısı olduğundan veri tabanı olarak postresql kullandım. 

### DOCKER   ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
 - Yazdığım uygulamanın ide olmadan da çalıştırılabilmesi için popüler olan docker'ı kullandım. 
 
### HIBERNATE 	![HIBERNATE](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

 - Entitiy sınıflarımı veri tabanı ile ilişkilendirmek ve bunlar üzerinde daha basit sorgular yazabilmek için hibernate kullandım.
 
### LOMBOK ![LOMBOK](https://img.shields.io/badge/LOMBOK-F80000?style=for-the-badge&logo=Oracle&logoColor=white)
 - Kod karşmaşıklığını ve uzunluğunu azaltarak kod okunulabilirliğini arttırmak için Lombok kullandım.
 
 ### MAVEN ![](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
 
 - Sağladığı kolay dosya dizini hizmeti nedeni ve projenin daha iyi anlaşılmasını sağladığı için maven kullandım.






