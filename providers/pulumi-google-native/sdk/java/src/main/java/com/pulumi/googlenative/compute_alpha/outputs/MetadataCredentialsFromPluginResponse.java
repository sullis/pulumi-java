// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetadataCredentialsFromPluginResponse {
    /**
     * @return Plugin name.
     * 
     */
    private final String name;
    /**
     * @return A text proto that conforms to a Struct type definition interpreted by the plugin.
     * 
     */
    private final String structConfig;

    @CustomType.Constructor
    private MetadataCredentialsFromPluginResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("structConfig") String structConfig) {
        this.name = name;
        this.structConfig = structConfig;
    }

    /**
     * @return Plugin name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A text proto that conforms to a Struct type definition interpreted by the plugin.
     * 
     */
    public String structConfig() {
        return this.structConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataCredentialsFromPluginResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String structConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataCredentialsFromPluginResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.structConfig = defaults.structConfig;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder structConfig(String structConfig) {
            this.structConfig = Objects.requireNonNull(structConfig);
            return this;
        }        public MetadataCredentialsFromPluginResponse build() {
            return new MetadataCredentialsFromPluginResponse(name, structConfig);
        }
    }
}
