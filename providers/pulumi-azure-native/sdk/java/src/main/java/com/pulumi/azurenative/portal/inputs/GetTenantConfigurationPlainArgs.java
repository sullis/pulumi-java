// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTenantConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTenantConfigurationPlainArgs Empty = new GetTenantConfigurationPlainArgs();

    /**
     * The configuration name. Value must be &#39;default&#39;
     * 
     */
    @Import(name="configurationName", required=true)
    private String configurationName;

    /**
     * @return The configuration name. Value must be &#39;default&#39;
     * 
     */
    public String configurationName() {
        return this.configurationName;
    }

    private GetTenantConfigurationPlainArgs() {}

    private GetTenantConfigurationPlainArgs(GetTenantConfigurationPlainArgs $) {
        this.configurationName = $.configurationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTenantConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTenantConfigurationPlainArgs $;

        public Builder() {
            $ = new GetTenantConfigurationPlainArgs();
        }

        public Builder(GetTenantConfigurationPlainArgs defaults) {
            $ = new GetTenantConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName The configuration name. Value must be &#39;default&#39;
         * 
         * @return builder
         * 
         */
        public Builder configurationName(String configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        public GetTenantConfigurationPlainArgs build() {
            $.configurationName = Objects.requireNonNull($.configurationName, "expected parameter 'configurationName' to be non-null");
            return $;
        }
    }

}
