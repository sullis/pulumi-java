// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDomainConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainConfigurationArgs Empty = new GetDomainConfigurationArgs();

    @InputImport(name="domainConfigurationName", required=true)
    private final String domainConfigurationName;

    public String getDomainConfigurationName() {
        return this.domainConfigurationName;
    }

    public GetDomainConfigurationArgs(String domainConfigurationName) {
        this.domainConfigurationName = Objects.requireNonNull(domainConfigurationName, "expected parameter 'domainConfigurationName' to be non-null");
    }

    private GetDomainConfigurationArgs() {
        this.domainConfigurationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainConfigurationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainConfigurationName = defaults.domainConfigurationName;
        }

        public Builder setDomainConfigurationName(String domainConfigurationName) {
            this.domainConfigurationName = Objects.requireNonNull(domainConfigurationName);
            return this;
        }

        public GetDomainConfigurationArgs build() {
            return new GetDomainConfigurationArgs(domainConfigurationName);
        }
    }
}
