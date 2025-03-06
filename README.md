
---

# Hotel Booking System API

This is a Spring Boot-based Hotel Booking System API that provides users (customers and admins) with the ability to manage hotel rooms, make bookings, and perform administrative tasks. The system includes functionalities for user registration, authentication, hotel and room management, and booking operations.

## Features

- **User Authentication**: Users can register, log in, and manage their accounts.
- **Hotel Management**: Admins can create, edit, and delete rooms.
- **Room Management**: Admins can create, update, delete, and filter rooms based on availability, type, and price.
- **Booking System**: Customers can make, update, cancel, and view bookings.
- **Account Verification**: Users filter rooms based on availability, type, and price.
- **Admin Dashboard**: Admins can manage user accounts, hotel room details, and room reservations.

## Endpoints

### Authentication

- **POST /auth/register-user**: Register a new user.
- **POST /auth/login**: Log in as a registered user.
- **GET/users/{email}**: Get details of the logged-in user.
- **DELETE /users/delete/{userId}**: Delete the user's account.

### Hotel Management (Admin)

- **POST /rooms/add/new-room**: Create a new Room.
- **GET /rooms/all-rooms**: List all rooms.
- **GET /rooms/room/{roomId}**: Get details of a specific room.
- **PUT /rooms/update/{roomId}**: Update room details.
- **GET /rooms/available-rooms**: Get available rooms not booked yet.
- **GET /rooms/room/types**: Get all room types.
- **DELETE /rooms/delete/{roomId}**: Delete a room.

## Admin role priviledges
- **GET /roles/all-roles** List all the roles.
- **POST /roles/create-new-role** Create a new role.
- **DELETE /roles/delete/{roleId}** Delete a role.
- **POST /roles/remove-all-users-from-role/{roleId}** Revoke all users roles.
- **POST /roles/remove-user-from-role** Revoke a user's role.
- **POST /roles/assign-user-to-role** Assign a role to a user.



### Room Management (Admin)

- **POST /api/v1/rooms**: Add a new room to a hotel.
- **GET /api/v1/rooms/hotel/{hotelId}**: Get a list of rooms in a hotel.
- **PUT /api/v1/rooms/{roomId}**: Update a room's details.
- **DELETE /api/v1/rooms/{roomId}**: Delete a room from the hotel.
- **GET /api/v1/rooms/availability/{roomId}**: Check room availability.
- **GET /api/v1/rooms/available**: List all available rooms.
- **PATCH /api/v1/rooms/deactivate/{roomId}**: Deactivate a room.
- **PATCH /api/v1/rooms/reactivate/{roomId}**: Reactivate a room.

- **GET /api/v1/rooms/filter/price?minPrice={minPrice}&maxPrice={maxPrice}**: Filter rooms by price range.

### Booking

- **POST /bookings/room/{roomId}/booking**: Make a booking for a room.
- **PUT /bookings/booking/{bookingId}/delete**: Cancel a booking.
- **GET /bookings/all-bookings**: View all bookings.
- **PUT /bookings/update/{bookingId}**: Update an existing booking.
- **GET /bookings/confirmation/{confirmationCode}**: Get a user's booking by confirmation code.
- **GET /bookings/user/{email}/bookings**: Get a user's bookings.
- **GET /api/v1/rooms/filter/type?type={roomType}**: Filter rooms by type (e.g., SINGLE).
## API Documentation

You can use **Postman** to interact with the API. Follow these steps:

**Postman Collection**:  
   Download and import the [Postman collection](https://www.postman.com/avionics-explorer-29622376/dmadinidvidual/collection/csroadq/hotel-management?action=share&creator=29599021) to test the API endpoints.


## Requirements

- Java 11 or higher
- Spring Boot 2.x
- Maven or Gradle
- JDK and IDE setup (e.g., IntelliJ IDEA, Eclipse)

## Setup & Installation

1. **Clone the repository**:
   ```bash
   git clone <[repository_url](https://github.com/dmadindividual/Hotel_Management_Api)>
   cd hotel-booking-system
   ```

2. **Install dependencies**:
   If using Maven:
   ```bash
   mvn install
   ```

3. **Configure application properties**:
   In `src/main/resources/application.properties`, configure your database and other environment variables.

4. **Run the application**:
   To run the Spring Boot application, use the following command:
   ```bash
   mvn spring-boot:run
   ```

   Or run it directly from your IDE.

5. **Access the API**:
   The API will be available at `http://localhost:9090` (default port). You can use Postman or any API client to test the endpoints.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to your branch (`git push origin feature/your-feature-name`).
5. Create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---