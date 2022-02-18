// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.ResourceSpecificLoggingLogLevel;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourceSpecificLoggingResult {
    /**
     * The log level for a specific target. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    private final @Nullable ResourceSpecificLoggingLogLevel logLevel;
    /**
     * Unique Id for a Target (TargetType:TargetName), this will be internally built to serve as primary identifier for a log target.
     * 
     */
    private final @Nullable String targetId;

    @OutputCustomType.Constructor({"logLevel","targetId"})
    private GetResourceSpecificLoggingResult(
        @Nullable ResourceSpecificLoggingLogLevel logLevel,
        @Nullable String targetId) {
        this.logLevel = logLevel;
        this.targetId = targetId;
    }

    /**
     * The log level for a specific target. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    public Optional<ResourceSpecificLoggingLogLevel> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }
    /**
     * Unique Id for a Target (TargetType:TargetName), this will be internally built to serve as primary identifier for a log target.
     * 
     */
    public Optional<String> getTargetId() {
        return Optional.ofNullable(this.targetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceSpecificLoggingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceSpecificLoggingLogLevel logLevel;
        private @Nullable String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceSpecificLoggingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logLevel = defaults.logLevel;
    	      this.targetId = defaults.targetId;
        }

        public Builder setLogLevel(@Nullable ResourceSpecificLoggingLogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setTargetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }

        public GetResourceSpecificLoggingResult build() {
            return new GetResourceSpecificLoggingResult(logLevel, targetId);
        }
    }
}
