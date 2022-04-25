// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.EffectiveConnectivityConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListEffectiveConnectivityConfigurationResult {
    /**
     * @return When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    private final @Nullable String skipToken;
    /**
     * @return Gets a page of NetworkManagerEffectiveConnectivityConfiguration
     * 
     */
    private final @Nullable List<EffectiveConnectivityConfigurationResponse> value;

    @CustomType.Constructor
    private ListEffectiveConnectivityConfigurationResult(
        @CustomType.Parameter("skipToken") @Nullable String skipToken,
        @CustomType.Parameter("value") @Nullable List<EffectiveConnectivityConfigurationResponse> value) {
        this.skipToken = skipToken;
        this.value = value;
    }

    /**
     * @return When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }
    /**
     * @return Gets a page of NetworkManagerEffectiveConnectivityConfiguration
     * 
     */
    public List<EffectiveConnectivityConfigurationResponse> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListEffectiveConnectivityConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String skipToken;
        private @Nullable List<EffectiveConnectivityConfigurationResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListEffectiveConnectivityConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skipToken = defaults.skipToken;
    	      this.value = defaults.value;
        }

        public Builder skipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }
        public Builder value(@Nullable List<EffectiveConnectivityConfigurationResponse> value) {
            this.value = value;
            return this;
        }
        public Builder value(EffectiveConnectivityConfigurationResponse... value) {
            return value(List.of(value));
        }        public ListEffectiveConnectivityConfigurationResult build() {
            return new ListEffectiveConnectivityConfigurationResult(skipToken, value);
        }
    }
}
