package dev.pinky.twitterfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.pinky.twitterfeed.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweetsFeed()

    }


    fun displayTweetsFeed () {
        var post1 = Tweet("Susan","@NakimuliSusan","don't let what you cant control poison you"
        ,"",234,"",123,"",1000,"")
        var post2 = Tweet("Brenda","@MurugiBrenda","Strong people don't put others down they lift them up"
            ,"",329,"",500,"",1389,"")
        var post3 = Tweet("Nasser","@NasserKaweesa","Never Stop learning because life never stops teaching"
            ,"",678,"",5000,"",1500,"")
        var post4 = Tweet("Valentine","@MummyVal","Pray for it,Plan for it , Work for it"
            ,"",278,"",389,"",1399,"")
        var post5 = Tweet("AkiraChix","@AkiraChix","Fetching talent where no-one can would ever think it would be"
            ,"",679,"",750,"",1009,"")
        var post6 = Tweet("BigBrotherNaija","@BBNaija","Keep your eyes grille because biggie is back !! #BBNaija S7"
            ,"",3290,"",50000,"",10389,"")

        var PostsList = listOf(post1,post2,post3,post4,post5,post6)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = TweetAdapter(PostsList)
    }
}