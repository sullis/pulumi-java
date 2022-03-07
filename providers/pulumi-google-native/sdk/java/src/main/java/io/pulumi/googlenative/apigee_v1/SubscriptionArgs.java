// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * Name of the API product for which the developer is purchasing a subscription.
     * 
     */
    @InputImport(name="apiproduct")
      private final @Nullable Input<String> apiproduct;

    public Input<String> getApiproduct() {
        return this.apiproduct == null ? Input.empty() : this.apiproduct;
    }

    @InputImport(name="developerId", required=true)
      private final Input<String> developerId;

    public Input<String> getDeveloperId() {
        return this.developerId;
    }

    /**
     * Time when the API product subscription ends in milliseconds since epoch.
     * 
     */
    @InputImport(name="endTime")
      private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Time when the API product subscription starts in milliseconds since epoch.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public SubscriptionArgs(
        @Nullable Input<String> apiproduct,
        Input<String> developerId,
        @Nullable Input<String> endTime,
        Input<String> organizationId,
        @Nullable Input<String> startTime) {
        this.apiproduct = apiproduct;
        this.developerId = Objects.requireNonNull(developerId, "expected parameter 'developerId' to be non-null");
        this.endTime = endTime;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.startTime = startTime;
    }

    private SubscriptionArgs() {
        this.apiproduct = Input.empty();
        this.developerId = Input.empty();
        this.endTime = Input.empty();
        this.organizationId = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiproduct;
        private Input<String> developerId;
        private @Nullable Input<String> endTime;
        private Input<String> organizationId;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproduct = defaults.apiproduct;
    	      this.developerId = defaults.developerId;
    	      this.endTime = defaults.endTime;
    	      this.organizationId = defaults.organizationId;
    	      this.startTime = defaults.startTime;
        }

        public Builder setApiproduct(@Nullable Input<String> apiproduct) {
            this.apiproduct = apiproduct;
            return this;
        }

        public Builder setApiproduct(@Nullable String apiproduct) {
            this.apiproduct = Input.ofNullable(apiproduct);
            return this;
        }

        public Builder setDeveloperId(Input<String> developerId) {
            this.developerId = Objects.requireNonNull(developerId);
            return this;
        }

        public Builder setDeveloperId(String developerId) {
            this.developerId = Input.of(Objects.requireNonNull(developerId));
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }
        public SubscriptionArgs build() {
            return new SubscriptionArgs(apiproduct, developerId, endTime, organizationId, startTime);
        }
    }
}