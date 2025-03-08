Funksjonell programmering og GUI

I denne innleveringen skal du jobbe med GUI, lambdauttrykk og streams. I tillegg skal du (som alltid) lage enhetstester,
opprette Maven-prosjekt, og praktisere versjonskontroll med Git både lokalt og mot sentralt repo (GitLab/GitHub).

Innleveringen består av et miniprosjekt (kortspill, se beskrivelse under). Vi anbefaler at du bruker dette prosjektet
til å bli kjent med GUI med JavaFX, lambda-uttrykk, streams og filter, før du starter med å implementere GUI i mappen.

Arbeidskravet gjennomføres individuelt. Når du har løst oppgaven må du levere i BB og vise frem det du har gjort til en
læringsassistent for godkjenning.
Problembeskrivelse – Miniprosjekt "Kortspill"

Du skal utvikle et enkelt kortspill. Kortspillet består av en kortstokk (engelsk: DeckOfCards) som inneholder 52 kort (
engelsk: PlayingCard). Det skal være mulig å dele ut en "hånd med kort" (engelsk: HandOfCards) til en spiller. Det skal
deles ut minimum 5 kort.

I kortspillet poker (blant annet), er en av kortkombinasjonene som gir poeng en
flush (https://en.wikipedia.org/wiki/Flush_(cards)). Ditt program skal blant annet sjekke korthånden for 5-korts flush (
altså 5 kort av samme farge, som f.eks. 5 hjerter eller 5 kløver), fortrinnsvis ved bruk av streams (med tilhørende
funksjoner som filter, map osv.).

Du står helt fritt når det gjelder utforming av GUI. I enkleste form kan du presentere en korthånd som en streng på
formen "H4 H12 C3 D11 S1", der bokstavene 'H', 'D', 'C' og 'S' står for henholdsvis "Hearts", "Diamonds", "Clubs" og "
Spades". Dersom du ønsker en ekstra utfordring, kan du også velge å vise kortene som bilder. Du finner mange eksempler
på internett på hvordan du kan få til dette.