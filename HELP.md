
Resources API Endpoints:
------------------------

1. Create Resources
    - Endpoint: `/createResources`
    - Method: `POST`
    - Request:
      ```json
      {
        "priority": 1,
        "cement": 100,
        "water": 50,
        "sandTrips": 200,
        "conductors": 10,
        "complaintID": 123
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "priority": 1,
        "cement": 100,
        "water": 50,
        "sandTrips": 200,
        "conductors": 10,
        "complaintID": 123
      }
      ```

2. Update Resources
    - Endpoint: `/updateResources`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1,
        "priority": 2,
        "cement": 150,
        "water": 75,
        "sandTrips": 250,
        "conductors": 15,
        "complaintID": 456
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "priority": 2,
        "cement": 150,
        "water": 75,
        "sandTrips": 250,
        "conductors": 15,
        "complaintID": 456
      }
      ```

3. Delete Resources by ID
    - Endpoint: `/deleteResourcesById`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "priority": 2,
        "cement": 150,
        "water": 75,
        "sandTrips": 250,
        "conductors": 15,
        "complaintID": 456
      }
      ```

4. Get Resources by ID
    - Endpoint: `/getResourcesById`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "priority": 2,
        "cement": 150,
        "water": 75,
        "sandTrips": 250,
        "conductors": 15,
        "complaintID": 456
      }
      ```

5. Get All Resources
    - Endpoint: `/getAllResources`
    - Method: `GET`
    - Response:
      ```json
      [
        {
          "id": 1,
          "priority": 2,
          "cement": 150,
          "water": 75,
          "sandTrips": 250,
          "conductors": 15,
          "complaintID": 456
        },
        // Additional resources...
      ]
      ```

Users API Endpoints:
--------------------

1. Create User
    - Endpoint: `/createUser`
    - Method: `POST`
    - Request:
      ```json
      {
        "name": "John Doe",
        "role": "Admin",
        "email": "john.doe@example.com",
        "password": "securePassword",
        "mobile": "1234567890"
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "name": "John Doe",
        "role": "Admin",
        "email": "john.doe@example.com",
        "password": "securePassword",
        "mobile": "1234567890"
      }
      ```

2. Update User
    - Endpoint: `/updateUser`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1,
        "name": "Updated Name",
        "role": "User",
        "email": "updated.email@example.com",
        "password": "newSecurePassword",
        "mobile": "9876543210"
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "name": "Updated Name",
        "role": "User",
        "email": "updated.email@example.com",
        "password": "newSecurePassword",
        "mobile": "9876543210"
      }
      ```

3. Delete User by ID
    - Endpoint: `/deleteUserById`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "name": "Updated Name",
        "role": "User",
        "email": "updated.email@example.com",
        "password": "newSecurePassword",
        "mobile": "9876543210"
      }
      ```

4. Get All Users
    - Endpoint: `/getAllUsers`
    - Method: `GET`
    - Response:
      ```json
      [
        {
          "id": 1,
          "name": "Updated Name",
          "role": "User",
          "email": "updated.email@example.com",
          "password": "newSecurePassword",
          "mobile": "9876543210"
        },
        // Additional users...
      ]
      ```

5. Get User by ID
    - Endpoint: `/getUserById`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "name": "Updated Name",
        "role": "User",
        "email": "updated.email@example.com",
        "password": "newSecurePassword",
        "mobile": "9876543210"
      }
      ```

6. Get User by Email
    - Endpoint: `/getUserByEmail`
    - Method: `POST`
    - Request:
      ```json
      {
        "email": "updated.email@example.com"
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "name": "Updated Name",
        "role": "User",
        "email": "updated.email@example.com",
        "password": "newSecurePassword",
        "mobile": "9876543210"
      }
      ```

7. Get User by Mobile
    - Endpoint: `/getUserByMobile`
    - Method: `POST`
    - Request:
      ```json
      {
        "mobile": "9876543210"
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "name": "Updated Name",
        "role": "User",
        "email": "updated.email@example.com",
        "password": "newSecurePassword",
        "mobile": "9876543210"
      }
      ```

Complain API Endpoints:
-----------------------

1. Create Complain
    - Endpoint: `/createComplain`
    - Method: `POST`
    - Request:
      ```json
      {
        "Area": "City Center",
        "Location": "123 Main Street",
        "Telephone": "9876543210",
        "Description": "Street light not working",
        "Comments": "Logged by John Doe"
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "Area": "City Center",
        "Location": "123 Main Street",
        "Telephone": "9876543210",
        "Description": "Street light not working",
        "Comments": "Logged by John Doe"
      }
      ```

2. Update Complain
    - Endpoint: `/updateComplain`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1,
        "Area": "Updated Area",
        "Location": "456 Side Street",
        "Telephone": "1234567890",
        "Description": "Updated issue description",
        "Comments": "Updated by Jane Doe"
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "Area": "Updated Area",
        "Location": "456 Side Street",
        "Telephone": "1234567890",
        "Description": "Updated issue description",
        "Comments": "Updated by Jane Doe"
      }
      ```

3. Delete Complain by ID
    - Endpoint: `/deleteComplainById`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "Area": "Updated Area",
        "Location": "456 Side Street",
        "Telephone": "1234567890",
        "Description": "Updated issue description",
        "Comments": "Updated by Jane Doe"
      }
      ```

4. Get Complain by ID
    - Endpoint: `/getComplainById`
    - Method: `POST`
    - Request:
      ```json
      {
        "id": 1
      }
      ```
    - Response:
      ```json
      {
        "id": 1,
        "Area": "Updated Area",
        "Location": "456 Side Street",
        "Telephone": "1234567890",
        "Description": "Updated issue description",
        "Comments": "Updated by Jane Doe"
      }
      ```

5. Get All Complains
    - Endpoint: `/getAllComplains`
    - Method: `GET`
    - Response:
      ```json
      [
        {
          "id": 1,
          "Area": "Updated Area",
          "Location": "456 Side Street",
          "Telephone": "1234567890",
          "Description": "Updated issue description",
          "Comments": "Updated by Jane Doe"
        },
        // Additional complains...
      ]
      ```

6. Get Complains by Area
    - Endpoint: `/getComplainByArea`
    - Method: `POST`
    - Request:
      ```json
      {
        "area": "City Center"
      }
      ```
    - Response:
      ```json
      [
        {
          "id": 1,
          "Area": "Updated Area",
          "Location": "456 Side Street",
          "Telephone": "1234567890",
          "Description": "Updated issue description",
          "Comments": "Updated by Jane Doe"
        },
        // Additional complains in the specified area...
      ]
      ```

These examples assume that your `ResourcesService`, `UserService`, and `ComplainService` methods are correctly implemented and return instances of their respective DTOs.
