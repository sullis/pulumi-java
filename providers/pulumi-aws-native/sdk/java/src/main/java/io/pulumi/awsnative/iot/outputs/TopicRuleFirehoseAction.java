// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleFirehoseAction {
    private final @Nullable Boolean batchMode;
    private final String deliveryStreamName;
    private final String roleArn;
    private final @Nullable String separator;

    @CustomType.Constructor
    private TopicRuleFirehoseAction(
        @CustomType.Parameter("batchMode") @Nullable Boolean batchMode,
        @CustomType.Parameter("deliveryStreamName") String deliveryStreamName,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("separator") @Nullable String separator) {
        this.batchMode = batchMode;
        this.deliveryStreamName = deliveryStreamName;
        this.roleArn = roleArn;
        this.separator = separator;
    }

    public Optional<Boolean> getBatchMode() {
        return Optional.ofNullable(this.batchMode);
    }
    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }
    public String getRoleArn() {
        return this.roleArn;
    }
    public Optional<String> getSeparator() {
        return Optional.ofNullable(this.separator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleFirehoseAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean batchMode;
        private String deliveryStreamName;
        private String roleArn;
        private @Nullable String separator;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleFirehoseAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchMode = defaults.batchMode;
    	      this.deliveryStreamName = defaults.deliveryStreamName;
    	      this.roleArn = defaults.roleArn;
    	      this.separator = defaults.separator;
        }

        public Builder batchMode(@Nullable Boolean batchMode) {
            this.batchMode = batchMode;
            return this;
        }
        public Builder deliveryStreamName(String deliveryStreamName) {
            this.deliveryStreamName = Objects.requireNonNull(deliveryStreamName);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder separator(@Nullable String separator) {
            this.separator = separator;
            return this;
        }        public TopicRuleFirehoseAction build() {
            return new TopicRuleFirehoseAction(batchMode, deliveryStreamName, roleArn, separator);
        }
    }
}
