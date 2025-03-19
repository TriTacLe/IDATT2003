# IDATT2003

Dette prosjektet inneholder øvinger i emnet IDATT2003 ved NTNU. Emnet fokuserer på grunnleggende og avanserte konsepter
innen objektorientert programmering, samt tilhørende prinsipper og teknologier.

## Innhold

Hver mappe i prosjektet representerer en spesifikk øving, og inneholder nødvendig kode og dokumentasjon for oppgaven.

### Oversikt over mapper

- `A3`: Øving 3 API-utvikling med fokus på arv og implementasjon av pipeline
- `A5`: Øving 5 med fokus på implemetasjon av JavaFX uten FXML

## Krav

For å kjøre dette prosjektet trenger du:

- **Java Development Kit (JDK)**: Versjon 17 eller nyere
- **Maven**: For bygging og avhengighetshåndtering

## Hvordan kjøre prosjektet

1. Klon dette repositoriet til din lokale maskin:
   ```bash
   git clone https://github.com/dittbrukernavn/idatt2003.git
   ```
2. Naviger til ønsket øving:
   ```bash
   cd Oving3
   cd Oving5
   ```
3. Bygg og kjør programmet ved hjelp av Maven:
   ```bash
   mvn clean install
   mvn exec:java
   ```
   For Oving5:
   ```bash
   mvn javafx:run
   ```

## Læringsmål

Hensikten med øvingene er å:

- Forstå og anvende objektorienterte prinsipper som innkapsling, arv og polymorfi.
- Bygge robuste og vedlikeholdbare systemer ved hjelp av testdrevne utviklingsmetoder.
- Arbeide med eksterne systemer som filhåndtering og GUI-komponenter.
- JavaFX
- 

## Lisens

Dette prosjektet er lisensiert under [MIT-lisensen](LICENSE). Du står fritt til å bruke, endre og distribuere koden i
henhold til lisensbetingelsene.

---
