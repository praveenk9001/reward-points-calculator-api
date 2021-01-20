# endpoints

 1) /rewardPoints/customers (HTTP Method - GET)
 
	Sample Response: 
		[
			{
				"id": 100,
				"firstName": "PraveenKumar",
				"lastName": "Ganthali"
			},
			{
				"id": 101,
				"firstName": "Tom",
				"lastName": "Hardy"
			},
			{
				"id": 102,
				"firstName": "Drew",
				"lastName": "Barrymore"
			}
		]
		
 2) /rewardPoints/customer/{customerId}/{year}/{month} (HTTP Method - GET)
 
	Sample Request: http://localhost:9090/rewardPoints/customer/100/2020/1
	
	Sample Response:
	
		{
			"transactions": [
				{
					"id": 2000,
					"customerId": 100,
					"postedTime": "2020-01-01T15:45:55.000+00:00",
					"amount": 120.0,
					"rewardPoints": 90.0
				},
				{
					"id": 2001,
					"customerId": 100,
					"postedTime": "2020-01-02T16:30:55.000+00:00",
					"amount": 50.0,
					"rewardPoints": 0
				},
				{
					"id": 2002,
					"customerId": 100,
					"postedTime": "2020-01-03T18:55:55.000+00:00",
					"amount": 60.0,
					"rewardPoints": 10.0
				}
			],
			"totalRewardPoints": 100.0
		}
	
	
# reward-points-calculator-api
Calculates the reward points of the customer on monthly basis

The getCustomers endpoint is used to fetch the users in the DB and prepopulate on the Client Side.

The getCustomerRewardPoints endpoint accepts customerId, year and month as 3 parameters from the client side.
This endpoint finds particular transactions related to the customerId for the selected month in the database.
For each transaction of the customer the respective reward points are calculated by calling calculateRewardPoints.
In the end response all the reward points of the customer for the month are summed up and returns the response to client side.
