# RecyclerViewDemo App

## Overview
This simple Android app, RecyclerViewDemo, was created to learn and implement the RecyclerView functionality in Android development. The app displays a list of fruits with their respective suppliers using a RecyclerView.

## Features
- Displays a list of fruits and their suppliers.
- Clicking on an item shows a toast message with the fruit's name and supplier.

## Implementation

### `myRecyclerViewAdapter`
- Adapter class responsible for managing the data and creating ViewHolders for the RecyclerView.
- Binds data to the ViewHolder.

### `MyViewHolder`
- ViewHolder class that holds references to the views in the list item layout.
- Binds the data to the views and sets a click listener to display a toast message.

### `MainActivity`
- Main activity of the app.
- Initializes the list of fruits.
- Sets up the RecyclerView with a LinearLayoutManager and the custom adapter.

### `Fruit` data class
- Represents the data structure for a fruit, including its name and supplier.

## Usage
1. Clone the repository.
2. Open the project in Android Studio.
3. Run the app on an Android emulator or device.

## Dependencies
- None

## Notes
- This app is a basic implementation of RecyclerView in Android using Kotlin.
- Feel free to explore and modify the code to enhance your understanding of RecyclerView and Android development.

Happy coding! 🚀

## Screenshots
