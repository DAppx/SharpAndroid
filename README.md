# SharpAndroid

#Notes

#Content

#Screens

#Summary

#Technologies
The following are brief descriptions of the technologies used
##MVP
MVP (Model View Presenter) pattern is a derivative from the well known MVC (Model View Controller), which for a while now is gaining importance in the development of Android applications.
* MVP pattern:<http://antonioleiva.com/mvp-android> ...

##Networking
### [RXJava](https://github.com/ReactiveX/RxJava)
RxJava – Reactive Extensions for the JVM – a library for composing asynchronous and event-based programs using observable sequences for the Java VM.
### [Retrofit2](https://github.com/square/retrofit)
Type-safe HTTP client for Android and Java by Square, Inc. http://square.github.io/retrofit/
### [OkHttp3](https://github.com/square/okhttp)
An HTTP+HTTP/2 client for Android and Java applications. http://square.github.io/okhttp/
##Dependency Injector
###[AndroidAnnotations](https://github.com/androidannotations/androidannotations)
AndroidAnnotations is an Open Source framework that speeds up Android development. It takes care of the plumbing, and lets you concentrate on what's really important. By simplifying your code, it facilitates its maintenance.
### [Dagger2](http://google.github.io/dagger/)
Dagger is a fully static, compile-time dependency injection framework for both Java and Android. It is an adaptation of an earlier version created by Square and now maintained by Google.
###[Butter Knife](https://github.com/JakeWharton/butterknife)
Field and method binding for Android views which uses annotation processing to generate boilerplate code for you.
 * Eliminate findViewById calls by using @BindView on fields.
 * Group multiple views in a list or array. Operate on all of them at once with actions, setters, or properties.  * Eliminate anonymous inner-classes for listeners by annotating methods with @OnClick and others.
 * Eliminate resource lookups by using resource annotations on fields

##O/R Mapping ,DB,NoSQL
### [SQLBrite](https://github.com/square/sqlbrite)
A lightweight wrapper around SQLiteOpenHelper which introduces reactive stream semantics to SQL operations.

###[Realm](https://github.com/realm/realm-java)
Realm is a mobile database: a replacement for SQLite & ORMs http://realm.io

## Pub/Sub
###[RxBus]()
Event Bus By RxJava.
RxBus support annotations(@produce/@subscribe), and it can provide you to produce/subscribe on other thread like MAIN_THREAD, NEW_THREAD, IO, COMPUTATION, TRAMPOLINE, IMMEDIATE, even the EXECUTOR and HANDLER thread, more in EventThread.
###[EventBus](https://github.com/greenrobot/EventBus)
Android optimized event bus that simplifies communication between Activities, Fragments, Threads, Services, etc. Less code, better quality.

##Auto
###[AutoValue](https://github.com/google/auto)
A collection of source code generators for Java.
###[auto-value-gson](https://github.com/rharter/auto-value-gson)
AutoValue Extension to add Gson De/Serializer support

##Logger
### [Timber](https://github.com/JakeWharton/timber)
A logger with a small, extensible API which provides utility on top of Android's normal Log class
##Image Loader
###[Glide](https://github.com/bumptech/glide)
An image loading and caching library for Android focused on smooth scrolling
## UI/UX
###[Material Design]()
  Android Design Support Library

### [RxAndroid](https://github.com/ReactiveX/RxAndroid)
Android specific bindings for RxJava.
This module adds the minimum classes to RxJava that make writing reactive components in Android applications easy and hassle-free. More specifically, it provides a Scheduler that schedules on the main thread or any given Looper.


###[Material-Dialogs](https://github.com/afollestad/material-dialogs)
 A beautiful, fluid, and customizable dialogs API. https://aidanfollestad.com
###[MaterialDrawer](https://github.com/mikepenz/MaterialDrawer)
The flexible, easy to use, all in one drawer library for your Android project
###[Android-Iconics](https://github.com/mikepenz/Android-Iconics)
Android-Iconics - Use any icon font, or vector (.svg) as drawable in your application;
* This library allows you to include vector icons everywhere in your project. No limits are given. Scale with no limit, use any color at any time, provide a contour, and many additional customizations.

### [FastAdapter](https://github.com/mikepenz/FastAdapter)
The bullet proof, fast and easy to use adapter library, which minimizes developing time to a fraction.

###[ImagePicker](https://github.com/jeasonlzy/ImagePicker)
an imagePicker for android ,with it,you can select single or multiple image,crop it for avatar,take a photo and use it,preview and zoom etc.

###[NineGridView](https://github.com/jeasonlzy/NineGridView)
A custom widget for Android, which uesd for showing grid pictures.

##Testing

