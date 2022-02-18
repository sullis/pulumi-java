// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Feature of a SignalR resource, which controls the SignalR runtime behavior.
 * 
 */
public final class SignalRFeatureResponse extends io.pulumi.resources.InvokeArgs {

    public static final SignalRFeatureResponse Empty = new SignalRFeatureResponse();

    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     * - ServiceMode: Flag for backend server for SignalR service. Values allowed: "Default": have your own backend server; "Serverless": your application doesn't have a backend server; "Classic": for backward compatibility. Support both Default and Serverless mode but not recommended; "PredefinedOnly": for future use.
     * - EnableConnectivityLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     * 
     */
    @InputImport(name="flag", required=true)
    private final String flag;

    public String getFlag() {
        return this.flag;
    }

    /**
     * Optional properties related to this feature.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * Value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public SignalRFeatureResponse(
        String flag,
        @Nullable Map<String,String> properties,
        String value) {
        this.flag = Objects.requireNonNull(flag, "expected parameter 'flag' to be non-null");
        this.properties = properties;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SignalRFeatureResponse() {
        this.flag = null;
        this.properties = Map.of();
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flag;
        private @Nullable Map<String,String> properties;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flag = defaults.flag;
    	      this.properties = defaults.properties;
    	      this.value = defaults.value;
        }

        public Builder setFlag(String flag) {
            this.flag = Objects.requireNonNull(flag);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public SignalRFeatureResponse build() {
            return new SignalRFeatureResponse(flag, properties, value);
        }
    }
}
