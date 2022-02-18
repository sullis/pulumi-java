// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainArgs Empty = new GetDomainArgs();

    /**
     * The domain name.
     * 
     */
    @InputImport(name="domainId", required=true)
    private final String domainId;

    public String getDomainId() {
        return this.domainId;
    }

    public GetDomainArgs(String domainId) {
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
    }

    private GetDomainArgs() {
        this.domainId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainId = defaults.domainId;
        }

        public Builder setDomainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public GetDomainArgs build() {
            return new GetDomainArgs(domainId);
        }
    }
}
