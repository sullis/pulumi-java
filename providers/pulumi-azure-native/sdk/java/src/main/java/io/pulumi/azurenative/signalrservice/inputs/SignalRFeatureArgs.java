// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.azurenative.signalrservice.enums.FeatureFlags;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Feature of a SignalR resource, which controls the SignalR runtime behavior.
 * 
 */
public final class SignalRFeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final SignalRFeatureArgs Empty = new SignalRFeatureArgs();

    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     * - ServiceMode: Flag for backend server for SignalR service. Values allowed: "Default": have your own backend server; "Serverless": your application doesn't have a backend server; "Classic": for backward compatibility. Support both Default and Serverless mode but not recommended; "PredefinedOnly": for future use.
     * - EnableConnectivityLogs: "true"/"false", to enable/disable the connectivity log category respectively.
     * 
     */
    @InputImport(name="flag", required=true)
    private final Input<Either<String,FeatureFlags>> flag;

    public Input<Either<String,FeatureFlags>> getFlag() {
        return this.flag;
    }

    /**
     * Optional properties related to this feature.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public SignalRFeatureArgs(
        Input<Either<String,FeatureFlags>> flag,
        @Nullable Input<Map<String,String>> properties,
        Input<String> value) {
        this.flag = Objects.requireNonNull(flag, "expected parameter 'flag' to be non-null");
        this.properties = properties;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SignalRFeatureArgs() {
        this.flag = Input.empty();
        this.properties = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,FeatureFlags>> flag;
        private @Nullable Input<Map<String,String>> properties;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flag = defaults.flag;
    	      this.properties = defaults.properties;
    	      this.value = defaults.value;
        }

        public Builder setFlag(Input<Either<String,FeatureFlags>> flag) {
            this.flag = Objects.requireNonNull(flag);
            return this;
        }

        public Builder setFlag(Either<String,FeatureFlags> flag) {
            this.flag = Input.of(Objects.requireNonNull(flag));
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public SignalRFeatureArgs build() {
            return new SignalRFeatureArgs(flag, properties, value);
        }
    }
}
