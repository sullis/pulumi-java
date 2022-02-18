// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.ActiveRevisionsMode;
import io.pulumi.azurenative.web.inputs.IngressArgs;
import io.pulumi.azurenative.web.inputs.RegistryCredentialsArgs;
import io.pulumi.azurenative.web.inputs.SecretArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Non versioned Container App configuration properties that define the mutable settings of a Container app
 * 
 */
public final class ConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationArgs Empty = new ConfigurationArgs();

    /**
     * ActiveRevisionsMode controls how active revisions are handled for the Container app:
     * <list><item>Multiple: multiple revisions can be active. If no value if provided, this is the default</item><item>Single: Only one revision can be active at a time. Revision weights can not be used in this mode</item></list>
     * 
     */
    @InputImport(name="activeRevisionsMode")
    private final @Nullable Input<Either<String,ActiveRevisionsMode>> activeRevisionsMode;

    public Input<Either<String,ActiveRevisionsMode>> getActiveRevisionsMode() {
        return this.activeRevisionsMode == null ? Input.empty() : this.activeRevisionsMode;
    }

    /**
     * Ingress configurations.
     * 
     */
    @InputImport(name="ingress")
    private final @Nullable Input<IngressArgs> ingress;

    public Input<IngressArgs> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    /**
     * Collection of private container registry credentials for containers used by the Container app
     * 
     */
    @InputImport(name="registries")
    private final @Nullable Input<List<RegistryCredentialsArgs>> registries;

    public Input<List<RegistryCredentialsArgs>> getRegistries() {
        return this.registries == null ? Input.empty() : this.registries;
    }

    /**
     * Collection of secrets used by a Container app
     * 
     */
    @InputImport(name="secrets")
    private final @Nullable Input<List<SecretArgs>> secrets;

    public Input<List<SecretArgs>> getSecrets() {
        return this.secrets == null ? Input.empty() : this.secrets;
    }

    public ConfigurationArgs(
        @Nullable Input<Either<String,ActiveRevisionsMode>> activeRevisionsMode,
        @Nullable Input<IngressArgs> ingress,
        @Nullable Input<List<RegistryCredentialsArgs>> registries,
        @Nullable Input<List<SecretArgs>> secrets) {
        this.activeRevisionsMode = activeRevisionsMode;
        this.ingress = ingress;
        this.registries = registries;
        this.secrets = secrets;
    }

    private ConfigurationArgs() {
        this.activeRevisionsMode = Input.empty();
        this.ingress = Input.empty();
        this.registries = Input.empty();
        this.secrets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ActiveRevisionsMode>> activeRevisionsMode;
        private @Nullable Input<IngressArgs> ingress;
        private @Nullable Input<List<RegistryCredentialsArgs>> registries;
        private @Nullable Input<List<SecretArgs>> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeRevisionsMode = defaults.activeRevisionsMode;
    	      this.ingress = defaults.ingress;
    	      this.registries = defaults.registries;
    	      this.secrets = defaults.secrets;
        }

        public Builder setActiveRevisionsMode(@Nullable Input<Either<String,ActiveRevisionsMode>> activeRevisionsMode) {
            this.activeRevisionsMode = activeRevisionsMode;
            return this;
        }

        public Builder setActiveRevisionsMode(@Nullable Either<String,ActiveRevisionsMode> activeRevisionsMode) {
            this.activeRevisionsMode = Input.ofNullable(activeRevisionsMode);
            return this;
        }

        public Builder setIngress(@Nullable Input<IngressArgs> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder setIngress(@Nullable IngressArgs ingress) {
            this.ingress = Input.ofNullable(ingress);
            return this;
        }

        public Builder setRegistries(@Nullable Input<List<RegistryCredentialsArgs>> registries) {
            this.registries = registries;
            return this;
        }

        public Builder setRegistries(@Nullable List<RegistryCredentialsArgs> registries) {
            this.registries = Input.ofNullable(registries);
            return this;
        }

        public Builder setSecrets(@Nullable Input<List<SecretArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setSecrets(@Nullable List<SecretArgs> secrets) {
            this.secrets = Input.ofNullable(secrets);
            return this;
        }

        public ConfigurationArgs build() {
            return new ConfigurationArgs(activeRevisionsMode, ingress, registries, secrets);
        }
    }
}
