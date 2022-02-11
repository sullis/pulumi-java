// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.outputs;

import io.pulumi.awsnative.robomaker.outputs.RobotApplicationRobotSoftwareSuite;
import io.pulumi.awsnative.robomaker.outputs.RobotApplicationSourceConfig;
import io.pulumi.awsnative.robomaker.outputs.RobotApplicationTags;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRobotApplicationResult {
    private final @Nullable String arn;
    private final @Nullable String currentRevisionId;
    private final @Nullable String environment;
    private final @Nullable RobotApplicationRobotSoftwareSuite robotSoftwareSuite;
    private final @Nullable List<RobotApplicationSourceConfig> sources;
    private final @Nullable RobotApplicationTags tags;

    @OutputCustomType.Constructor({"arn","currentRevisionId","environment","robotSoftwareSuite","sources","tags"})
    private GetRobotApplicationResult(
        @Nullable String arn,
        @Nullable String currentRevisionId,
        @Nullable String environment,
        @Nullable RobotApplicationRobotSoftwareSuite robotSoftwareSuite,
        @Nullable List<RobotApplicationSourceConfig> sources,
        @Nullable RobotApplicationTags tags) {
        this.arn = arn;
        this.currentRevisionId = currentRevisionId;
        this.environment = environment;
        this.robotSoftwareSuite = robotSoftwareSuite;
        this.sources = sources;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getCurrentRevisionId() {
        return Optional.ofNullable(this.currentRevisionId);
    }
    public Optional<String> getEnvironment() {
        return Optional.ofNullable(this.environment);
    }
    public Optional<RobotApplicationRobotSoftwareSuite> getRobotSoftwareSuite() {
        return Optional.ofNullable(this.robotSoftwareSuite);
    }
    public List<RobotApplicationSourceConfig> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }
    public Optional<RobotApplicationTags> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRobotApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String currentRevisionId;
        private @Nullable String environment;
        private @Nullable RobotApplicationRobotSoftwareSuite robotSoftwareSuite;
        private @Nullable List<RobotApplicationSourceConfig> sources;
        private @Nullable RobotApplicationTags tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRobotApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.currentRevisionId = defaults.currentRevisionId;
    	      this.environment = defaults.environment;
    	      this.robotSoftwareSuite = defaults.robotSoftwareSuite;
    	      this.sources = defaults.sources;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCurrentRevisionId(@Nullable String currentRevisionId) {
            this.currentRevisionId = currentRevisionId;
            return this;
        }

        public Builder setEnvironment(@Nullable String environment) {
            this.environment = environment;
            return this;
        }

        public Builder setRobotSoftwareSuite(@Nullable RobotApplicationRobotSoftwareSuite robotSoftwareSuite) {
            this.robotSoftwareSuite = robotSoftwareSuite;
            return this;
        }

        public Builder setSources(@Nullable List<RobotApplicationSourceConfig> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setTags(@Nullable RobotApplicationTags tags) {
            this.tags = tags;
            return this;
        }

        public GetRobotApplicationResult build() {
            return new GetRobotApplicationResult(arn, currentRevisionId, environment, robotSoftwareSuite, sources, tags);
        }
    }
}
