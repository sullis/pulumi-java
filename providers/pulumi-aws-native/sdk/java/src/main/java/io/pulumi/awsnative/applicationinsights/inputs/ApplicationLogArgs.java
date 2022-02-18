// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationLogEncoding;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A log to be monitored for the component.
 * 
 */
public final class ApplicationLogArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationLogArgs Empty = new ApplicationLogArgs();

    /**
     * The type of encoding of the logs to be monitored.
     * 
     */
    @InputImport(name="encoding")
    private final @Nullable Input<ApplicationLogEncoding> encoding;

    public Input<ApplicationLogEncoding> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    @InputImport(name="logGroupName")
    private final @Nullable Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName == null ? Input.empty() : this.logGroupName;
    }

    /**
     * The path of the logs to be monitored.
     * 
     */
    @InputImport(name="logPath")
    private final @Nullable Input<String> logPath;

    public Input<String> getLogPath() {
        return this.logPath == null ? Input.empty() : this.logPath;
    }

    /**
     * The log type decides the log patterns against which Application Insights analyzes the log.
     * 
     */
    @InputImport(name="logType", required=true)
    private final Input<String> logType;

    public Input<String> getLogType() {
        return this.logType;
    }

    /**
     * The name of the log pattern set.
     * 
     */
    @InputImport(name="patternSet")
    private final @Nullable Input<String> patternSet;

    public Input<String> getPatternSet() {
        return this.patternSet == null ? Input.empty() : this.patternSet;
    }

    public ApplicationLogArgs(
        @Nullable Input<ApplicationLogEncoding> encoding,
        @Nullable Input<String> logGroupName,
        @Nullable Input<String> logPath,
        Input<String> logType,
        @Nullable Input<String> patternSet) {
        this.encoding = encoding;
        this.logGroupName = logGroupName;
        this.logPath = logPath;
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
        this.patternSet = patternSet;
    }

    private ApplicationLogArgs() {
        this.encoding = Input.empty();
        this.logGroupName = Input.empty();
        this.logPath = Input.empty();
        this.logType = Input.empty();
        this.patternSet = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationLogEncoding> encoding;
        private @Nullable Input<String> logGroupName;
        private @Nullable Input<String> logPath;
        private Input<String> logType;
        private @Nullable Input<String> patternSet;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logPath = defaults.logPath;
    	      this.logType = defaults.logType;
    	      this.patternSet = defaults.patternSet;
        }

        public Builder setEncoding(@Nullable Input<ApplicationLogEncoding> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable ApplicationLogEncoding encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setLogGroupName(@Nullable Input<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = Input.ofNullable(logGroupName);
            return this;
        }

        public Builder setLogPath(@Nullable Input<String> logPath) {
            this.logPath = logPath;
            return this;
        }

        public Builder setLogPath(@Nullable String logPath) {
            this.logPath = Input.ofNullable(logPath);
            return this;
        }

        public Builder setLogType(Input<String> logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Input.of(Objects.requireNonNull(logType));
            return this;
        }

        public Builder setPatternSet(@Nullable Input<String> patternSet) {
            this.patternSet = patternSet;
            return this;
        }

        public Builder setPatternSet(@Nullable String patternSet) {
            this.patternSet = Input.ofNullable(patternSet);
            return this;
        }

        public ApplicationLogArgs build() {
            return new ApplicationLogArgs(encoding, logGroupName, logPath, logType, patternSet);
        }
    }
}
