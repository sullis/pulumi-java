// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EC2FleetFleetLaunchTemplateSpecificationRequest {
    private final @Nullable String launchTemplateId;
    private final @Nullable String launchTemplateName;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"launchTemplateId","launchTemplateName","version"})
    private EC2FleetFleetLaunchTemplateSpecificationRequest(
        @Nullable String launchTemplateId,
        @Nullable String launchTemplateName,
        @Nullable String version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = version;
    }

    public Optional<String> getLaunchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }
    public Optional<String> getLaunchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetFleetLaunchTemplateSpecificationRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetFleetLaunchTemplateSpecificationRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder setLaunchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder setLaunchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public EC2FleetFleetLaunchTemplateSpecificationRequest build() {
            return new EC2FleetFleetLaunchTemplateSpecificationRequest(launchTemplateId, launchTemplateName, version);
        }
    }
}
