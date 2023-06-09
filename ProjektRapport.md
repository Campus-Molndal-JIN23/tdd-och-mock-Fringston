# Projektrapport: TDD och Mock

Skapad av: Fredrik Rinstad

### Beskrivning av projektet

Projektet är en app som använder sig av en API för att hämta vädret för en specifik stad. Appen är byggd med hjälp av TDD och Mockito. Detta innebär att testerna jag gjort är skrivna innan koden. Testerna är skrivna för att testa metoderna i klassen WeatherService.

Testerna är gjorda med hjälp av Mockito, vilket innebär att testerna inte testar den faktiska API:n, utan en mock av API:n. Detta innebär att testerna inte är beroende av API:n, och testerna kommer att fungera även om API:n är nere.


## Arbetet och dess genomförande

### Vad som varit svårt
Jag hade svårt för att förstå hur jag skulle använda mig av Mockito och hur mycket kod det behövdes i klassen som skulle koppla sig till API:et eftersom det egentligen inte behövdes någon riktig koppling.

Jag har fortfarande svårt att greppa hela API-tänket och hur allt hänger ihop och skulle behöva träna mer på det.
JSON är också något jag har svårt att förstå mig på.
### Beskriv lite olika lösningar du gjort
Jag använde mig av assertEqual och assertNotEqual för att testa att metoderna fungerade som de skulle. 
Jag använde mig också av assertNotNull på ett test för att testa att det inte var null som returnerades.


## Slutsatser

### Vad gick bra
Själva testerna gick bra att göra. Jag hade inga problem med att få dem att fungera.

### Vad gick dåligt
Att förstå alla kopplingar mellan de olika klasserna och hur allt hänger ihop. Vart mockningen skulle ske.

### Vad har du lärt dig
Att @BeforeEach är väldigt användbart för att slippa skriva samma kod flera gånger.

### Vad hade du gjort annorlunda om ni gjort om projektet
Jag hade skrivit fler metoder och tester till dem.

### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Möjligheten att skapa program som är testade och fungerar som de ska. Att kunna skriva tester för att se att programmet fungerar som det ska.