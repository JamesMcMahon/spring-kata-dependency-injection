# Spring Dependency Injection Katas

> Practice makes permanent.  
> The best way to understand Dependency Injection is to explore it in practice.

## What is a Code Kata?

A **code kata** is a short, focused programming exercise.  
Just like martial-arts katas train muscle memory, code katas build the mental muscle that lets you reach for good design
instinctively.  
The goal is practice, not perfection:

* keep feedback loops short,
* learn by doing and observing the result,
* reflect on what you learned and try a different approach next time.

## About this repository

The project contains a numbered series of mini-projects that demonstrate how Spring performs Dependency Injection,
starting with plain Java and gradually introducing various aspects of how Spring handles Dependency Injection.

Each package comes with at least one **failing JUnit 5 test**.  
Your job is to make the tests pass by changing the production code only – never the tests.

## Prerequisites

* JDK 24 or newer (managed automatically by the Gradle tool-chain)
* No global Gradle install required – the wrapper script `./gradlew` is included
* Internet connection for the first build (to download dependencies)

## Running the katas

Run the complete test suite:

```bash
./gradlew test
```

Focus on a single exercise (e.g. `n03`):

```bash
./gradlew test --tests '*n03*'
```

Start with `n00`, repeat until the tests pass, then move on to the next package.

### IDE import

Open the project in any IDE that supports Gradle (IntelliJ IDEA, Eclipse, VS Code, etc.).  
The IDE will delegate compiling and testing to Gradle automatically.

## Contributing

This repository is still a work in progress.  
If you find a typo, have a question, or want to add a new exercise, please open an issue or pull request.
