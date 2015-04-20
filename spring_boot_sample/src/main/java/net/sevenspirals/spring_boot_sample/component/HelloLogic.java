package net.sevenspirals.spring_boot_sample.component;

import java.util.ArrayList;
import java.util.List;

import net.sevenspirals.dbflute.exbhv.TweetBhv;
import net.sevenspirals.dbflute.exbhv.UserBhv;
import net.sevenspirals.dbflute.exentity.User;

import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloLogic {
	@Autowired
	private UserBhv userBhv;
	@Autowired
	private TweetBhv tweetBhv;

	public List<String> getEMailList() {
		ArrayList<String> result = new ArrayList<String>();

		ListResultBean<User> userList = userBhv.selectList(cb -> {
			cb.query().setEMail_Equal("syaku@sevenspirals.net");
		});

		userBhv.loadTweet(userList, cb -> {
		});

		for (User user : userList) {
			result.add(user.getEMail());
		}

		return result;
	}
}
