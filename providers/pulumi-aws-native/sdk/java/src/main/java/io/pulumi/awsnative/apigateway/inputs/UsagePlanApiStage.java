// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanApiStage extends io.pulumi.resources.InvokeArgs {

    public static final UsagePlanApiStage Empty = new UsagePlanApiStage();

    /**
     * The ID of an API that is in the specified Stage property that you want to associate with the usage plan.
     * 
     */
    @Import(name="apiId")
      private final @Nullable String apiId;

    public Optional<String> apiId() {
        return this.apiId == null ? Optional.empty() : Optional.ofNullable(this.apiId);
    }

    /**
     * The name of the stage to associate with the usage plan.
     * 
     */
    @Import(name="stage")
      private final @Nullable String stage;

    public Optional<String> stage() {
        return this.stage == null ? Optional.empty() : Optional.ofNullable(this.stage);
    }

    /**
     * Map containing method-level throttling information for an API stage in a usage plan. The key for the map is the path and method for which to configure custom throttling, for example, '/pets/GET'. Duplicates are not allowed.
     * 
     */
    @Import(name="throttle")
      private final @Nullable Object throttle;

    public Optional<Object> throttle() {
        return this.throttle == null ? Optional.empty() : Optional.ofNullable(this.throttle);
    }

    public UsagePlanApiStage(
        @Nullable String apiId,
        @Nullable String stage,
        @Nullable Object throttle) {
        this.apiId = apiId;
        this.stage = stage;
        this.throttle = throttle;
    }

    private UsagePlanApiStage() {
        this.apiId = null;
        this.stage = null;
        this.throttle = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanApiStage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiId;
        private @Nullable String stage;
        private @Nullable Object throttle;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanApiStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.stage = defaults.stage;
    	      this.throttle = defaults.throttle;
        }

        public Builder apiId(@Nullable String apiId) {
            this.apiId = apiId;
            return this;
        }
        public Builder stage(@Nullable String stage) {
            this.stage = stage;
            return this;
        }
        public Builder throttle(@Nullable Object throttle) {
            this.throttle = throttle;
            return this;
        }        public UsagePlanApiStage build() {
            return new UsagePlanApiStage(apiId, stage, throttle);
        }
    }
}
