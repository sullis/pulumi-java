// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.chatbot.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSlackChannelConfigurationResult {
    private final @Nullable String arn;
    private final @Nullable List<String> guardrailPolicies;
    private final @Nullable String iamRoleArn;
    private final @Nullable String loggingLevel;
    private final @Nullable String slackChannelId;
    private final @Nullable List<String> snsTopicArns;
    private final @Nullable Boolean userRoleRequired;

    @OutputCustomType.Constructor({"arn","guardrailPolicies","iamRoleArn","loggingLevel","slackChannelId","snsTopicArns","userRoleRequired"})
    private GetSlackChannelConfigurationResult(
        @Nullable String arn,
        @Nullable List<String> guardrailPolicies,
        @Nullable String iamRoleArn,
        @Nullable String loggingLevel,
        @Nullable String slackChannelId,
        @Nullable List<String> snsTopicArns,
        @Nullable Boolean userRoleRequired) {
        this.arn = arn;
        this.guardrailPolicies = guardrailPolicies;
        this.iamRoleArn = iamRoleArn;
        this.loggingLevel = loggingLevel;
        this.slackChannelId = slackChannelId;
        this.snsTopicArns = snsTopicArns;
        this.userRoleRequired = userRoleRequired;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<String> getGuardrailPolicies() {
        return this.guardrailPolicies == null ? List.of() : this.guardrailPolicies;
    }
    public Optional<String> getIamRoleArn() {
        return Optional.ofNullable(this.iamRoleArn);
    }
    public Optional<String> getLoggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }
    public Optional<String> getSlackChannelId() {
        return Optional.ofNullable(this.slackChannelId);
    }
    public List<String> getSnsTopicArns() {
        return this.snsTopicArns == null ? List.of() : this.snsTopicArns;
    }
    public Optional<Boolean> getUserRoleRequired() {
        return Optional.ofNullable(this.userRoleRequired);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSlackChannelConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<String> guardrailPolicies;
        private @Nullable String iamRoleArn;
        private @Nullable String loggingLevel;
        private @Nullable String slackChannelId;
        private @Nullable List<String> snsTopicArns;
        private @Nullable Boolean userRoleRequired;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSlackChannelConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.guardrailPolicies = defaults.guardrailPolicies;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.slackChannelId = defaults.slackChannelId;
    	      this.snsTopicArns = defaults.snsTopicArns;
    	      this.userRoleRequired = defaults.userRoleRequired;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setGuardrailPolicies(@Nullable List<String> guardrailPolicies) {
            this.guardrailPolicies = guardrailPolicies;
            return this;
        }

        public Builder setIamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }

        public Builder setLoggingLevel(@Nullable String loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public Builder setSlackChannelId(@Nullable String slackChannelId) {
            this.slackChannelId = slackChannelId;
            return this;
        }

        public Builder setSnsTopicArns(@Nullable List<String> snsTopicArns) {
            this.snsTopicArns = snsTopicArns;
            return this;
        }

        public Builder setUserRoleRequired(@Nullable Boolean userRoleRequired) {
            this.userRoleRequired = userRoleRequired;
            return this;
        }

        public GetSlackChannelConfigurationResult build() {
            return new GetSlackChannelConfigurationResult(arn, guardrailPolicies, iamRoleArn, loggingLevel, slackChannelId, snsTopicArns, userRoleRequired);
        }
    }
}
