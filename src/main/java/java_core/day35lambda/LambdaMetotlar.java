package java_core.day35lambda;

public class LambdaMetotlar {
    /*
    Java'da en çok kullanılan metotlar şu şekildedir (örneklerle birlikte):

forEach:

Bir liste veya koleksiyon üzerindeki her bir elemanı gezmek için kullanılır.

List<String> names = Arrays.asList("John", "Jane", "Jim");
names.forEach(name -> System.out.println(name));
----------------------------------
map:

Bir liste veya koleksiyon üzerindeki her bir elemanı bir fonksiyonla
işlemek için kullanılır.

List<Integer> numbers = Arrays.asList(1, 2, 3);
List<Integer> doubledNumbers = numbers.stream()
                                       .map(number -> number * 2)
                                       .collect(Collectors.toList());
------------------------------------------------
filter:

Bir liste veya koleksiyon üzerindeki elemanları bir koşula göre
filtrelemek için kullanılır.

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
                                    .filter(number -> number % 2 == 0)
                                    .collect(Collectors.toList());
----------------------------------------------------
reduce:

Bir liste veya koleksiyon üzerindeki elemanları birleştirmek için kullanılır.

List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
int sum = numbers.stream().reduce(0, (a, b) -> a + b);

-------------------------------------------------------------
sort:

Bir liste veya koleksiyon üzerindeki elemanları sıralamak için kullanılır.

List<Integer> numbers = Arrays.asList(3, 1, 4, 2, 5);
numbers.sort((a, b) -> a.compareTo(b));
-----------------------------------------------------------------
min ve max:

Bir liste veya koleksiyon üzerindeki en küçük veya en büyük elemanı
bulmak için kullanılır.

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int min = numbers.stream().min((a, b) -> a.compareTo(b)).get();
int max = numbers.stream().max((a, b) -> a.compareTo(b)).get();
----------------------------------------
anyMatch, allMatch, ve noneMatch:

Bir liste veya koleksiyon üzerindeki elemanların belirli
bir koşula uymasını kontrol etmek için kullanılır.

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
boolean anyEven = numbers.stream().anyMatch(number -> number % 2 == 0);
boolean allEven = numbers.stream().allMatch(number -> number % 2 == 0);
boolean noneEven = numbers.stream().noneMatch(number -> number % 2 == 0);

groupingBy:

Bir liste veya koleksiyon üzerindeki elemanları belirli bir anahtara
göre gruplamak için kullanılır.

List<Person> people = Arrays.asList(new Person("John", 25), new Person("Jim", 35));
Map<Integer, List<Person>> peopleByAge =
people.stream().
collect(Collectors.
groupingBy(person -> person.age));
--------------------------------------
partitioningBy:

Bir liste veya koleksiyon üzerindeki elemanları belirli bir koşula göre
ikiye bölmek için kullanılır.

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Map<Boolean, List<Integer>> evenOddNumbers = numbers.stream().
collect(Collectors.
partitioningBy(number -> number % 2 == 0));
--------------------------
collect:
Bir stream üzerindeki verileri bir liste, set veya diğer
koleksiyon tiplerine toplamak için kullanılır. Aşağıdaki örnekte, bir String listesi üzerindeki elemanlar bir ArrayList'e toplanmaktadır:

List<String> list = Arrays.asList("A", "B", "C", "D");
List<String> result = list.stream().collect(Collectors.toList());
------------------------------
count:

Bir stream üzerindeki elemanların sayısını bulmak için kullanılır.
Aşağıdaki örnekte, bir String listesi üzerindeki elemanların sayısı bulunmaktadır:

List<String> list = Arrays.asList("A", "B", "C", "D");
long count = list.stream().count();
---------------------------------------

Java'da lambda ifadeleri ile string değerler için en çok kullanılan metotlar
ve bu metotların örnek kullanımları aşağıdaki gibidir:
-----------------------------
map:
Bir stream üzerindeki string değerlerin her bir elemanını belirli bir şekilde değiştirmek için kullanılır.
Aşağıdaki örnekte, bir string listesi üzerindeki elemanların tüm harfleri büyütülmektedir:

List<String> list = Arrays.asList("apple", "banana", "cherry");
List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
---------------------
filter:

Bir stream üzerindeki string değerlerin belirli kriterlere uyan elemanları seçmek için kullanılır.
Aşağıdaki örnekte, bir string listesi üzerindeki 5 harf veya daha fazla harf içeren elemanlar seçilmektedir:

List<String> list = Arrays.asList("apple", "banana", "cherry");
List<String> result = list.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
------------------------------------
sorted:

 Bir stream üzerindeki string değerleri belirli bir sırada sıralamak için kullanılır. Aşağıdaki örnekte, bir string listesi alfabetik olarak sıralanmaktadır:

List<String> list = Arrays.asList("apple", "banana", "cherry");
List<String> result = list.stream().sorted().collect(Collectors.toList());
------------------------------
reduce:

Bir stream üzerindeki string değerlerin tek bir değere indirgenmesini sağlamak için kullanılır. Aşağıdaki örnekte, bir string listesi üzerindeki tüm elemanlar bir string olarak birleştirilmektedir:

List<String> list = Arrays.asList("apple", "banana", "cherry");
String result = list.stream().reduce("", (s1, s2) -> s1 + s2);

Bu metotlar string değerler için yalnızca birkaç örnek olup,
stream API'sının sunmuş olduğu diğer metotlar da mevcuttur.
    *


    */
}
