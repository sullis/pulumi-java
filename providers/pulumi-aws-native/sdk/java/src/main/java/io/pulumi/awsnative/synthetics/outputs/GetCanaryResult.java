// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.outputs;

import io.pulumi.awsnative.synthetics.outputs.CanaryArtifactConfig;
import io.pulumi.awsnative.synthetics.outputs.CanaryCode;
import io.pulumi.awsnative.synthetics.outputs.CanaryRunConfig;
import io.pulumi.awsnative.synthetics.outputs.CanarySchedule;
import io.pulumi.awsnative.synthetics.outputs.CanaryTag;
import io.pulumi.awsnative.synthetics.outputs.CanaryVPCConfig;
import io.pulumi.awsnative.synthetics.outputs.CanaryVisualReference;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCanaryResult {
    private final @Nullable CanaryArtifactConfig artifactConfig;
    private final @Nullable String artifactS3Location;
    private final @Nullable CanaryCode code;
    private final @Nullable String executionRoleArn;
    private final @Nullable Integer failureRetentionPeriod;
    private final @Nullable String id;
    private final @Nullable CanaryRunConfig runConfig;
    private final @Nullable String runtimeVersion;
    private final @Nullable CanarySchedule schedule;
    private final @Nullable Boolean startCanaryAfterCreation;
    private final @Nullable String state;
    private final @Nullable Integer successRetentionPeriod;
    private final @Nullable List<CanaryTag> tags;
    private final @Nullable CanaryVPCConfig vPCConfig;
    private final @Nullable CanaryVisualReference visualReference;

    @OutputCustomType.Constructor({"artifactConfig","artifactS3Location","code","executionRoleArn","failureRetentionPeriod","id","runConfig","runtimeVersion","schedule","startCanaryAfterCreation","state","successRetentionPeriod","tags","vPCConfig","visualReference"})
    private GetCanaryResult(
        @Nullable CanaryArtifactConfig artifactConfig,
        @Nullable String artifactS3Location,
        @Nullable CanaryCode code,
        @Nullable String executionRoleArn,
        @Nullable Integer failureRetentionPeriod,
        @Nullable String id,
        @Nullable CanaryRunConfig runConfig,
        @Nullable String runtimeVersion,
        @Nullable CanarySchedule schedule,
        @Nullable Boolean startCanaryAfterCreation,
        @Nullable String state,
        @Nullable Integer successRetentionPeriod,
        @Nullable List<CanaryTag> tags,
        @Nullable CanaryVPCConfig vPCConfig,
        @Nullable CanaryVisualReference visualReference) {
        this.artifactConfig = artifactConfig;
        this.artifactS3Location = artifactS3Location;
        this.code = code;
        this.executionRoleArn = executionRoleArn;
        this.failureRetentionPeriod = failureRetentionPeriod;
        this.id = id;
        this.runConfig = runConfig;
        this.runtimeVersion = runtimeVersion;
        this.schedule = schedule;
        this.startCanaryAfterCreation = startCanaryAfterCreation;
        this.state = state;
        this.successRetentionPeriod = successRetentionPeriod;
        this.tags = tags;
        this.vPCConfig = vPCConfig;
        this.visualReference = visualReference;
    }

    public Optional<CanaryArtifactConfig> getArtifactConfig() {
        return Optional.ofNullable(this.artifactConfig);
    }
    public Optional<String> getArtifactS3Location() {
        return Optional.ofNullable(this.artifactS3Location);
    }
    public Optional<CanaryCode> getCode() {
        return Optional.ofNullable(this.code);
    }
    public Optional<String> getExecutionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }
    public Optional<Integer> getFailureRetentionPeriod() {
        return Optional.ofNullable(this.failureRetentionPeriod);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<CanaryRunConfig> getRunConfig() {
        return Optional.ofNullable(this.runConfig);
    }
    public Optional<String> getRuntimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }
    public Optional<CanarySchedule> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    public Optional<Boolean> getStartCanaryAfterCreation() {
        return Optional.ofNullable(this.startCanaryAfterCreation);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public Optional<Integer> getSuccessRetentionPeriod() {
        return Optional.ofNullable(this.successRetentionPeriod);
    }
    public List<CanaryTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<CanaryVPCConfig> getVPCConfig() {
        return Optional.ofNullable(this.vPCConfig);
    }
    public Optional<CanaryVisualReference> getVisualReference() {
        return Optional.ofNullable(this.visualReference);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCanaryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CanaryArtifactConfig artifactConfig;
        private @Nullable String artifactS3Location;
        private @Nullable CanaryCode code;
        private @Nullable String executionRoleArn;
        private @Nullable Integer failureRetentionPeriod;
        private @Nullable String id;
        private @Nullable CanaryRunConfig runConfig;
        private @Nullable String runtimeVersion;
        private @Nullable CanarySchedule schedule;
        private @Nullable Boolean startCanaryAfterCreation;
        private @Nullable String state;
        private @Nullable Integer successRetentionPeriod;
        private @Nullable List<CanaryTag> tags;
        private @Nullable CanaryVPCConfig vPCConfig;
        private @Nullable CanaryVisualReference visualReference;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCanaryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactConfig = defaults.artifactConfig;
    	      this.artifactS3Location = defaults.artifactS3Location;
    	      this.code = defaults.code;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.failureRetentionPeriod = defaults.failureRetentionPeriod;
    	      this.id = defaults.id;
    	      this.runConfig = defaults.runConfig;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.schedule = defaults.schedule;
    	      this.startCanaryAfterCreation = defaults.startCanaryAfterCreation;
    	      this.state = defaults.state;
    	      this.successRetentionPeriod = defaults.successRetentionPeriod;
    	      this.tags = defaults.tags;
    	      this.vPCConfig = defaults.vPCConfig;
    	      this.visualReference = defaults.visualReference;
        }

        public Builder setArtifactConfig(@Nullable CanaryArtifactConfig artifactConfig) {
            this.artifactConfig = artifactConfig;
            return this;
        }

        public Builder setArtifactS3Location(@Nullable String artifactS3Location) {
            this.artifactS3Location = artifactS3Location;
            return this;
        }

        public Builder setCode(@Nullable CanaryCode code) {
            this.code = code;
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder setFailureRetentionPeriod(@Nullable Integer failureRetentionPeriod) {
            this.failureRetentionPeriod = failureRetentionPeriod;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setRunConfig(@Nullable CanaryRunConfig runConfig) {
            this.runConfig = runConfig;
            return this;
        }

        public Builder setRuntimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder setSchedule(@Nullable CanarySchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setStartCanaryAfterCreation(@Nullable Boolean startCanaryAfterCreation) {
            this.startCanaryAfterCreation = startCanaryAfterCreation;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setSuccessRetentionPeriod(@Nullable Integer successRetentionPeriod) {
            this.successRetentionPeriod = successRetentionPeriod;
            return this;
        }

        public Builder setTags(@Nullable List<CanaryTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVPCConfig(@Nullable CanaryVPCConfig vPCConfig) {
            this.vPCConfig = vPCConfig;
            return this;
        }

        public Builder setVisualReference(@Nullable CanaryVisualReference visualReference) {
            this.visualReference = visualReference;
            return this;
        }

        public GetCanaryResult build() {
            return new GetCanaryResult(artifactConfig, artifactS3Location, code, executionRoleArn, failureRetentionPeriod, id, runConfig, runtimeVersion, schedule, startCanaryAfterCreation, state, successRetentionPeriod, tags, vPCConfig, visualReference);
        }
    }
}
