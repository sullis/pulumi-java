// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricAlertActionResponse {
    /**
     * the id of the action group to use.
     * 
     */
    private final @Nullable String actionGroupId;
    /**
     * This field allows specifying custom properties, which would be appended to the alert payload sent as input to the webhook.
     * 
     */
    private final @Nullable Map<String,String> webHookProperties;

    @OutputCustomType.Constructor({"actionGroupId","webHookProperties"})
    private MetricAlertActionResponse(
        @Nullable String actionGroupId,
        @Nullable Map<String,String> webHookProperties) {
        this.actionGroupId = actionGroupId;
        this.webHookProperties = webHookProperties;
    }

    /**
     * the id of the action group to use.
     * 
     */
    public Optional<String> getActionGroupId() {
        return Optional.ofNullable(this.actionGroupId);
    }
    /**
     * This field allows specifying custom properties, which would be appended to the alert payload sent as input to the webhook.
     * 
     */
    public Map<String,String> getWebHookProperties() {
        return this.webHookProperties == null ? Map.of() : this.webHookProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlertActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionGroupId;
        private @Nullable Map<String,String> webHookProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlertActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.webHookProperties = defaults.webHookProperties;
        }

        public Builder setActionGroupId(@Nullable String actionGroupId) {
            this.actionGroupId = actionGroupId;
            return this;
        }

        public Builder setWebHookProperties(@Nullable Map<String,String> webHookProperties) {
            this.webHookProperties = webHookProperties;
            return this;
        }

        public MetricAlertActionResponse build() {
            return new MetricAlertActionResponse(actionGroupId, webHookProperties);
        }
    }
}
