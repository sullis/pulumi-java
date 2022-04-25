// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef Empty = new GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef();

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * The name of the Cloud Run Service.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Cloud Run Service.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef() {}

    private GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef(GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef $) {
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef $;

        public Builder() {
            $ = new GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef();
        }

        public Builder(GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef defaults) {
            $ = new GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param name The name of the Cloud Run Service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetServiceTemplateSpecContainerEnvValueFromSecretKeyRef build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
