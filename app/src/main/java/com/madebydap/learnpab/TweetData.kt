package com.madebydap.learnpab

data class TweetData(
    val id: Int,
    val content: String,
    val senderId: Int
)

val tweets = listOf<TweetData>(
    TweetData(
        id = 1,
        content = "I got a new job!",
        senderId = 1
    ),
    TweetData(
        id = 2,
        content = "Love this new feature!",
        senderId = 1
    ),
    TweetData(
        id = 3,
        content = "Nice red perch I got here!",
        senderId = 2
    ),
    TweetData(
        id = 4,
        content = "Who needs a rent?",
        senderId = 3
    ),
    TweetData(
        id = 5,
        content = "Go read this cool website: deezen.com",
        senderId = 4
    ),
    TweetData(
        id = 6,
        content = "Taco is the best",
        senderId = 6
    )
)
