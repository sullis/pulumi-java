// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.CustomScaleRuleArgs;
import io.pulumi.azurenative.web.inputs.HttpScaleRuleArgs;
import io.pulumi.azurenative.web.inputs.QueueScaleRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container scaling rule.
 * 
 */
public final class ScaleRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScaleRuleArgs Empty = new ScaleRuleArgs();

    /**
     * Azure Queue based scaling.
     * 
     */
    @InputImport(name="azureQueue")
    private final @Nullable Input<QueueScaleRuleArgs> azureQueue;

    public Input<QueueScaleRuleArgs> getAzureQueue() {
        return this.azureQueue == null ? Input.empty() : this.azureQueue;
    }

    /**
     * Custom scale rule.
     * 
     */
    @InputImport(name="custom")
    private final @Nullable Input<CustomScaleRuleArgs> custom;

    public Input<CustomScaleRuleArgs> getCustom() {
        return this.custom == null ? Input.empty() : this.custom;
    }

    /**
     * HTTP requests based scaling.
     * 
     */
    @InputImport(name="http")
    private final @Nullable Input<HttpScaleRuleArgs> http;

    public Input<HttpScaleRuleArgs> getHttp() {
        return this.http == null ? Input.empty() : this.http;
    }

    /**
     * Scale Rule Name
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ScaleRuleArgs(
        @Nullable Input<QueueScaleRuleArgs> azureQueue,
        @Nullable Input<CustomScaleRuleArgs> custom,
        @Nullable Input<HttpScaleRuleArgs> http,
        @Nullable Input<String> name) {
        this.azureQueue = azureQueue;
        this.custom = custom;
        this.http = http;
        this.name = name;
    }

    private ScaleRuleArgs() {
        this.azureQueue = Input.empty();
        this.custom = Input.empty();
        this.http = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<QueueScaleRuleArgs> azureQueue;
        private @Nullable Input<CustomScaleRuleArgs> custom;
        private @Nullable Input<HttpScaleRuleArgs> http;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureQueue = defaults.azureQueue;
    	      this.custom = defaults.custom;
    	      this.http = defaults.http;
    	      this.name = defaults.name;
        }

        public Builder setAzureQueue(@Nullable Input<QueueScaleRuleArgs> azureQueue) {
            this.azureQueue = azureQueue;
            return this;
        }

        public Builder setAzureQueue(@Nullable QueueScaleRuleArgs azureQueue) {
            this.azureQueue = Input.ofNullable(azureQueue);
            return this;
        }

        public Builder setCustom(@Nullable Input<CustomScaleRuleArgs> custom) {
            this.custom = custom;
            return this;
        }

        public Builder setCustom(@Nullable CustomScaleRuleArgs custom) {
            this.custom = Input.ofNullable(custom);
            return this;
        }

        public Builder setHttp(@Nullable Input<HttpScaleRuleArgs> http) {
            this.http = http;
            return this;
        }

        public Builder setHttp(@Nullable HttpScaleRuleArgs http) {
            this.http = Input.ofNullable(http);
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

        public ScaleRuleArgs build() {
            return new ScaleRuleArgs(azureQueue, custom, http, name);
        }
    }
}
