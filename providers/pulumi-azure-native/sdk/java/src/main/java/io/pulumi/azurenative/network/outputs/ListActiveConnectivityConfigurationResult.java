// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ActiveConnectivityConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListActiveConnectivityConfigurationResult {
    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    private final @Nullable String skipToken;
    /**
     * Gets a page of active connectivity configurations.
     * 
     */
    private final @Nullable List<ActiveConnectivityConfigurationResponse> value;

    @OutputCustomType.Constructor({"skipToken","value"})
    private ListActiveConnectivityConfigurationResult(
        @Nullable String skipToken,
        @Nullable List<ActiveConnectivityConfigurationResponse> value) {
        this.skipToken = skipToken;
        this.value = value;
    }

    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    public Optional<String> getSkipToken() {
        return Optional.ofNullable(this.skipToken);
    }
    /**
     * Gets a page of active connectivity configurations.
     * 
     */
    public List<ActiveConnectivityConfigurationResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListActiveConnectivityConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String skipToken;
        private @Nullable List<ActiveConnectivityConfigurationResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListActiveConnectivityConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skipToken = defaults.skipToken;
    	      this.value = defaults.value;
        }

        public Builder setSkipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }

        public Builder setValue(@Nullable List<ActiveConnectivityConfigurationResponse> value) {
            this.value = value;
            return this;
        }

        public ListActiveConnectivityConfigurationResult build() {
            return new ListActiveConnectivityConfigurationResult(skipToken, value);
        }
    }
}
