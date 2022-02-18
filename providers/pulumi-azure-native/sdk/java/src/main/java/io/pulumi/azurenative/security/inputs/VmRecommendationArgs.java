// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a machine that is part of a machine group
 * 
 */
public final class VmRecommendationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmRecommendationArgs Empty = new VmRecommendationArgs();

    /**
     * The configuration status of the machines group or machine or rule
     * 
     */
    @InputImport(name="configurationStatus")
    private final @Nullable Input<String> configurationStatus;

    public Input<String> getConfigurationStatus() {
        return this.configurationStatus == null ? Input.empty() : this.configurationStatus;
    }

    /**
     * The machine supportability of Enforce feature
     * 
     */
    @InputImport(name="enforcementSupport")
    private final @Nullable Input<String> enforcementSupport;

    public Input<String> getEnforcementSupport() {
        return this.enforcementSupport == null ? Input.empty() : this.enforcementSupport;
    }

    /**
     * The recommendation action of the machine or rule
     * 
     */
    @InputImport(name="recommendationAction")
    private final @Nullable Input<String> recommendationAction;

    public Input<String> getRecommendationAction() {
        return this.recommendationAction == null ? Input.empty() : this.recommendationAction;
    }

    /**
     * The full resource id of the machine
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public VmRecommendationArgs(
        @Nullable Input<String> configurationStatus,
        @Nullable Input<String> enforcementSupport,
        @Nullable Input<String> recommendationAction,
        @Nullable Input<String> resourceId) {
        this.configurationStatus = configurationStatus;
        this.enforcementSupport = enforcementSupport;
        this.recommendationAction = recommendationAction;
        this.resourceId = resourceId;
    }

    private VmRecommendationArgs() {
        this.configurationStatus = Input.empty();
        this.enforcementSupport = Input.empty();
        this.recommendationAction = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmRecommendationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configurationStatus;
        private @Nullable Input<String> enforcementSupport;
        private @Nullable Input<String> recommendationAction;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmRecommendationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationStatus = defaults.configurationStatus;
    	      this.enforcementSupport = defaults.enforcementSupport;
    	      this.recommendationAction = defaults.recommendationAction;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setConfigurationStatus(@Nullable Input<String> configurationStatus) {
            this.configurationStatus = configurationStatus;
            return this;
        }

        public Builder setConfigurationStatus(@Nullable String configurationStatus) {
            this.configurationStatus = Input.ofNullable(configurationStatus);
            return this;
        }

        public Builder setEnforcementSupport(@Nullable Input<String> enforcementSupport) {
            this.enforcementSupport = enforcementSupport;
            return this;
        }

        public Builder setEnforcementSupport(@Nullable String enforcementSupport) {
            this.enforcementSupport = Input.ofNullable(enforcementSupport);
            return this;
        }

        public Builder setRecommendationAction(@Nullable Input<String> recommendationAction) {
            this.recommendationAction = recommendationAction;
            return this;
        }

        public Builder setRecommendationAction(@Nullable String recommendationAction) {
            this.recommendationAction = Input.ofNullable(recommendationAction);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public VmRecommendationArgs build() {
            return new VmRecommendationArgs(configurationStatus, enforcementSupport, recommendationAction, resourceId);
        }
    }
}
