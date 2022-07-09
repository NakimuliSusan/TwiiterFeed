package dev.pinky.twitterfeed

data class Tweet(
    var name : String,
    var handle : String,
    var tweet : String,
    var comments : String,
    var replies: Int,
    var retweet :String,
    var retweets :Int,
    var likes : String,
    var numberLikes : Int,
    var share : String
)
