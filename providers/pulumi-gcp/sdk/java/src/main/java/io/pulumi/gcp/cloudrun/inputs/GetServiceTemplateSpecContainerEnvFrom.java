// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerEnvFromConfigMapRef;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerEnvFromSecretRef;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerEnvFrom extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerEnvFrom Empty = new GetServiceTemplateSpecContainerEnvFrom();

    @InputImport(name="configMapReves", required=true)
      private final List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves;

    public List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> getConfigMapReves() {
        return this.configMapReves;
    }

    @InputImport(name="prefix", required=true)
      private final String prefix;

    public String getPrefix() {
        return this.prefix;
    }

    @InputImport(name="secretReves", required=true)
      private final List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves;

    public List<GetServiceTemplateSpecContainerEnvFromSecretRef> getSecretReves() {
        return this.secretReves;
    }

    public GetServiceTemplateSpecContainerEnvFrom(
        List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves,
        String prefix,
        List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves) {
        this.configMapReves = Objects.requireNonNull(configMapReves, "expected parameter 'configMapReves' to be non-null");
        this.prefix = Objects.requireNonNull(prefix, "expected parameter 'prefix' to be non-null");
        this.secretReves = Objects.requireNonNull(secretReves, "expected parameter 'secretReves' to be non-null");
    }

    private GetServiceTemplateSpecContainerEnvFrom() {
        this.configMapReves = List.of();
        this.prefix = null;
        this.secretReves = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvFrom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves;
        private String prefix;
        private List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnvFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapReves = defaults.configMapReves;
    	      this.prefix = defaults.prefix;
    	      this.secretReves = defaults.secretReves;
        }

        public Builder setConfigMapReves(List<GetServiceTemplateSpecContainerEnvFromConfigMapRef> configMapReves) {
            this.configMapReves = Objects.requireNonNull(configMapReves);
            return this;
        }

        public Builder setPrefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }

        public Builder setSecretReves(List<GetServiceTemplateSpecContainerEnvFromSecretRef> secretReves) {
            this.secretReves = Objects.requireNonNull(secretReves);
            return this;
        }
        public GetServiceTemplateSpecContainerEnvFrom build() {
            return new GetServiceTemplateSpecContainerEnvFrom(configMapReves, prefix, secretReves);
        }
    }
}