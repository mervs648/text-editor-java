# Text Editor (Java Swing)

A desktop text editor built in Java with Swing, developed as a group project for the Advanced Object Oriented Programming course at Ege University.

**Group project — developed with Büşra Karakütük.**

## Features
- Open, Save, and Save As file operations
- Undo functionality
- Case-sensitive and case-insensitive text search
- Dark Mode toggle

## Design Patterns
Four design patterns were applied in this project:

| Pattern | Purpose |
|---|---|
| **Command** | Encapsulates file operations (Open, Save, Save As) as command objects |
| **Strategy** | Enables interchangeable search algorithms (case-sensitive / case-insensitive) |
| **Memento** | Powers the Undo feature by storing snapshots of editor text |
| **Singleton** | Manages global application settings (font size, Dark Mode) |

## Tech Stack
- Java, Swing (NetBeans GUI Builder)

## Project Structure
