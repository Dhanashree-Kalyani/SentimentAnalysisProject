# Sentiment Analysis Project

This project demonstrates the implementation of sentiment analysis using **Stanford CoreNLP**. It processes textual data to determine the sentiment expressed in sentences, such as positive, negative, or neutral sentiments. 

## Features

- Tokenization, sentence splitting, part-of-speech tagging, lemmatization, named entity recognition, and sentiment analysis using Stanford CoreNLP.
- Pre-trained models for robust sentiment analysis.
- Easy-to-understand example showcasing the pipeline setup and usage.

---

## Prerequisites

Before running this project, ensure the following are installed on your system:

- **Java Development Kit (JDK)**: Version 8 or higher. [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven** (Optional): For dependency management.
- **Stanford CoreNLP library**: Pre-downloaded or accessible via Maven.

---


## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Dhanashree-Kalyani/SentimentAnalysisProject
   cd sentiment-analysis

2. **Download Stanford CoreNLP**:

Download the Stanford CoreNLP library and models from Stanford CoreNLP from Maven repository.
Extract the downloaded files and create a folder called stanford-corenlp and place it in.
Note: Need to download .jar as well as model.jar for 4.4.0(you can use any latest version)
![image](https://github.com/user-attachments/assets/36690f57-f171-4b55-86b2-1b373ff526cb)

3. **Configure Project Dependencies**:
Add the required dependencies to your pom.xml (if using Maven)
<dependency>
    <groupId>edu.stanford.nlp</groupId>
    <artifactId>stanford-corenlp</artifactId>
    <version>4.5.4</version>
</dependency>
<dependency>
    <groupId>edu.stanford.nlp</groupId>
    <artifactId>stanford-corenlp</artifactId>
    <version>4.5.4</version>
    <classifier>models</classifier>
</dependency>








