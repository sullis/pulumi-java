// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1.inputs.ConfigMapKeySelectorArgs;
import io.pulumi.googlenative.run_v1.inputs.SecretKeySelectorArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EnvVarSource represents a source for the value of an EnvVar.
 * 
 */
public final class EnvVarSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvVarSourceArgs Empty = new EnvVarSourceArgs();

    /**
     * (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
     * 
     */
    @Import(name="configMapKeyRef")
      private final @Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef;

    public Output<ConfigMapKeySelectorArgs> getConfigMapKeyRef() {
        return this.configMapKeyRef == null ? Output.empty() : this.configMapKeyRef;
    }

    /**
     * (Optional) Selects a key (version) of a secret in Secret Manager.
     * 
     */
    @Import(name="secretKeyRef")
      private final @Nullable Output<SecretKeySelectorArgs> secretKeyRef;

    public Output<SecretKeySelectorArgs> getSecretKeyRef() {
        return this.secretKeyRef == null ? Output.empty() : this.secretKeyRef;
    }

    public EnvVarSourceArgs(
        @Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef,
        @Nullable Output<SecretKeySelectorArgs> secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.secretKeyRef = secretKeyRef;
    }

    private EnvVarSourceArgs() {
        this.configMapKeyRef = Output.empty();
        this.secretKeyRef = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef;
        private @Nullable Output<SecretKeySelectorArgs> secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapKeyRef = defaults.configMapKeyRef;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder configMapKeyRef(@Nullable Output<ConfigMapKeySelectorArgs> configMapKeyRef) {
            this.configMapKeyRef = configMapKeyRef;
            return this;
        }
        public Builder configMapKeyRef(@Nullable ConfigMapKeySelectorArgs configMapKeyRef) {
            this.configMapKeyRef = Output.ofNullable(configMapKeyRef);
            return this;
        }
        public Builder secretKeyRef(@Nullable Output<SecretKeySelectorArgs> secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }
        public Builder secretKeyRef(@Nullable SecretKeySelectorArgs secretKeyRef) {
            this.secretKeyRef = Output.ofNullable(secretKeyRef);
            return this;
        }        public EnvVarSourceArgs build() {
            return new EnvVarSourceArgs(configMapKeyRef, secretKeyRef);
        }
    }
}
