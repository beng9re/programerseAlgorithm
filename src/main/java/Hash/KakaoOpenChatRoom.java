package Hash;


import java.util.*;

public class KakaoOpenChatRoom {

	private final String ENTER = "Enter";
	private final String LEAVE = "Leave";
	private final String CHANGE = "Change";

	private static class UserInfo {
		private String name;
		private String userId;

		public UserInfo(String[] info) {
			this.userId = info[1];
			this.name = info[2];
		}
	}

	private static class userCommand {

		private String command;
		private String id;

		public userCommand(String[] info) {
			this.id = info[1];
			this.command = getCommandMessage(info[0]);
		}
		private String getCommandMessage(String command){
			switch (command) {
				case "Enter": return "들어왔습니다.";
				case "Leave": return "나갔습니다.";
			}
			return "";
		}

		public String nickNameMessage (String nickName) {
			return nickName + "님이 " + this.command;
		}
	}


	public String[] solution(String[] records) {
		Map<String,UserInfo> userInfoMap = new HashMap<>();
		List<userCommand> userCommands = new ArrayList<>();

		for (var recode : records) {
			String[] data = recode.split(" ");
			if (!LEAVE.equals(data[0])) {
				UserInfo userInfo = new UserInfo(data);
				userInfoMap.put(userInfo.userId, userInfo);
			}
			if (!CHANGE.equals(data[0])) {
				userCommands.add(new userCommand(data));
			}

		}


		return userCommands.stream()
				.map((userCommand)-> userCommand.nickNameMessage(
						userInfoMap.get(userCommand.id).name)
				)
				.toArray(String[]::new);
	}
}
