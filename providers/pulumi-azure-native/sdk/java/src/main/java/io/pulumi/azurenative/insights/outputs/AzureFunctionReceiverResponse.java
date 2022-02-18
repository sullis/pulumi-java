// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFunctionReceiverResponse {
    /**
     * The azure resource id of the function app.
     * 
     */
    private final String functionAppResourceId;
    /**
     * The function name in the function app.
     * 
     */
    private final String functionName;
    /**
     * The http trigger url where http request sent to.
     * 
     */
    private final String httpTriggerUrl;
    /**
     * The name of the azure function receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private final String name;
    /**
     * Indicates whether to use common alert schema.
     * 
     */
    private final @Nullable Boolean useCommonAlertSchema;

    @OutputCustomType.Constructor({"functionAppResourceId","functionName","httpTriggerUrl","name","useCommonAlertSchema"})
    private AzureFunctionReceiverResponse(
        String functionAppResourceId,
        String functionName,
        String httpTriggerUrl,
        String name,
        @Nullable Boolean useCommonAlertSchema) {
        this.functionAppResourceId = Objects.requireNonNull(functionAppResourceId);
        this.functionName = Objects.requireNonNull(functionName);
        this.httpTriggerUrl = Objects.requireNonNull(httpTriggerUrl);
        this.name = Objects.requireNonNull(name);
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    /**
     * The azure resource id of the function app.
     * 
     */
    public String getFunctionAppResourceId() {
        return this.functionAppResourceId;
    }
    /**
     * The function name in the function app.
     * 
     */
    public String getFunctionName() {
        return this.functionName;
    }
    /**
     * The http trigger url where http request sent to.
     * 
     */
    public String getHttpTriggerUrl() {
        return this.httpTriggerUrl;
    }
    /**
     * The name of the azure function receiver. Names must be unique across all receivers within an action group.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Indicates whether to use common alert schema.
     * 
     */
    public Optional<Boolean> getUseCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionAppResourceId;
        private String functionName;
        private String httpTriggerUrl;
        private String name;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.functionName = defaults.functionName;
    	      this.httpTriggerUrl = defaults.httpTriggerUrl;
    	      this.name = defaults.name;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder setFunctionAppResourceId(String functionAppResourceId) {
            this.functionAppResourceId = Objects.requireNonNull(functionAppResourceId);
            return this;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = Objects.requireNonNull(httpTriggerUrl);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUseCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }

        public AzureFunctionReceiverResponse build() {
            return new AzureFunctionReceiverResponse(functionAppResourceId, functionName, httpTriggerUrl, name, useCommonAlertSchema);
        }
    }
}
