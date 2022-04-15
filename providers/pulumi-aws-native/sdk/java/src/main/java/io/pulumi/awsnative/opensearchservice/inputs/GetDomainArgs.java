// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainArgs Empty = new GetDomainArgs();

    @Import(name="domainName", required=true)
      private final String domainName;

    public String domainName() {
        return this.domainName;
    }

    public GetDomainArgs(String domainName) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
    }

    private GetDomainArgs() {
        this.domainName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }        public GetDomainArgs build() {
            return new GetDomainArgs(domainName);
        }
    }
}
