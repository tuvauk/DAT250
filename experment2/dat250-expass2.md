# DAT250: Software Technology Experiment Assignment 2

## Technical problems
Seeing as I recently had worked on a JPA-project I had already solved most of the typical maven-issues previous to this hand-in. I only struggled a bit understanding what was required to configure the datatbase, seeing as I don't have any experience with derby. I chose to only use the IDE but if I were to spend more time on the database-implementation I would definetly use a locally served database to ensure everything worked fine. 
The way i confirmed the table-creations was by displaying the entity-relationships in IntelliJ as seen on the screenshots. 
For simplicity I used the jpa-example for both exercise 1 and 2, just altering the models and configuration-file persistance.xml. In the current repo only the code from experiment 2 is present. 

## Pending issues
Later on I had quite a lot of struggles with git, where i suspect the issues occured when trying to save a copy of a cloned project inside another git-repo. I'm not sure if its possible to access the code from excercise 1 in the git-repo and hopefully I can get help to fix the git-configuration in this weeks lab. 
The tests all ran and I verified the values being inserted by checing the console-output from Main. 

### ex.1 
<img width="208" alt="Screenshot 2021-09-12 at 19 35 02" src="https://user-images.githubusercontent.com/48728053/132997275-5f8907d3-7808-411f-acc7-5f69eddbde29.png">

## ex.2
##<img width="475" alt="Screenshot 2021-09-12 at 19 42 32" src="https://user-images.githubusercontent.com/48728053/132997408-cd490e28-8866-494e-96a8-8f9d3b344687.png">

Inspecting the relationships it seems to correspond to the design, more or less. 
These relationships are based on the code so this is also what I used to verify the relationships in the database


