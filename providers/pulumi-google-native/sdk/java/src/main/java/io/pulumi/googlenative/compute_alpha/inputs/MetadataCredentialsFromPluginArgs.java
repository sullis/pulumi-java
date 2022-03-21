// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] Custom authenticator credentials. Custom authenticator credentials.
 * 
 */
public final class MetadataCredentialsFromPluginArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataCredentialsFromPluginArgs Empty = new MetadataCredentialsFromPluginArgs();

    /**
     * Plugin name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A text proto that conforms to a Struct type definition interpreted by the plugin.
     * 
     */
    @Import(name="structConfig")
      private final @Nullable Output<String> structConfig;

    public Output<String> getStructConfig() {
        return this.structConfig == null ? Output.empty() : this.structConfig;
    }

    public MetadataCredentialsFromPluginArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> structConfig) {
        this.name = name;
        this.structConfig = structConfig;
    }

    private MetadataCredentialsFromPluginArgs() {
        this.name = Output.empty();
        this.structConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataCredentialsFromPluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> structConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataCredentialsFromPluginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.structConfig = defaults.structConfig;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder structConfig(@Nullable Output<String> structConfig) {
            this.structConfig = structConfig;
            return this;
        }
        public Builder structConfig(@Nullable String structConfig) {
            this.structConfig = Output.ofNullable(structConfig);
            return this;
        }        public MetadataCredentialsFromPluginArgs build() {
            return new MetadataCredentialsFromPluginArgs(name, structConfig);
        }
    }
}
