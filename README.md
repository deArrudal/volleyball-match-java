# Volleyball Scoreboard 

A JOptionPane-based scoreboard that simulate a volleyball match. 

## Description

The program simulates a best-of-five sets volleyball match.
Each set ends when one team scores 25 points by a two-point margin and if a fifth set is required, it usually ends with 15 points.

This repository contains the following .java files:
* App.java
    - Main function that simulates the match.
* BuildMatch.java
    - An object containing the match and team attributes.
* BuildTeam.java
    - An object containing the team's name, number of sets won and  current score.
* Methods.java
    - An class containing the score display, check set and check winner methods.  

## Getting Started

### Dependencies

* Java Development Kit (JDK).

### Folder Structure
````
JAVA - VOLLEYBALL PROJECT
├── src
│   ├── VolleyballPackage
│   │   ├── App.java
│   │   ├── BuildMatch.java
│   │   ├── BuildTeam.java
│   │   ├── Methods.java
├── bin
├── lib
├── .gitignore
├── LICENSE
└── README.md
````

### Executing program

* On your command prompt, change your current directory to the "src/VolleyballPackage" folder and type:
```
>> javac App.java
>> java App
```

## Authors

 - deArruda, Lucas [@SardinhaArruda](https://twitter.com/SardinhaArruda)

## Version History

* 0.1
    * Initial Release

## License

This project is licensed under the GPL-3.0 License - see the LICENSE.md file for details

## Acknowledgments

This README.md was based the amazing [README-Template](https://gist.github.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc).
