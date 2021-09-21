# Software Technology Experiment Assignment 3
#### Tuva Kvalsøren

## Technical difficulties
I seem to have sort of fixed the previous weeks git-issues, though not optimal. The main technical issues this week included 
the need to update and upgrade everything in homebrew and mongoDB. This took some time, but the database connected in the end. 
 
<img width="843" alt="Screenshot 2021-09-21 at 15 47 47" src="https://user-images.githubusercontent.com/48728053/134209068-746c1995-2652-4f2b-897d-76989e374f37.png">

## Experiment 1

Although some of the tutorials used the MongoDB Compass interface i chose to do all the operations in the mongo shell

### 1. Insert Documents

<img width="718" alt="Screenshot 2021-09-21 at 18 26 17" src="https://user-images.githubusercontent.com/48728053/134209992-87a38b79-f8e4-4579-9397-f29d5374fa96.png">

### 1. Query documents:
Most operations were the same here, differing on the queries. I passed the query as argument in the find property
Finding all the objects with status either A or D!

<img width="444" alt="Screenshot 2021-09-21 at 18 17 18" src="https://user-images.githubusercontent.com/48728053/134208268-7025a821-49ae-4589-bd43-a3f251605c03.png"><img width="843" alt="Screenshot 2021-09-21 at 15 47 47" src="https://user-images.githubusercontent.com/48728053/134209029-116734eb-b93a-41c4-91ce-e28a5b9909a2.png">


### 3. Update Documents
Inserted values and updated. As you can see the uom of the paper-item changes from in to cm

<img width="517" alt="Screenshot 2021-09-21 at 18 19 08" src="https://user-images.githubusercontent.com/48728053/134208544-fddcc689-4301-47bc-8ad6-cea0d460ee80.png">

### 4. Remove Documents

<img width="520" alt="Screenshot 2021-09-21 at 18 19 28" src="https://user-images.githubusercontent.com/48728053/134208603-83af067d-18fa-4ab7-b46b-e597820f2c48.png">

The database is empty. I also used remove to remove values before the previous steps.
### 5. Bulk Write Operations

<img width="743" alt="Screenshot 2021-09-21 at 17 22 46" src="https://user-images.githubusercontent.com/48728053/134209169-3c03c6d9-a1a8-4ada-9816-490d0fe945c1.png">


## Experiment 2
From the tutorial:

<img width="612" alt="Screenshot 2021-09-21 at 17 40 28" src="https://user-images.githubusercontent.com/48728053/134209240-0352c430-a5fe-4437-b531-bcd144bd22e8.png">

My own function, which sums up the total amount sold for on each day:

<img width="507" alt="Screenshot 2021-09-21 at 18 20 17" src="https://user-images.githubusercontent.com/48728053/134208729-df1fff71-8e8e-426b-a4a9-f8d6da5e880f.png">

With map reducing I can split up operations into functions and reuse them to efficiently obtain data.
This sort of works like complex join queries as far as i have interpereted it. 
