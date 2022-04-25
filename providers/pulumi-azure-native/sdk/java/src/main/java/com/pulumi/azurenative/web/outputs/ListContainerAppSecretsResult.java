// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ContainerAppSecretResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListContainerAppSecretsResult {
    /**
     * @return Collection of resources.
     * 
     */
    private final List<ContainerAppSecretResponse> value;

    @CustomType.Constructor
    private ListContainerAppSecretsResult(@CustomType.Parameter("value") List<ContainerAppSecretResponse> value) {
        this.value = value;
    }

    /**
     * @return Collection of resources.
     * 
     */
    public List<ContainerAppSecretResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListContainerAppSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ContainerAppSecretResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListContainerAppSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(List<ContainerAppSecretResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(ContainerAppSecretResponse... value) {
            return value(List.of(value));
        }        public ListContainerAppSecretsResult build() {
            return new ListContainerAppSecretsResult(value);
        }
    }
}
