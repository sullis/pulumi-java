// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecContainerEnvFromConfigMapRef {
    private final List<GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference> localObjectReferences;
    private final Boolean optional;

    @CustomType.Constructor
    private GetServiceTemplateSpecContainerEnvFromConfigMapRef(
        @CustomType.Parameter("localObjectReferences") List<GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference> localObjectReferences,
        @CustomType.Parameter("optional") Boolean optional) {
        this.localObjectReferences = localObjectReferences;
        this.optional = optional;
    }

    public List<GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference> getLocalObjectReferences() {
        return this.localObjectReferences;
    }
    public Boolean getOptional() {
        return this.optional;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvFromConfigMapRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference> localObjectReferences;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnvFromConfigMapRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReferences = defaults.localObjectReferences;
    	      this.optional = defaults.optional;
        }

        public Builder localObjectReferences(List<GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference> localObjectReferences) {
            this.localObjectReferences = Objects.requireNonNull(localObjectReferences);
            return this;
        }
        public Builder localObjectReferences(GetServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference... localObjectReferences) {
            return localObjectReferences(List.of(localObjectReferences));
        }
        public Builder optional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }        public GetServiceTemplateSpecContainerEnvFromConfigMapRef build() {
            return new GetServiceTemplateSpecContainerEnvFromConfigMapRef(localObjectReferences, optional);
        }
    }
}
