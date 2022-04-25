// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.SsisEnvironmentResponse;
import com.pulumi.azurenative.synapse.outputs.SsisFolderResponse;
import com.pulumi.azurenative.synapse.outputs.SsisPackageResponse;
import com.pulumi.azurenative.synapse.outputs.SsisProjectResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIntegrationRuntimeObjectMetadatumResult {
    /**
     * @return The link to the next page of results, if any remaining results exist.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * @return List of SSIS object metadata.
     * 
     */
    private final @Nullable List<Object> value;

    @CustomType.Constructor
    private GetIntegrationRuntimeObjectMetadatumResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") @Nullable List<Object> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * @return The link to the next page of results, if any remaining results exist.
     * 
     */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * @return List of SSIS object metadata.
     * 
     */
    public List<Object> value() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeObjectMetadatumResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeObjectMetadatumResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder value(@Nullable List<Object> value) {
            this.value = value;
            return this;
        }
        public Builder value(Object... value) {
            return value(List.of(value));
        }        public GetIntegrationRuntimeObjectMetadatumResult build() {
            return new GetIntegrationRuntimeObjectMetadatumResult(nextLink, value);
        }
    }
}
