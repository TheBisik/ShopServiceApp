Dobra, teraz bieżące kwestie:
1) widziałem, że samodzielnie utworzył pan brancza 'maincopy'. Super :-)
2) Przypominam jakie klasy trzeba utworzyć:
   a) Address ogólna klasa zawierająca wspólne cechy, najlepiej jako abstrakcyjna
   b) klasy CompanyAddress oraz StorageAddress reprezentujące wyspecjalizowane adresy tzn. specyficzne cechy, wyjątkowe dla danej klasy
   c) klasa Company reprezentująca firmę, jako pola w tej klasie można użyć typy, które utworzyliśmy w ramach dotychczasowej nauki, albo zaproponować inne.
   d) klasa reprezentująca zbiór firm o nazwie Companies. W tej klasie można np. utworzyć metodę zwracającą mapę, o której rozmawialiśmy tj. Map<String,Address> addressDataBase
   oczywiście alternatywnie można stworzyć klasę inną, pomocniczą, która będzie zawierać powyższą metodę. Zdaję się na Pana :-)