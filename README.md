# Progetto: API REST di gestione utenti e ordini

## Descrizione:
Crea un'applicazione Spring Boot che gestisca utenti e ordini. L'applicazione deve permettere di:
- Creare, leggere, aggiornare e cancellare (CRUD) utenti.
- Creare, leggere, aggiornare e cancellare ordini.
- Un utente può avere più ordini, e ogni ordine è associato a un solo utente.

## Funzionalità principali:

### 1. Gestione utenti:
   - **POST /users:** Creare un nuovo utente.
   - **GET /users:** Ottenere una lista di tutti gli utenti.
   - **GET /users/{id}:** Ottenere un utente specifico per ID.
   - **PUT /users/{id}:** Aggiornare un utente.
   - **DELETE /users/{id}:** Eliminare un utente.

### 2. Gestione ordini:
   - **POST /users/{userId}/orders:** Creare un nuovo ordine per un utente.
   - **GET /users/{userId}/orders:** Ottenere tutti gli ordini di un utente specifico.
   - **GET /orders/{id}:** Ottenere un ordine specifico per ID.
   - **PUT /orders/{id}:** Aggiornare un ordine.
   - **DELETE /orders/{id}:** Eliminare un ordine.

### 3. Relazione utente-ordine:
   - Ogni ordine deve avere un riferimento all'utente a cui appartiene.
   - Un utente può avere più ordini, ma un ordine può appartenere a un solo utente.

## Passaggi e punti da sviluppare:

### 1. Progettazione del database:
   - **Entità Utente:**
     - `id` (Long)
     - `name` (String)
     - `email` (String)
     - `phoneNumber` (String)
   
   - **Entità Ordine:**
     - `id` (Long)
     - `description` (String)
     - `totalPrice` (BigDecimal)
     - `userId` (relazione many-to-one con l'utente)

### 2. Creazione del progetto:
   - Crea un progetto Spring Boot usando Spring Initializr o un IDE (IntelliJ/Eclipse).
   - Aggiungi dipendenze: **Spring Web**, **Spring Data JPA**, **H2** (o **MySQL**), e **Lombok** (opzionale).

### 3. Struttura del progetto:
   - **Controller:** gestisce le richieste HTTP per utenti e ordini.
   - **Service:** contiene la logica di business (es. creazione, aggiornamento di utenti e ordini).
   - **Repository:** interagisce con il database usando JPA.
   - **Model/Entity:** rappresenta le entità Utente e Ordine.
   
### 4. Implementazione delle entità (Model):
   - Definisci le classi `User` e `Order` con le rispettive annotazioni JPA (`@Entity`, `@OneToMany`, `@ManyToOne`).

### 5. Creazione dei repository (Repository):
   - Crea `UserRepository` e `OrderRepository` per gestire l'accesso ai dati.

### 6. Creazione dei service (Service):
   - Implementa la logica per gestire utenti e ordini (creazione, aggiornamento, cancellazione).

### 7. Creazione dei controller (Controller):
   - Implementa i vari endpoint RESTful per interagire con l'applicazione.
   
### 8. Gestione degli errori:
   - Implementa una gestione base degli errori per gestire casi come "utente non trovato" o "ordine non trovato" (usando `@ExceptionHandler`).

### 9. Testing:
   - Aggiungi test per i metodi del controller e del service per verificare il corretto funzionamento (se hai familiarità con i test in Spring).

## Obiettivo bonus:
- Aggiungi la possibilità di **filtrare gli ordini** per utente o per data.
- Implementa un **sistema di autenticazione base** usando Spring Security (opzionale se vuoi esplorare la sicurezza).
