// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef Empty = new GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef();

    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * The name of the Cloud Run Service.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef(
        String key,
        String name) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef() {
        this.key = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef build() {
            return new GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef(key, name);
        }
    }
}
