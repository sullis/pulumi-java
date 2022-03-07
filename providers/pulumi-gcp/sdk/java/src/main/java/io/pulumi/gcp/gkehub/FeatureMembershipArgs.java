// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipArgs Empty = new FeatureMembershipArgs();

    /**
     * Config Management-specific spec. Structure is documented below.
     * 
     */
    @InputImport(name="configmanagement", required=true)
      private final Input<FeatureMembershipConfigmanagementArgs> configmanagement;

    public Input<FeatureMembershipConfigmanagementArgs> getConfigmanagement() {
        return this.configmanagement;
    }

    /**
     * The name of the feature
     * 
     */
    @InputImport(name="feature", required=true)
      private final Input<String> feature;

    public Input<String> getFeature() {
        return this.feature;
    }

    /**
     * The location of the feature
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * The name of the membership
     * 
     */
    @InputImport(name="membership", required=true)
      private final Input<String> membership;

    public Input<String> getMembership() {
        return this.membership;
    }

    /**
     * The project of the feature
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public FeatureMembershipArgs(
        Input<FeatureMembershipConfigmanagementArgs> configmanagement,
        Input<String> feature,
        Input<String> location,
        Input<String> membership,
        @Nullable Input<String> project) {
        this.configmanagement = Objects.requireNonNull(configmanagement, "expected parameter 'configmanagement' to be non-null");
        this.feature = Objects.requireNonNull(feature, "expected parameter 'feature' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.membership = Objects.requireNonNull(membership, "expected parameter 'membership' to be non-null");
        this.project = project;
    }

    private FeatureMembershipArgs() {
        this.configmanagement = Input.empty();
        this.feature = Input.empty();
        this.location = Input.empty();
        this.membership = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FeatureMembershipConfigmanagementArgs> configmanagement;
        private Input<String> feature;
        private Input<String> location;
        private Input<String> membership;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configmanagement = defaults.configmanagement;
    	      this.feature = defaults.feature;
    	      this.location = defaults.location;
    	      this.membership = defaults.membership;
    	      this.project = defaults.project;
        }

        public Builder setConfigmanagement(Input<FeatureMembershipConfigmanagementArgs> configmanagement) {
            this.configmanagement = Objects.requireNonNull(configmanagement);
            return this;
        }

        public Builder setConfigmanagement(FeatureMembershipConfigmanagementArgs configmanagement) {
            this.configmanagement = Input.of(Objects.requireNonNull(configmanagement));
            return this;
        }

        public Builder setFeature(Input<String> feature) {
            this.feature = Objects.requireNonNull(feature);
            return this;
        }

        public Builder setFeature(String feature) {
            this.feature = Input.of(Objects.requireNonNull(feature));
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setMembership(Input<String> membership) {
            this.membership = Objects.requireNonNull(membership);
            return this;
        }

        public Builder setMembership(String membership) {
            this.membership = Input.of(Objects.requireNonNull(membership));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public FeatureMembershipArgs build() {
            return new FeatureMembershipArgs(configmanagement, feature, location, membership, project);
        }
    }
}