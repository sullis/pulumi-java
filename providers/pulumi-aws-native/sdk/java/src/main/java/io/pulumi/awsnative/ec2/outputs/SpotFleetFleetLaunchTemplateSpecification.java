// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotFleetFleetLaunchTemplateSpecification {
    private final @Nullable String launchTemplateId;
    private final @Nullable String launchTemplateName;
    private final String version;

    @OutputCustomType.Constructor({"launchTemplateId","launchTemplateName","version"})
    private SpotFleetFleetLaunchTemplateSpecification(
        @Nullable String launchTemplateId,
        @Nullable String launchTemplateName,
        String version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = Objects.requireNonNull(version);
    }

    public Optional<String> getLaunchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }
    public Optional<String> getLaunchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetFleetLaunchTemplateSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetFleetLaunchTemplateSpecification defaults) {
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

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public SpotFleetFleetLaunchTemplateSpecification build() {
            return new SpotFleetFleetLaunchTemplateSpecification(launchTemplateId, launchTemplateName, version);
        }
    }
}
