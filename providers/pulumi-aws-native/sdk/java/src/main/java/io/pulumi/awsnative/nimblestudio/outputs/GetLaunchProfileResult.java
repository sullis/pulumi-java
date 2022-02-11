// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.outputs.LaunchProfileStreamConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLaunchProfileResult {
    private final @Nullable String description;
    private final @Nullable String launchProfileId;
    private final @Nullable List<String> launchProfileProtocolVersions;
    private final @Nullable String name;
    private final @Nullable LaunchProfileStreamConfiguration streamConfiguration;
    private final @Nullable List<String> studioComponentIds;

    @OutputCustomType.Constructor({"description","launchProfileId","launchProfileProtocolVersions","name","streamConfiguration","studioComponentIds"})
    private GetLaunchProfileResult(
        @Nullable String description,
        @Nullable String launchProfileId,
        @Nullable List<String> launchProfileProtocolVersions,
        @Nullable String name,
        @Nullable LaunchProfileStreamConfiguration streamConfiguration,
        @Nullable List<String> studioComponentIds) {
        this.description = description;
        this.launchProfileId = launchProfileId;
        this.launchProfileProtocolVersions = launchProfileProtocolVersions;
        this.name = name;
        this.streamConfiguration = streamConfiguration;
        this.studioComponentIds = studioComponentIds;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getLaunchProfileId() {
        return Optional.ofNullable(this.launchProfileId);
    }
    public List<String> getLaunchProfileProtocolVersions() {
        return this.launchProfileProtocolVersions == null ? List.of() : this.launchProfileProtocolVersions;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<LaunchProfileStreamConfiguration> getStreamConfiguration() {
        return Optional.ofNullable(this.streamConfiguration);
    }
    public List<String> getStudioComponentIds() {
        return this.studioComponentIds == null ? List.of() : this.studioComponentIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String launchProfileId;
        private @Nullable List<String> launchProfileProtocolVersions;
        private @Nullable String name;
        private @Nullable LaunchProfileStreamConfiguration streamConfiguration;
        private @Nullable List<String> studioComponentIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.launchProfileId = defaults.launchProfileId;
    	      this.launchProfileProtocolVersions = defaults.launchProfileProtocolVersions;
    	      this.name = defaults.name;
    	      this.streamConfiguration = defaults.streamConfiguration;
    	      this.studioComponentIds = defaults.studioComponentIds;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLaunchProfileId(@Nullable String launchProfileId) {
            this.launchProfileId = launchProfileId;
            return this;
        }

        public Builder setLaunchProfileProtocolVersions(@Nullable List<String> launchProfileProtocolVersions) {
            this.launchProfileProtocolVersions = launchProfileProtocolVersions;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStreamConfiguration(@Nullable LaunchProfileStreamConfiguration streamConfiguration) {
            this.streamConfiguration = streamConfiguration;
            return this;
        }

        public Builder setStudioComponentIds(@Nullable List<String> studioComponentIds) {
            this.studioComponentIds = studioComponentIds;
            return this;
        }

        public GetLaunchProfileResult build() {
            return new GetLaunchProfileResult(description, launchProfileId, launchProfileProtocolVersions, name, streamConfiguration, studioComponentIds);
        }
    }
}
