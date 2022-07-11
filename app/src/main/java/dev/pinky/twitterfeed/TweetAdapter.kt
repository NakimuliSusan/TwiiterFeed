package dev.pinky.twitterfeed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetAdapter (var Posts : List<Tweet>):
    RecyclerView.Adapter<TweetViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return TweetViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentPost = Posts.get(position)
        holder.tvName.text = currentPost.name
        holder.tvHandle.text = currentPost.handle
        holder.tvTweet.text = currentPost.tweet
        holder.tvCount1.text = currentPost.replies.toString()
        holder.tvCount2.text = currentPost.retweets.toString()
        holder.tvCount3.text = currentPost.numberLikes.toString()
        holder.imgLike.setOnClickListener {
            holder.imgLike.setImageResource(R.drawable.ic_baseline_favorite_24)
        }

    }

    override fun getItemCount(): Int {
        return Posts.size
    }
}
class TweetViewHolder (itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var tvCount1 = itemView.findViewById<TextView>(R.id.tvCount1)
    var tvCount2 = itemView.findViewById<TextView>(R.id.tvCount2)
    var tvCount3 = itemView.findViewById<TextView>(R.id.tvCount3)
    var imgProfile = itemView.findViewById<ImageView>(R.id.imgProfile)
    var imgRetweet = itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgComments = itemView.findViewById<ImageView>(R.id.imgComments)
    var imgLike = itemView.findViewById<ImageView>(R.id.imgLike)
    var imgShare = itemView.findViewById<ImageView>(R.id.imgShare)


}