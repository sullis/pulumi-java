// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ContainerAppSecretResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListContainerAppSecretsResult {
    /**
     * Collection of resources.
     * 
     */
    private final List<ContainerAppSecretResponse> value;

    @OutputCustomType.Constructor({"value"})
    private ListContainerAppSecretsResult(List<ContainerAppSecretResponse> value) {
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Collection of resources.
     * 
     */
    public List<ContainerAppSecretResponse> getValue() {
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

        public Builder setValue(List<ContainerAppSecretResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public ListContainerAppSecretsResult build() {
            return new ListContainerAppSecretsResult(value);
        }
    }
}
