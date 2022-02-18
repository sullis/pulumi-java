// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleSnsAction {
    private final @Nullable String messageFormat;
    private final String roleArn;
    private final String targetArn;

    @OutputCustomType.Constructor({"messageFormat","roleArn","targetArn"})
    private TopicRuleSnsAction(
        @Nullable String messageFormat,
        String roleArn,
        String targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = Objects.requireNonNull(roleArn);
        this.targetArn = Objects.requireNonNull(targetArn);
    }

    public Optional<String> getMessageFormat() {
        return Optional.ofNullable(this.messageFormat);
    }
    public String getRoleArn() {
        return this.roleArn;
    }
    public String getTargetArn() {
        return this.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSnsAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String messageFormat;
        private String roleArn;
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSnsAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setMessageFormat(@Nullable String messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setTargetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public TopicRuleSnsAction build() {
            return new TopicRuleSnsAction(messageFormat, roleArn, targetArn);
        }
    }
}
