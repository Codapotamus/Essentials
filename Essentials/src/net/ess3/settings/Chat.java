package net.ess3.settings;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.ess3.storage.Comment;
import net.ess3.storage.StorageObject;


@Data
@EqualsAndHashCode(callSuper = false)
public class Chat implements StorageObject
{
	@Comment("The character(s) to prefix all nicknames, so that you know they are not true usernames.")
	private String nicknamePrefix = "~";
	@Comment(
			{
					"Disable this if you have any other plugin, that modifies the displayname of a user.",
					"If it is not set, it will be enabled if EssentialsChat is installed, otherwise not."
			})
	private Boolean changeDisplayname;
	private String displaynameFormat = "{PREFIX}{NICKNAMEPREFIX}{NAME}{SUFFIX}";
	@Comment(
			{
					"If EssentialsChat is installed, this will define how far a player's voice travels, in blocks.  Set to 0 to make all chat global.",
					"Note that users with the \"essentials.chat.spy\" permission will hear everything, regardless of this setting.",
					"Users with essentials.chat.shout can override this by prefixing text with an exclamation mark (!)",
					"Or with essentials.chat.question can override this by prefixing text with a question mark (?)",
					"You can add command costs for shout/question by adding chat-shout and chat-question to the command costs section."
			})
	private int localRadius = 0;
	@Comment("Set the default chat format here, it will be overwritten by group specific chat formats.")
	private String defaultFormat = "&7[{GROUP}]&f {DISPLAYNAME}&7:&f {MESSAGE}";
	@Comment("Set the maximum length a nick can be. Set to -1 to disable. Note: formatting characters do not count.")
	private long MaxNickLength = 25;
}
