# 🧠 Projekt: System Cache dla Danych Słownikowych (Java)

## 🎯 Cel projektu

Stworzenie prostego systemu cachowania danych słownikowych w aplikacji Java, z uwzględnieniem:

* wzorca projektowego Singleton,
* obsługi pliku CSV,
* automatycznego odświeżania danych w tle (wątek).

## 🗃️ Przykładowe dane słownikowe

Dane przechowywane w cache będą reprezentować różne typy słowników, np. regiony, miasta, typy adresów czy role użytkowników:

| 🆔 ID | 🔢 IntKey | 🔤 StringKey | 🏷️ Value               | 📚 EnumerationName |
| ----: | --------: | ------------ | ----------------------- | ------------------ |
|     1 |         1 | POM          | Woj. Pomorskie          | Region             |
|     2 |         2 | KUJPOM       | Woj. Kujawsko-pomorskie | Region             |
|     3 |         3 | MAZ          | Woj. Mazowieckie        | Region             |
|     4 |         1 | GD           | Gdańsk                  | City               |
|     5 |         2 | GDY          | Gdynia                  | City               |
|     6 |         3 | SOP          | Sopot                   | City               |
|     7 |         1 | ADR          | Adres zameldowania      | AddressType        |
|     8 |         2 | CORESP       | Adres korespondencyjny  | AddressType        |
|     9 |         1 | ADM          | Administrator           | UserType           |
|    10 |         2 | USR          | Użytkownik              | UserType           |

## 🔧 Kroki implementacji

### 1. 🏗️ `DictionaryValue`

Stwórz klasę z polami:

* `int id`
* `int intKey`
* `String stringKey`
* `String name`
* `String value`

Dodaj:

* gettery i settery,
* konstruktor domyślny i pełny.

---

### 2. 📄 `DictionaryFileReader`

Stwórz klasę do odczytu danych z pliku CSV:

* lokalizacja pliku: `src/main/resources/dictionaries.csv`
* dodaj metodę `String getRawFileData()` która zwróci surową zawartość pliku jako tekst.

---

### 3. 🔍 Parsowanie danych

Dodaj metodę, która:

* sparsuje surowe dane,
* utworzy listę obiektów `DictionaryValue`.

---

### 4. ♻️ `DictionaryCache` (Singleton)

Zaimplementuj klasę Singleton:

* będzie przechowywać dane w pamięci,
* udostępniać metody do filtrowania po nazwie słownika (`getByEnumerationName`).

---

### 5. ⏱️ Automatyczne odświeżanie (`DictionaryCacheRefresher`)

Dodaj klasę `DictionaryCacheRefresher`, której zadaniem będzie okresowe odświeżanie danych w tle:

* wykorzystaj `ScheduledExecutorService` lub klasę `Thread`,
* wątek powinien co określony czas (np. 1 minuta) pobierać dane z pliku,
* po odczycie dane mają być aktualizowane w Singletonie `DictionaryCache`,
* pamiętaj o bezpieczeństwie wątków przy nadpisywaniu danych (synchronizacja).

---

## ✅ Wymagania

* Poprawna struktura klas i metod,
* Czytelny, dobrze udokumentowany kod,
* Efektywne wykorzystanie wzorca Singleton i wątków.

Powodzenia! 🍀
