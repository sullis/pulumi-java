// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.CommonFeatureSpecArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureArgs Empty = new FeatureArgs();

    @InputImport(name="featureId")
      private final @Nullable Input<String> featureId;

    public Input<String> getFeatureId() {
        return this.featureId == null ? Input.empty() : this.featureId;
    }

    /**
     * GCP labels for this Feature.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p}/locations/{l}/memberships/{m}` Where {p} is the project, {l} is a valid location and {m} is a valid Membership in this project at that location. {p} WILL match the Feature's project. {p} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
     * 
     */
    @InputImport(name="membershipSpecs")
      private final @Nullable Input<Map<String,String>> membershipSpecs;

    public Input<Map<String,String>> getMembershipSpecs() {
        return this.membershipSpecs == null ? Input.empty() : this.membershipSpecs;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    @InputImport(name="spec")
      private final @Nullable Input<CommonFeatureSpecArgs> spec;

    public Input<CommonFeatureSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    public FeatureArgs(
        @Nullable Input<String> featureId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> membershipSpecs,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<CommonFeatureSpecArgs> spec) {
        this.featureId = featureId;
        this.labels = labels;
        this.location = location;
        this.membershipSpecs = membershipSpecs;
        this.project = project;
        this.requestId = requestId;
        this.spec = spec;
    }

    private FeatureArgs() {
        this.featureId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.membershipSpecs = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.spec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> featureId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> membershipSpecs;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<CommonFeatureSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureId = defaults.featureId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.membershipSpecs = defaults.membershipSpecs;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.spec = defaults.spec;
        }

        public Builder setFeatureId(@Nullable Input<String> featureId) {
            this.featureId = featureId;
            return this;
        }

        public Builder setFeatureId(@Nullable String featureId) {
            this.featureId = Input.ofNullable(featureId);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMembershipSpecs(@Nullable Input<Map<String,String>> membershipSpecs) {
            this.membershipSpecs = membershipSpecs;
            return this;
        }

        public Builder setMembershipSpecs(@Nullable Map<String,String> membershipSpecs) {
            this.membershipSpecs = Input.ofNullable(membershipSpecs);
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

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSpec(@Nullable Input<CommonFeatureSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable CommonFeatureSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }
        public FeatureArgs build() {
            return new FeatureArgs(featureId, labels, location, membershipSpecs, project, requestId, spec);
        }
    }
}