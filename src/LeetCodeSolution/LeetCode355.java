package LeetCodeSolution;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class LeetCode355 {
	class Twitter_one{
		int id;
		long timestamp;
		
		public Twitter_one(int id, long timestamp) {
			super();
			this.id = id;
			this.timestamp = timestamp;
		}
		public Integer getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Long getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}
		
	}
	class Twitter {
		long tweetIdLong = 0;
		Map<Integer,LinkedList<Twitter_one>> postMap;
		Map<Integer,HashSet<Integer>> followMap;
	    /** Initialize your data structure here. */
	    public Twitter() {
	    	postMap = new HashMap<>();
	    	followMap = new HashMap<>();
	    }
	    
	    /** Compose a new tweet. */
	    public void postTweet(int userId, int tweetId) {
	    	LinkedList<Twitter_one> s = postMap.getOrDefault(userId,new LinkedList<>());
	    	s.add(new Twitter_one(tweetId,tweetIdLong++));
	    	postMap.put(userId, s);
	    }
	    
	    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
	    public List<Integer> getNewsFeed(int userId) {
	    	LinkedList<Twitter_one> list = postMap.getOrDefault(userId,new LinkedList<>());
	    	PriorityQueue<Twitter_one> pq =new PriorityQueue<>((t1,t2)->Long.compare(t1.timestamp, t2.timestamp));
	    	for (Twitter_one twitter_one : list) {
				pq.add(twitter_one);
				if(pq.size()>10)
					pq.poll();
			}
	    	for (Integer id :followMap.getOrDefault(userId,null)) {
	    		for (Twitter_one twitter_one : postMap.getOrDefault(id,new LinkedList<>())) {
					pq.add(twitter_one);
					if(pq.size()>10)
						pq.poll();
				}
			}
	    	List<Twitter_one> res= new ArrayList<Twitter_one>();
	    	if(pq.size()>0)
	    	for (Twitter_one integer : pq) {
	    		res.add(integer);
			}
	    	Collections.sort(res,new Comparator<Twitter_one>() {

				@Override
				public int compare(Twitter_one o1, Twitter_one o2) {
					// TODO Auto-generated method stub
					return Long.compare(o2.timestamp, o1.timestamp);
				}
			});
	    	List<Integer> res1= new ArrayList<Integer>();
	    	for (int i = 0; i < res.size(); i++) {
				res1.add(res.get(i).getId());
			}
	    	return res1;
	    }
	    
	    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
	    public void follow(int followerId, int followeeId) {
	    	HashSet<Integer> set = followMap.getOrDefault(followerId, new HashSet<>());
	    	if(followerId != followeeId)
	    	set.add(followeeId);
	    	followMap.put(followerId, set);
	    }
	    
	    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
	    public void unfollow(int followerId, int followeeId) {
	    	HashSet<Integer> set = followMap.getOrDefault(followerId, new HashSet<>());
	    	set.remove(followeeId);
	    	followMap.put(followerId, set);
	    }
	}

	/**
	 * Your Twitter object will be instantiated and called as such:
	 * Twitter obj = new Twitter();
	 * obj.postTweet(userId,tweetId);
	 * List<Integer> param_2 = obj.getNewsFeed(userId);
	 * obj.follow(followerId,followeeId);
	 * obj.unfollow(followerId,followeeId);
	 */
}
