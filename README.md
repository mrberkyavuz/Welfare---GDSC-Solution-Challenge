# Welfare - Dont waste it, share it.</p>

## Table of Contents
|   |   |
|---|---|
| [1. Overview](#overview) | [6. Actions](#actions) |
| [2. Technologies](#technologies) | [7. Profile](#profile) |
| [3. Features](#features) | [8. Permissions](#permissions) |
| [4. Authentication](#authentication) | [9. Dependencies](#dependencies) |
| [5. Homepage](#homepage) | [10. Demo](#demo) |


  <img src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/adaf7f36-7212-4c83-94f5-b161e8dd69db" alt="SC logo design">



## Overview

Welfare is an application designed as a money-free sharing platform, facilitating the exchange of unused items among individuals in need. Users can offer their surplus items and also discover items they require, fostering a sustainable approach to resource utilization. By promoting the exchange of second-hand goods using application points, the app contributes to environmental protection, waste reduction, and community sharing. Our project participated in the GDSC Solution Challenge 2024, aiming to address the United Nations' Sustainable Development Goals (SDGs), specifically targeting **No Poverty** and **Responsible Consumption & Production**.



<p align="center">
  <img src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/7183dd94-f4e2-4522-b6ef-2f847f4463d8" alt="Solution Challenge">
</p>


## Technologies

| Technology | Description |
|------------|-------------|
| **Google Maps** | Integration for location-based services. |
| **Retrofit** | Used for handling RESTful API requests. |
| **Room** | Android SQLite database library for local data storage. |
| **MVVM Architecture** | Adopted to ensure a clear separation of concerns and facilitate maintainability and scalability. |

## Features

1. **Compatibility with Our Website:** We ensure seamless login and registration processes that are compatible with our [website](http://app.welfare.ws). It's essential to capture your real-time location during registration. Products near your location will be displayed on the homepage to facilitate easy shopping. We aim to make product browsing easier by allowing you to filter products by tags such as "Phone, Dress, Guitar." You can preview all categories on a separate screen by clicking on the category selection icon at the top left.

2. **Interactive Homepage:** Upon successful login, products available for lottery based on your city will be listed on the homepage. You can also check the status of your recent lottery entries. Additionally, you can search for products by tags, and by selecting a category, you can view products in that category.

3. **Product Details Page:** When viewing a product, you can see its description, the cost in points needed to participate in the lottery, the current number of participants, the minimum number of participants required for the lottery to start, the seller's rating, and the detailed Google Maps location. You can choose to participate in the lottery or add the product to your favorites without participating.

4. **Actions Section:** In this section, you can view all lottery entries you've participated in and their statuses. If you're a seller, you can also view a list of all your sales, along with their statuses. You can add new products by clicking on the plus icon at the bottom.

5. **Product Management:** When adding a new product, you can specify its type and category by selecting predefined tags. You can then write the product description. After selecting product photos from your phone's gallery, the product's location and address will be automatically determined using the phone's location data.

6. **Profile Section:** Here, you can view your profile information, including your average seller rating. You can also update your information, change your password, and update your location. Additionally, you can view and manage your favorites list and donations.

7. **Donations:** In the Donations section, brands can display special product campaigns where users can donate products in bulk. We plan to incorporate this feature into the homepage as a campaign in the future.

8. **Logout:** Finally, you can log out of the application by clicking on the logout button.

## Authentication



<div style="display: flex; flex-wrap: wrap;">
    <img width="200" alt="welfare1" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/bfb9b65f-3062-42c2-855e-1e85057fe7c0">
    <img width="200" alt="welfare2" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/b39e2475-898a-423d-a4e3-c572c5452f33">
    <img width="200" alt="welfare3" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/6dc634ff-12a1-434b-a80c-cf3e50bbcecf">
    <img width="200" alt="welfare4" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/4519878e-7b9f-4905-9dba-98eb576b8b7a">
</div>

## Homepage


<div style="display: flex; flex-wrap: wrap;">
    <img width="200" alt="welfare5_1" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/6063a323-09c5-4897-b013-df4fc4ff6b2d">
    <img width="200" alt="welfare5_2" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/524c8f0a-77b1-4746-9c75-3fb5903c4c27">
    <img width="200" alt="welfare5_3" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/be0581b0-99e9-4798-9c0b-8be0c22480c1">
    <img width="200" alt="welfare5_4" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/a1a1cef5-926a-4124-9221-9c7c379ea436">
</div>

## Actions


<div style="display: flex; flex-wrap: wrap;">

  <img width="200" alt="welfare6 1" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/b02b24d5-a053-45d3-b92d-d8ab1ae07677">
  <img width="200" alt="welfare6 2" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/790a659f-d451-4e45-951e-c1a5920c87ee">
  <img width="200" alt="welfare6 3" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/905028b9-e17a-4c04-8b52-0fab1ad20e51">
  <img width="200" alt="welfare6 4" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/20a4b33d-215e-42cb-94b1-0d359d10f49d">
</div>

## Profile


<div style="display: flex; flex-wrap: wrap;">
      <img width="200" alt="welfare7 1" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/2f27d683-005c-4fce-ad76-6dd45009fd8b">
      <img width="200" alt="welfare7 2" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/8b165fdb-892e-45d4-a3cc-f24d15e2fc24">
      <img width="200" alt="welfare7 3" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/1323ccdc-0b38-47e9-bef4-cd9a25034f8f">
      <img width="200" alt="welfare7 4" src="https://github.com/gdsckou/Solution-Challange-Kotlin/assets/116732291/772d11ba-d7c8-41b7-b3ac-7be2ca7beeb4">

</div>


## Permissions

```xml
<uses-permission android:name="android.permission.INTERNET" /> 
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" /> 
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.READ_MEDIA_IMAGES" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

```
  
## Dependencies

```kotlin
dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.gms:play-services-location:21.1.0")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    val nav_version = "2.7.6"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    val  room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    ksp("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.17")
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("com.github.bumptech.glide:glide:4.15.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation("com.google.android.gms:play-services-location:18.0.0")
}
```


## Demo

[Click here for our demo video](https://www.youtube.com/watch?v=oYDCdbKiqoI)












