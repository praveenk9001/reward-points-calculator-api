# reward-points-calculator-api
Calculates the reward points of the customer on monthly basis

The getCustomerRewardPoints endpoint accepts customerId, year and month as 3 parameters from the client side.
This endpoint finds particular transactions related to the customerId for the selected month in the database.
For each transaction of the customer the respective reward points are calculated by calling calculateRewardPoints.
In the end response all the reward points of the customer for the month are summed up and returns the response to client side.


