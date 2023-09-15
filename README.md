
🔗 Il mio LinkedIn: [here](https://www.linkedin.com/in/antonio-vallerga-2612a468/)

😼 La mia pagina GitHub: [here](https://github.com/Vallerga)

🍳 Per visitare il mio portafoglio digitale: [here](https://portfolio-git-master-vallerga.vercel.app/)

👨‍💻 Per accedere alla parte Front-End potete liberamente consultare: [repository Capstone Project Front-End](https://github.com/Vallerga/Capstone_Project_FE.git)

[https://github.com/tandpfun/skill-icons/blob/main/icons/Postman.svg](https://www.postman.com/)

# SINOSSI CAPSTONE PROJECT - **PRESTITO ILLUMINATO**

La mia applicazione web ha come obiettivo offrire agli utenti un servizio di consulenza per prestiti finanziari. Il core dell'applicazione è la possibilità, in base ad una serie di valori, di determinare la fattibilità del prestito e stabilire dinamicamente l'ammontare mensile in base a parametri scelti dal utente dinamicamente come il TAEG, tasso fisso o mobile, durata mutuo, importo prestito, ecc.

L'applicativo gestisce l'accesso dell'utente utilizzando un sistema di cifratura e contatto basato sul formato JSON, JWT. 

L'utente, una volta eseguito il login, potrà accedere al portale dove sarà possibile svolgere un breve questionario che permette al consulente di aiutare l'utente a personalizzare la richiesta mutuo. L'utente potra quindi andare a modificare i vari paramentri per simulare dinamicamente una richiesta mutuo andando a verificare come i vari parametri impattano sulla rata mensile.

La piattaforma tiene in memoria le credenziali dell'utente e salva le precedenti simulazioni che potranno essere visionate e confrontate.L'utente potrà accedere al proprio storico con le precedenti ricerche e raffrontandolo con le nuove richieste di mutuo.

L'applicativo è stato sviluppato come una applicazione a pagina singola ed è pienamente responsivo per tutti i formati📱💻: mobile, tablet, HD, 4k.

## Tecnologie utilizzate
## Front-End:

- JavaScript
- HTML/CSS
- SASS
- Bootstrap
- React Redux
- React Router Dom

## Back-End:
- Java
- Spring Boot
- PostgreSQL
- Hibernate
- JWT

## Struttura Front-End

Il sito sarà strutturato nelle seguenti sezioni:

### 🔓Pagina di accesso:
E' richiesta la registrazione al sito, avvenuta la quale è possibile accedere al sito mantendo in memoria le nostre credenziale se si seleziona la spunta indicata. In qualsiasi momento sarà possibile scollegarsi grazie all'apposito tasto sulla NavBar.

### 🏡Home:
- Vi è una presentazione del prodotto con le recensione degli utenti
- Possiamo svolgere un breve questionario per migliorare personalizzare la richiesta mutuo.
- Altrimenti si accede direttamente alla simulazione mutuo

### 📚Simulazione mutuo:
- Il portate permette di modificare granularmente il mutuo e di valutare in diretta l'impatto delle modifiche.
- Completata la simulazione possiamo finalizzarla salvandola nel database associato al nostro profilo e richiedere una consulenza.
- sarà sempre possibile accedere allo storico dei precendenti mutuo

## 🏗Struttura Back-End

L'applicativo prevede due sezione separate anche se relazionate: la gestione della security e la gestione dello storico delle simulazioni.

Entrambi le componenti sono state strutturate prevedendo:
- Definizione classe Entity e delle relazioni che lo compongono
- File di configurazione dei Beans
- Interfaccia repository per l'implementazione del CRUD e delle query personalizzate
- Implementazione mediante file service delle query e delle varie funzionalità
- File controller responsabile della mappatura dei servizi REST
- sezione dedicata alla gestione delle exception

Per accedere alla parte Front-End potete liberamente consultare: [repository Capstone Project Front-End](https://github.com/Vallerga/Capstone_Project_FE.git)
