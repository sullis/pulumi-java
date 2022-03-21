// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiteTopicRetentionConfig {
    /**
     * The provisioned storage, in bytes, per partition. If the number of bytes stored
     * in any of the topic's partitions grows beyond this value, older messages will be
     * dropped to make room for newer ones, regardless of the value of period.
     * 
     */
    private final String perPartitionBytes;
    /**
     * How long a published message is retained. If unset, messages will be retained as
     * long as the bytes retained for each partition is below perPartitionBytes. A
     * duration in seconds with up to nine fractional digits, terminated by 's'.
     * Example: "3.5s".
     * 
     */
    private final @Nullable String period;

    @CustomType.Constructor
    private LiteTopicRetentionConfig(
        @CustomType.Parameter("perPartitionBytes") String perPartitionBytes,
        @CustomType.Parameter("period") @Nullable String period) {
        this.perPartitionBytes = perPartitionBytes;
        this.period = period;
    }

    /**
     * The provisioned storage, in bytes, per partition. If the number of bytes stored
     * in any of the topic's partitions grows beyond this value, older messages will be
     * dropped to make room for newer ones, regardless of the value of period.
     * 
    */
    public String getPerPartitionBytes() {
        return this.perPartitionBytes;
    }
    /**
     * How long a published message is retained. If unset, messages will be retained as
     * long as the bytes retained for each partition is below perPartitionBytes. A
     * duration in seconds with up to nine fractional digits, terminated by 's'.
     * Example: "3.5s".
     * 
    */
    public Optional<String> getPeriod() {
        return Optional.ofNullable(this.period);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicRetentionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String perPartitionBytes;
        private @Nullable String period;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicRetentionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perPartitionBytes = defaults.perPartitionBytes;
    	      this.period = defaults.period;
        }

        public Builder perPartitionBytes(String perPartitionBytes) {
            this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes);
            return this;
        }
        public Builder period(@Nullable String period) {
            this.period = period;
            return this;
        }        public LiteTopicRetentionConfig build() {
            return new LiteTopicRetentionConfig(perPartitionBytes, period);
        }
    }
}
