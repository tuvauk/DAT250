#Software Technology Experiment Assignment 3
####Tuva Kvalsøren

##Technical difficulties
I seem to have sort of fixed the previous weeks git-issues, though not optimal. The main technical issues this week included 
the need to update and upgrade everything in homebrew and mongoDB. This took some time, but the database connected in the end. 

##Experiment 1

Although some of the tutorials used the MongoDB Compass interface i chose to do all the operations in the mongo shell

###1. Insert Documents
Screenshot of crud1

###1. Query documents:
Most operations were the same here, differing on the queries. I passed the query as argument in the find property
Finding all the objects with status either A or D
![image](/var/folders/v2/3sxghgy575797pjlhqrw5ddc0000gn/T/TemporaryItems/NSIRD_screencaptureui_bjNTkm/Screenshot 2021-09-21 at 17.02.22.png)

###3. Update Documents
Inserted values and updated. As you can see the uom of the paper-item changes from in to cm
![image](/var/folders/v2/3sxghgy575797pjlhqrw5ddc0000gn/T/TemporaryItems/NSIRD_screencaptureui_PiQxK0/Screenshot 2021-09-21 at 17.13.06.png)
![image](/var/folders/v2/3sxghgy575797pjlhqrw5ddc0000gn/T/TemporaryItems/NSIRD_screencaptureui_Ol2i9v/Screenshot 2021-09-21 at 17.13.27.png)


###4. Remove Documents
![image](/var/folders/v2/3sxghgy575797pjlhqrw5ddc0000gn/T/TemporaryItems/NSIRD_screencaptureui_UIch56/Screenshot 2021-09-21 at 17.18.40.png)

The database is empty. I also used remove to remove values before the previous steps.
###5. Bulk Write Operations
![image](/var/folders/v2/3sxghgy575797pjlhqrw5ddc0000gn/T/TemporaryItems/NSIRD_screencaptureui_RDVu2O/Screenshot 2021-09-21 at 17.23.20.png)

##Experiment 2
From the tutorial:

![image](/Users/tuvakvalsoren/Desktop/Screenshot 2021-09-21 at 17.40.28.png)

My own function, which sums up the total amount sold for on each day:

![image](/private/var/folders/v2/3sxghgy575797pjlhqrw5ddc0000gn/T/TemporaryItems/NSIRD_screencaptureui_zFRsqk/Screenshot 2021-09-21 at 17.57.12.png)
![image](/var/folders/v2/3sxghgy575797pjlhqrw5ddc0000gn/T/TemporaryItems/NSIRD_screencaptureui_9wWn5x/Screenshot 2021-09-21 at 17.52.40.png)

With map reducing I can split up operations into functions and reuse them to efficiently obtain data.
This sort of works like complex join queries as far as i have interpereted it. 
