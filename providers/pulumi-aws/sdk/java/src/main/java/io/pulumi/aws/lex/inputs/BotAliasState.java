// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.BotAliasConversationLogsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotAliasState extends io.pulumi.resources.ResourceArgs {

    public static final BotAliasState Empty = new BotAliasState();

    /**
     * The ARN of the bot alias.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The name of the bot.
     * 
     */
    @Import(name="botName")
      private final @Nullable Output<String> botName;

    public Output<String> botName() {
        return this.botName == null ? Codegen.empty() : this.botName;
    }

    /**
     * The name of the bot.
     * 
     */
    @Import(name="botVersion")
      private final @Nullable Output<String> botVersion;

    public Output<String> botVersion() {
        return this.botVersion == null ? Codegen.empty() : this.botVersion;
    }

    /**
     * Checksum of the bot alias.
     * 
     */
    @Import(name="checksum")
      private final @Nullable Output<String> checksum;

    public Output<String> checksum() {
        return this.checksum == null ? Codegen.empty() : this.checksum;
    }

    /**
     * The settings that determine how Amazon Lex uses conversation logs for the alias. Attributes are documented under conversation_logs.
     * 
     */
    @Import(name="conversationLogs")
      private final @Nullable Output<BotAliasConversationLogsGetArgs> conversationLogs;

    public Output<BotAliasConversationLogsGetArgs> conversationLogs() {
        return this.conversationLogs == null ? Codegen.empty() : this.conversationLogs;
    }

    /**
     * The date that the bot alias was created.
     * 
     */
    @Import(name="createdDate")
      private final @Nullable Output<String> createdDate;

    public Output<String> createdDate() {
        return this.createdDate == null ? Codegen.empty() : this.createdDate;
    }

    /**
     * A description of the alias. Must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
     * 
     */
    @Import(name="lastUpdatedDate")
      private final @Nullable Output<String> lastUpdatedDate;

    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate == null ? Codegen.empty() : this.lastUpdatedDate;
    }

    /**
     * The name of the alias. The name is not case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public BotAliasState(
        @Nullable Output<String> arn,
        @Nullable Output<String> botName,
        @Nullable Output<String> botVersion,
        @Nullable Output<String> checksum,
        @Nullable Output<BotAliasConversationLogsGetArgs> conversationLogs,
        @Nullable Output<String> createdDate,
        @Nullable Output<String> description,
        @Nullable Output<String> lastUpdatedDate,
        @Nullable Output<String> name) {
        this.arn = arn;
        this.botName = botName;
        this.botVersion = botVersion;
        this.checksum = checksum;
        this.conversationLogs = conversationLogs;
        this.createdDate = createdDate;
        this.description = description;
        this.lastUpdatedDate = lastUpdatedDate;
        this.name = name;
    }

    private BotAliasState() {
        this.arn = Codegen.empty();
        this.botName = Codegen.empty();
        this.botVersion = Codegen.empty();
        this.checksum = Codegen.empty();
        this.conversationLogs = Codegen.empty();
        this.createdDate = Codegen.empty();
        this.description = Codegen.empty();
        this.lastUpdatedDate = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> botName;
        private @Nullable Output<String> botVersion;
        private @Nullable Output<String> checksum;
        private @Nullable Output<BotAliasConversationLogsGetArgs> conversationLogs;
        private @Nullable Output<String> createdDate;
        private @Nullable Output<String> description;
        private @Nullable Output<String> lastUpdatedDate;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.botName = defaults.botName;
    	      this.botVersion = defaults.botVersion;
    	      this.checksum = defaults.checksum;
    	      this.conversationLogs = defaults.conversationLogs;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.name = defaults.name;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder botName(@Nullable Output<String> botName) {
            this.botName = botName;
            return this;
        }
        public Builder botName(@Nullable String botName) {
            this.botName = Codegen.ofNullable(botName);
            return this;
        }
        public Builder botVersion(@Nullable Output<String> botVersion) {
            this.botVersion = botVersion;
            return this;
        }
        public Builder botVersion(@Nullable String botVersion) {
            this.botVersion = Codegen.ofNullable(botVersion);
            return this;
        }
        public Builder checksum(@Nullable Output<String> checksum) {
            this.checksum = checksum;
            return this;
        }
        public Builder checksum(@Nullable String checksum) {
            this.checksum = Codegen.ofNullable(checksum);
            return this;
        }
        public Builder conversationLogs(@Nullable Output<BotAliasConversationLogsGetArgs> conversationLogs) {
            this.conversationLogs = conversationLogs;
            return this;
        }
        public Builder conversationLogs(@Nullable BotAliasConversationLogsGetArgs conversationLogs) {
            this.conversationLogs = Codegen.ofNullable(conversationLogs);
            return this;
        }
        public Builder createdDate(@Nullable Output<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Codegen.ofNullable(createdDate);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }
        public Builder lastUpdatedDate(@Nullable String lastUpdatedDate) {
            this.lastUpdatedDate = Codegen.ofNullable(lastUpdatedDate);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public BotAliasState build() {
            return new BotAliasState(arn, botName, botVersion, checksum, conversationLogs, createdDate, description, lastUpdatedDate, name);
        }
    }
}
