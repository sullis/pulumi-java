// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTrackerResult {
    private final @Nullable String arn;
    private final @Nullable String createTime;
    private final @Nullable String trackerArn;
    private final @Nullable String updateTime;

    @OutputCustomType.Constructor
    private GetTrackerResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("createTime") @Nullable String createTime,
        @OutputCustomType.Parameter("trackerArn") @Nullable String trackerArn,
        @OutputCustomType.Parameter("updateTime") @Nullable String updateTime) {
        this.arn = arn;
        this.createTime = createTime;
        this.trackerArn = trackerArn;
        this.updateTime = updateTime;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    public Optional<String> getTrackerArn() {
        return Optional.ofNullable(this.trackerArn);
    }
    public Optional<String> getUpdateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrackerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createTime;
        private @Nullable String trackerArn;
        private @Nullable String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrackerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createTime = defaults.createTime;
    	      this.trackerArn = defaults.trackerArn;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setTrackerArn(@Nullable String trackerArn) {
            this.trackerArn = trackerArn;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public GetTrackerResult build() {
            return new GetTrackerResult(arn, createTime, trackerArn, updateTime);
        }
    }
}
