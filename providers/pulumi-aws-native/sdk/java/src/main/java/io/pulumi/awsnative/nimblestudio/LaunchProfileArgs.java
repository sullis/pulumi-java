// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.nimblestudio.inputs.LaunchProfileStreamConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.LaunchProfileTagsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchProfileArgs Empty = new LaunchProfileArgs();

    /**
     * <p>The description.</p>
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * <p>Specifies the IDs of the EC2 subnets where streaming sessions will be accessible from.
     *             These subnets must support the specified instance types. </p>
     * 
     */
    @InputImport(name="ec2SubnetIds", required=true)
    private final Input<List<String>> ec2SubnetIds;

    public Input<List<String>> getEc2SubnetIds() {
        return this.ec2SubnetIds;
    }

    /**
     * <p>The version number of the protocol that is used by the launch profile. The only valid
     *             version is "2021-03-31".</p>
     * 
     */
    @InputImport(name="launchProfileProtocolVersions", required=true)
    private final Input<List<String>> launchProfileProtocolVersions;

    public Input<List<String>> getLaunchProfileProtocolVersions() {
        return this.launchProfileProtocolVersions;
    }

    /**
     * <p>The name for the launch profile.</p>
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="streamConfiguration", required=true)
    private final Input<LaunchProfileStreamConfigurationArgs> streamConfiguration;

    public Input<LaunchProfileStreamConfigurationArgs> getStreamConfiguration() {
        return this.streamConfiguration;
    }

    /**
     * <p>Unique identifiers for a collection of studio components that can be used with this
     *             launch profile.</p>
     * 
     */
    @InputImport(name="studioComponentIds", required=true)
    private final Input<List<String>> studioComponentIds;

    public Input<List<String>> getStudioComponentIds() {
        return this.studioComponentIds;
    }

    /**
     * <p>The studio ID. </p>
     * 
     */
    @InputImport(name="studioId", required=true)
    private final Input<String> studioId;

    public Input<String> getStudioId() {
        return this.studioId;
    }

    @InputImport(name="tags")
    private final @Nullable Input<LaunchProfileTagsArgs> tags;

    public Input<LaunchProfileTagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LaunchProfileArgs(
        @Nullable Input<String> description,
        Input<List<String>> ec2SubnetIds,
        Input<List<String>> launchProfileProtocolVersions,
        @Nullable Input<String> name,
        Input<LaunchProfileStreamConfigurationArgs> streamConfiguration,
        Input<List<String>> studioComponentIds,
        Input<String> studioId,
        @Nullable Input<LaunchProfileTagsArgs> tags) {
        this.description = description;
        this.ec2SubnetIds = Objects.requireNonNull(ec2SubnetIds, "expected parameter 'ec2SubnetIds' to be non-null");
        this.launchProfileProtocolVersions = Objects.requireNonNull(launchProfileProtocolVersions, "expected parameter 'launchProfileProtocolVersions' to be non-null");
        this.name = name;
        this.streamConfiguration = Objects.requireNonNull(streamConfiguration, "expected parameter 'streamConfiguration' to be non-null");
        this.studioComponentIds = Objects.requireNonNull(studioComponentIds, "expected parameter 'studioComponentIds' to be non-null");
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
        this.tags = tags;
    }

    private LaunchProfileArgs() {
        this.description = Input.empty();
        this.ec2SubnetIds = Input.empty();
        this.launchProfileProtocolVersions = Input.empty();
        this.name = Input.empty();
        this.streamConfiguration = Input.empty();
        this.studioComponentIds = Input.empty();
        this.studioId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<List<String>> ec2SubnetIds;
        private Input<List<String>> launchProfileProtocolVersions;
        private @Nullable Input<String> name;
        private Input<LaunchProfileStreamConfigurationArgs> streamConfiguration;
        private Input<List<String>> studioComponentIds;
        private Input<String> studioId;
        private @Nullable Input<LaunchProfileTagsArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ec2SubnetIds = defaults.ec2SubnetIds;
    	      this.launchProfileProtocolVersions = defaults.launchProfileProtocolVersions;
    	      this.name = defaults.name;
    	      this.streamConfiguration = defaults.streamConfiguration;
    	      this.studioComponentIds = defaults.studioComponentIds;
    	      this.studioId = defaults.studioId;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEc2SubnetIds(Input<List<String>> ec2SubnetIds) {
            this.ec2SubnetIds = Objects.requireNonNull(ec2SubnetIds);
            return this;
        }

        public Builder setEc2SubnetIds(List<String> ec2SubnetIds) {
            this.ec2SubnetIds = Input.of(Objects.requireNonNull(ec2SubnetIds));
            return this;
        }

        public Builder setLaunchProfileProtocolVersions(Input<List<String>> launchProfileProtocolVersions) {
            this.launchProfileProtocolVersions = Objects.requireNonNull(launchProfileProtocolVersions);
            return this;
        }

        public Builder setLaunchProfileProtocolVersions(List<String> launchProfileProtocolVersions) {
            this.launchProfileProtocolVersions = Input.of(Objects.requireNonNull(launchProfileProtocolVersions));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setStreamConfiguration(Input<LaunchProfileStreamConfigurationArgs> streamConfiguration) {
            this.streamConfiguration = Objects.requireNonNull(streamConfiguration);
            return this;
        }

        public Builder setStreamConfiguration(LaunchProfileStreamConfigurationArgs streamConfiguration) {
            this.streamConfiguration = Input.of(Objects.requireNonNull(streamConfiguration));
            return this;
        }

        public Builder setStudioComponentIds(Input<List<String>> studioComponentIds) {
            this.studioComponentIds = Objects.requireNonNull(studioComponentIds);
            return this;
        }

        public Builder setStudioComponentIds(List<String> studioComponentIds) {
            this.studioComponentIds = Input.of(Objects.requireNonNull(studioComponentIds));
            return this;
        }

        public Builder setStudioId(Input<String> studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }

        public Builder setStudioId(String studioId) {
            this.studioId = Input.of(Objects.requireNonNull(studioId));
            return this;
        }

        public Builder setTags(@Nullable Input<LaunchProfileTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable LaunchProfileTagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public LaunchProfileArgs build() {
            return new LaunchProfileArgs(description, ec2SubnetIds, launchProfileProtocolVersions, name, streamConfiguration, studioComponentIds, studioId, tags);
        }
    }
}
