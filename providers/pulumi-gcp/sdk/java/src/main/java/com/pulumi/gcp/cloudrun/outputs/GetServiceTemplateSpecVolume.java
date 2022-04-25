// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecVolumeSecret;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecVolume {
    /**
     * @return The name of the Cloud Run Service.
     * 
     */
    private final String name;
    private final List<GetServiceTemplateSpecVolumeSecret> secrets;

    @CustomType.Constructor
    private GetServiceTemplateSpecVolume(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secrets") List<GetServiceTemplateSpecVolumeSecret> secrets) {
        this.name = name;
        this.secrets = secrets;
    }

    /**
     * @return The name of the Cloud Run Service.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<GetServiceTemplateSpecVolumeSecret> secrets() {
        return this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<GetServiceTemplateSpecVolumeSecret> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secrets = defaults.secrets;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secrets(List<GetServiceTemplateSpecVolumeSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder secrets(GetServiceTemplateSpecVolumeSecret... secrets) {
            return secrets(List.of(secrets));
        }        public GetServiceTemplateSpecVolume build() {
            return new GetServiceTemplateSpecVolume(name, secrets);
        }
    }
}
